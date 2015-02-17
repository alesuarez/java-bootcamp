package com.carshop.util;


import java.io.File;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author teno
 */
@SuppressWarnings({ "unused", "deprecation" })
public class HibernateUtil {

 private static final SessionFactory sessionFactory;
  
    static {
        try {
            // Si no ponemos fichero, intenta cargar "/hibernate.cfg.xml" en el
            // raiz
            sessionFactory = new AnnotationConfiguration().configure(
                    new File("hibernate.cfg.xml")).buildSessionFactory();
        } catch (Throwable ex) {
            // Log exception!
            throw new ExceptionInInitializerError(ex);
        }
    }
  
    public static SessionFactory getSessionFactory() throws HibernateException {
        return sessionFactory;
    }
     
}

