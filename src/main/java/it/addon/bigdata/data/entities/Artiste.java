package it.addon.bigdata.data.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name="Artiste")
public class Artiste {
    @EqualsAndHashCode.Include
    @Id
    private Integer id;

    @Column
    private String nom;

    @Column
    private String prenom;

    @Column(name="annee_naissance")
    private Integer anneeNaissance;

    @OneToMany(targetEntity = Film.class, mappedBy = "realisateur")
    private List<Film> filmsRealises;


    // @ManyToMany(mappedBy = "acteurs")
    /* @ManyToMany
    @JoinTable(name="Role",
            joinColumns = @JoinColumn(name="id_acteur"),
            inverseJoinColumns = @JoinColumn(name = "id_film"))
    private List<Film> filmsJoues;*/

    @Override
    public String toString() {
        String films = "";
        for (Film film : filmsRealises) {
            films += film.getId() + " " + film.getTitre() + ";";
        }
        return "Artiste{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", anneeNaissance=" + anneeNaissance +
                ", filmsRealises=" + films +
                '}';
    }
}
