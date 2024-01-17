package it.addon.bigdata.data.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="code_pays")
    Pays pays;
}
