package it.addon.bigdata.services;

import it.addon.bigdata.data.datasource.HibernateClient;
import org.hibernate.SessionFactory;

public abstract class AbstractService {
    protected final SessionFactory sessionFactory;

    public AbstractService() {
        this.sessionFactory = HibernateClient.getSessionFactory();
    }
}
