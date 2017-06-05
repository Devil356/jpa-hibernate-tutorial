package com.bobocode.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
    private static EntityManagerFactory emf;

    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }

    public static void init() {
        emf = Persistence.createEntityManagerFactory("bobocode");
    }

    public static void destroy() {
        emf.close();
    }


//    private static Map getPropertiesMap() {
//        Map<String, String> properties = new HashMap<>();
//
//        properties.put("hibernate.connection.url", "jdbc:postgresql://localhost:5432/bobocode_db");
//        properties.put("hibernate.connection.driver_class", "org.postgresql.Driver");
//        properties.put("hibernate.connection.username", "bobouser");
//        properties.put("hibernate.connection.password", "bobopass");
//        properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQL9Dialect");
//        properties.put("hibernate.hbm2ddl.auto", "create");
//
//        return properties;
//    }
}
