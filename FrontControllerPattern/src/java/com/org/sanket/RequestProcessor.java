package com.org.sanket;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sanketnayak
 */
public class RequestProcessor {
    
    public void init(HttpServletRequest request) {
        
        Map<String,HighCommand> mapper = new HashMap<String,HighCommand>();
        mapper.put("action1", new Command1());
        mapper.put("action2", new Command2());
        mapper.put("action3", new Command3());
        
        ServletContext sc = request.getSession().getServletContext();
        sc.setAttribute("map", mapper);
        
    }
    
    public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        init(request);
                
        Map<String,String> pathMap = new HashMap<String, String>();
        
        File fXmlFile = new File("/Users/sanketnayak/Desktop/GIT/FrontControllerPattern/web/config.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(fXmlFile);
        
        String action = request.getRequestURI().substring(request.getRequestURI().lastIndexOf("/")+1, request.getRequestURI().length()-3);
        
        NodeList nList = doc.getElementsByTagName(action);
        
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                
                pathMap.put(eElement.getElementsByTagName("path"+(temp+1)).item(0).getNodeName(),eElement.getElementsByTagName("path"+(temp+1)).item(temp).getTextContent() );
            }
        }
        
         ServletContext sc = request.getSession().getServletContext();
         
         Map<String,HighCommand> mapper = (Map<String,HighCommand>) sc.getAttribute("map");
        
         HighCommand currentCommand = (HighCommand) mapper.get(action);
         
         return currentCommand.execute(request, response, pathMap);
         
    }
}