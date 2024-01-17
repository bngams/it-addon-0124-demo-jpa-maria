package it.addon.bigdata.services;

import it.addon.bigdata.data.entities.Film;
import jakarta.persistence.Query;

import java.util.List;

public class FilmService extends AbstractService {

    public FilmService() {
        super();
    }

    /**
     * Hibernate HQL query example
     */
    public void findAllFilm() {
        this.sessionFactory.inTransaction(session -> {
            List<Film> films = session.createSelectionQuery("from Film", Film.class).getResultList();
            System.out.println(films);
        });
    }

    /**
     * Hibernate custom HQL query with params example
     * @param titre
     */
    public void findAllFilmParTitre(String titre) {
        this.sessionFactory.inTransaction(session -> {
            Query q = session.createQuery("from Film f where f.titre = :titre", Film.class);
            q.setParameter("titre", titre);
            List<Film> films = q.getResultList();
            System.out.println(films);
        });
    }

    /**
     * Hibernate/JPA custom Native query with params example
     * @param annee
     */
    public void findAllFilmParAnnee(Integer annee) {
        this.sessionFactory.inTransaction(session -> {
            String sql = "SELECT * FROM Film AS F WHERE F.annee = ?";
            Query q = session.createNativeQuery(sql, Film.class);
            q.setParameter(1, annee);
            List<Film> films = q.getResultList();
            System.out.println(films);
        });
    }
}
