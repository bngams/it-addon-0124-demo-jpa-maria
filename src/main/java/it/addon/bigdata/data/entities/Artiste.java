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
@Table(name="Artiste")
public class Artiste {
    @Id
    private Integer id;

    @Column
    private String nom;

    @Column
    private String prenom;

    @Column(name="annee_naissance")
    private Integer anneeNaissance;

    /*
    @OneToMany(targetEntity = Film.class, mappedBy = "realisateur")
    private List<Film> filmsRealises;
     */

    // @ManyToMany(mappedBy = "acteurs")
    /* @ManyToMany
    @JoinTable(name="Role",
            joinColumns = @JoinColumn(name="id_acteur"),
            inverseJoinColumns = @JoinColumn(name = "id_film"))
    private List<Film> filmsJoues;*/
}
