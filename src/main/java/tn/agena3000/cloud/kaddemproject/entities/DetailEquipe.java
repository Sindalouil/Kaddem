package tn.agena3000.cloud.kaddemproject.entities;

import javax.persistence.*;

@Table( name = "detailEquipe")
@Entity
public class DetailEquipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetailEquipe;
    private int salle;
    private String thematique;
@OneToOne
    private Equipe equipe ;
}