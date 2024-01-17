package it.addon.bigdata;

import it.addon.bigdata.services.FilmService;
import it.addon.bigdata.services.PaysService;

public class Main {
    public static void main(String[] args) {
        PaysService paysService = new PaysService();
        paysService.findAllPays();

        FilmService filmService = new FilmService();
        filmService.findAllFilm();
        filmService.findAllFilm();
    }
}