package tn.agena3000.cloud.kaddemproject.entities;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table( name = "etudiant")
@Entity
@Getter
@Setter
public class Etudiant {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEtudiant;
    private String prenomE;
    private String nomE;
@OneToMany(mappedBy = "etudiant")
    private List<Contrat> contrats = new ArrayList<>();
    @Enumerated(EnumType.STRING)
    private Option option;
    @ManyToOne
    private Departement departement;
    @ManyToMany()
    private List<Equipe> equipes = new ArrayList<>();

}