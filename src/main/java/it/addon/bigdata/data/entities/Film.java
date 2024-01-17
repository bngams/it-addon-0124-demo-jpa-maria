package it.addon.bigdata.data.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "Film")
public class Film {

    @Id
    private Integer id;

    @Column
    String titre;

    @Column
    Integer annee;

    @ManyToOne
    @JoinColumn(name="code_pays")
    Pays pays;


    /**
     * Realisateur
     */
    @ManyToOne
    @JoinColumn(name="id_realisateur")
    Artiste realisateur;


    /**
     * Acteurs
     */
    @ManyToMany
    @JoinTable(name="Role",
            joinColumns = @JoinColumn(name="id_film"),
            inverseJoinColumns = @JoinColumn(name="id_acteur"))
    List<Artiste> acteurs;


    /**
     * Autre possibilité de mapping avec Roles
     */
    /*
    @OneToMany
    @JoinColumn(name="id_film")
    List<Roles> roles;
    */


}
