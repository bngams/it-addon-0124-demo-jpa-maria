package it.addon.bigdata.data.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="Internaute")
public class Internaute {
    @Id
    private String email;

    @Column(name="nom")
    private String nom;
    @Column(name="prenom")
    private String prenom;

    @Embedded
    @AttributeOverrides(
       @AttributeOverride(name="rue1", column = @Column(name="rue"))
    )
    private Adresse adresse;
}
