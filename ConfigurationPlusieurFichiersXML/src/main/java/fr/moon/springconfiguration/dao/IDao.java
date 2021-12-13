package fr.moon.springconfiguration.dao;

import fr.moon.springconfiguration.model.Personne;

import java.util.Collection;

public interface IDao {

    void create(Personne p);
    void delete(Personne p);
    Collection<Personne> findAll();
    Personne find(Long id);
}
