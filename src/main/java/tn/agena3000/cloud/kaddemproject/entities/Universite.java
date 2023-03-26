package tn.agena3000.cloud.kaddemproject.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table( name = "universite")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Universite {

    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idUniv;
    private String nomUniv;
    @OneToMany(mappedBy = "universite")
    private List<Departement> departements = new ArrayList<>();

}