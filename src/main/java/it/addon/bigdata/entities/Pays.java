package it.addon.bigdata.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Lombok
@Data
@NoArgsConstructor
@AllArgsConstructor

// JPA
@Entity
@Table(name="Pays")
public class Pays  {
    @Id
    String code;

    @Column(name = "nom")
    String nom;

    @Column(name = "langue")
    String langue;
}
