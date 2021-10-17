package app;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import util.Util;

public class Main {
    public static void main(String[]args){
        Session session = Util.getSessionFactory().openSession();

        session.beginTransaction();

        session.getTransaction().commit();
        Util.shutdown();
    }
}
