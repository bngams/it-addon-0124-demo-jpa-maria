package it.addon.bigdata.services;

import it.addon.bigdata.datasource.HibernateClient;
import it.addon.bigdata.entities.Pays;
import org.hibernate.SessionFactory;

import java.util.List;

public class PaysService {
    private final SessionFactory sessionFactory;

    public PaysService() {
        this.sessionFactory = HibernateClient.getSessionFactory();
    }

    public void insertPays() {
        this.sessionFactory.inTransaction(session -> {
            session.persist(new Pays("CM", "Cameroun", "fr"));
        });
    }

    public void findAllPays() {
        this.sessionFactory.inTransaction(session -> {
            List<Pays> pays = session.createSelectionQuery("from Pays", Pays.class).getResultList();
            System.out.println(pays);
        });
    }
}
