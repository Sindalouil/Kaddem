package tn.agena3000.cloud.kaddemproject.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.*;

@Table ( name = "contrat")
@Entity
@Getter
@Setter
public class Contrat implements List<Contrat> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrat;
    private LocalDate dateDebutContrat;
    private LocalDate dateFinContrat;
    private boolean archive;
    private int montantContrat;
@ManyToOne
private Etudiant etudiant;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Contrat> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Contrat contrat) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Contrat> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Contrat> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Contrat get(int index) {
        return null;
    }

    @Override
    public Contrat set(int index, Contrat element) {
        return null;
    }

    @Override
    public void add(int index, Contrat element) {

    }

    @Override
    public Contrat remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Contrat> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Contrat> listIterator(int index) {
        return null;
    }

    @Override
    public List<Contrat> subList(int fromIndex, int toIndex) {
        return null;
    }
}
