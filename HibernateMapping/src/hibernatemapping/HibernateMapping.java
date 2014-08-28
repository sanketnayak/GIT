/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernatemapping;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author sanketnayak
 */
public class HibernateMapping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        Transaction t = session.beginTransaction();
        
        HAddress hAdd = new HAddress("Parel","Mumbai");
        WAddress wAdd = new WAddress("Seattle","Washington");
        
        MobileDetails md1 = new MobileDetails("At&T","3015263051");
        MobileDetails md2 = new MobileDetails("T-Mobile","3015263054");
        
//        User user = new User(1,"Sanket","Nayak",hAdd,wAdd,md1,md2);
//        
//        session.save(user);
        
//        User user = (User) session.get(User.class,1);
//        
//        System.out.println(user);
//        
        Query q1 = session.createSQLQuery("Select * from User").addEntity(User.class);
        List<Object> user = q1.list();
        for(Object u: user) {
        System.out.println(u);
        }
        t.commit();
        
        session.close();
    }
    
}
