package com.example.microserviziocorso.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
public class Corso {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nomeCorso;

    private String durataCorso;

    private Date dataDiInizio;

    private Date dataDiFine;

    private  String nomeCognomeDocente;


}
