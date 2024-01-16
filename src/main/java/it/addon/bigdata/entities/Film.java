package it.addon.bigdata.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Film {

    @Id
    private Integer id;

    @Column
    String titre;

    @Column
    Integer annee;

    @ManyToOne
    @JoinColumn (name="code_pays")
    Pays pays;
}
