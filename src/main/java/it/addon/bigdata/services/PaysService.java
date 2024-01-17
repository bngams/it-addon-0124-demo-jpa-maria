package it.addon.bigdata.services;

import it.addon.bigdata.data.datasource.HibernateClient;
import it.addon.bigdata.data.entities.Pays;
import org.hibernate.SessionFactory;

import java.util.List;

public class PaysService extends AbstractService {
    public PaysService() {
        super();
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
