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
    private String region;

    @Column(name = "code_postal")
    private String codePostal;

    private String ville;

    private String rue1;

    private String rue2;
}
