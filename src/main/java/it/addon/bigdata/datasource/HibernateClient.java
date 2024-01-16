package it.addon.bigdata.datasource;

import it.addon.bigdata.entities.Artiste;
import it.addon.bigdata.entities.Pays;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateClient {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        // if no existing connexion
        if(sessionFactory == null) {
            // then create connexion
            StandardServiceRegistry registry = new StandardServiceRegistryBuilder().build();

            sessionFactory = new MetadataSources(registry)
                    .addAnnotatedClass(Pays.class)
                    .addAnnotatedClass(Artiste.class)
                    .buildMetadata()
                    .buildSessionFactory();
        }

        // je renvoie la connexion
        return sessionFactory;
    }
}
