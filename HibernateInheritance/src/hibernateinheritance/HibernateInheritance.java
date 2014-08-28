/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernateinheritance;

import OneTablePerClassHierarchy.E2;
import OneTablePerClassHierarchy.E3;
import TablePerEntity.D2;
import TablePerEntity.D3;
import UnionSubclass.C1;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author sanketnayak
 */
public class HibernateInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        Transaction t = session.beginTransaction();
        
//        C2 c = new C2(1,5,10,15,20);
//        C3 d = new C3(2,7,14,21,28);
//        
//           D2 obj1= new D2(1,5,10,15,20);
//           D3 obj2= new D3(2,7,14,21,28);
//        
//           session.save(obj1);
           D2 c = (D2)session.get(D2.class, 1);
           
          System.out.println(c);
//        
           t.commit();
        
        
    }
    
}
