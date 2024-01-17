package it.addon.bigdata.data.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class UserInformations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idInformations;

    @Column(name = "email")
    private String email;
    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "idUser")
    private User user;
}
