package it.addon.bigdata;

import it.addon.bigdata.entities.Artiste;
import it.addon.bigdata.entities.Pays;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        try {
            StandardServiceRegistry registry = new StandardServiceRegistryBuilder().build();

            SessionFactory sessionFactory = new MetadataSources(registry)
                    .addAnnotatedClass(Pays.class)
                    .addAnnotatedClass(Artiste.class)
                    .buildMetadata()
                    .buildSessionFactory();

            sessionFactory.inTransaction(session -> {
                session.persist(new Pays("CM", "Cameroun", "fr"));
            });

            sessionFactory.inTransaction(session -> {
                List<Pays> pays = session.createSelectionQuery("from Pays", Pays.class).getResultList();
                System.out.println(pays);
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}