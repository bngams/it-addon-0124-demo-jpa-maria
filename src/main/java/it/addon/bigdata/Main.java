package it.addon.bigdata;

import it.addon.bigdata.datasource.HibernateClient;
import it.addon.bigdata.entities.Artiste;
import it.addon.bigdata.entities.Pays;
import it.addon.bigdata.services.PaysService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        PaysService paysService = new PaysService();
        paysService.findAllPays();
    }
}