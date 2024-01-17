package it.addon.bigdata.data.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Embeddable
public class Adresse {
    // @Column(name = "region") => implicit
    String region;

    @Column(name = "code_postal")
    String codePostal;

    String ville;

    String rue1;

    String rue2;
}
