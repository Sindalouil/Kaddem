package tn.agena3000.cloud.kaddemproject.entities;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table( name = "equipe")
@Entity
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEquipe;
    private String nomEquipe;

    @Enumerated(EnumType.STRING)
    private Niveau niveau;
@ManyToMany(mappedBy = "equipes")
    private List<Etudiant> etudiants = new ArrayList<>();
@OneToOne
    private DetailEquipe details;
}