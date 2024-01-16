package it.addon.bigdata.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}
