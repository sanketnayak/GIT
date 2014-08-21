/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate_s3e1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author sanketnayak
 */
public class Hibernate_S3E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        Transaction transaction = session.beginTransaction();
        point pt1 = new point(1,5,6);
        point pt2 = new point(2,10,12);
        
//        session.save(pt1);
//        session.save(pt2);
        
        transaction.commit();
        
        point p = ((point)session.get(point.class, 1));
        System.out.println(p.getX()+ "  "+p.getY());
        
    }
    
}
