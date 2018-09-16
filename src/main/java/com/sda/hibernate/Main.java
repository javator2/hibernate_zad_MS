package com.sda.hibernate;

import com.sda.hibernate.entity.Category;
import com.sda.hibernate.entity.Job;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    private static final SessionFactory sessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();
            sessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() {
        return sessionFactory.openSession();
    }


    public static void main(String[] args) {
        Session session = getSession();
        Transaction tx = session.getTransaction();
        Job job =new Job(
                "Fizyczna",
                "IFCO",
                "Logo",
                "ifco.com",
                "operator",
                "praca przy maszynie",
                "telefonicznie",
                "as123",
                "publiczne",
                "tak",
                "dasdas",
                "dasdasd",
                "dasdasd",
                "dasdasd",
                new Category("pelny etat")
        );
        tx.begin();

        session.save(job);

        tx.commit();
        session.close();
    }
}
