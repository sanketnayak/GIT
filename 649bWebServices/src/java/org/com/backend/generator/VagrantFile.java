/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.com.backend.generator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author sanketnayak
 */
public class VagrantFile {
    
    public static void VigrantFileGenerator(String name, String os, boolean java, boolean tomcat, 
             boolean mysql, boolean ruby, boolean perl, String ip) throws IOException {
        
        Runtime.getRuntime().exec("mkdir /Users/sanketnayak/"+name);
        //Runtime.getRuntime().exec("sudo rm -rf /Applications/apache-tomcat-7.0.55/bin/vagrant.sh");
        Runtime.getRuntime().exec("touch /Users/sanketnayak/"+name+"/VagrantFile");

        PrintWriter VagrantFile = new PrintWriter("/Users/sanketnayak/"+name+"/VagrantFile", "UTF-8");
        VagrantFile.println("VAGRANTFILE_API_VERSION = \"2\"");
        VagrantFile.println("Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|");
        VagrantFile.println("config.omnibus.chef_version = :latest");
        VagrantFile.println("config.vm.box = \"" + os + "\"");
        VagrantFile.println("config.vm.network \"private_network\", ip: \""+ ip + "\"");
        VagrantFile.println("config.vm.provision \"chef_solo\" do |chef|");
        VagrantFile.println("chef.cookbooks_path = \"/var/chef/cookbooks1\"");
        VagrantFile.println("chef.add_recipe \"apt\"");
        if(java || tomcat){
            VagrantFile.println("chef.add_recipe \"java\"");
        } 
        if(tomcat)  {
            VagrantFile.println("chef.add_recipe \"tomcat\"");
        }
        if(ruby)  {
            VagrantFile.println("chef.add_recipe \"ruby\"");
        }
        if(mysql)  {
            VagrantFile.println("chef.add_recipe \"mysql::server\"");
            VagrantFile.println("chef.add_recipe \"mysql::client\"");
        }
        if(perl)  {
            VagrantFile.println("chef.add_recipe \"perl\"");
        }
        VagrantFile.println("end");
        VagrantFile.println("end");
        VagrantFile.close();
        PrintWriter VagrantSh = new PrintWriter("/Users/sanketnayak/"+name+"/vagrant.sh", "UTF-8");
        VagrantSh.println("#!/bin/bash");
        VagrantSh.println("cd /Users/sanketnayak/" + name);
        VagrantSh.println("sudo vagrant up");
        VagrantSh.close();
    }
    
}
