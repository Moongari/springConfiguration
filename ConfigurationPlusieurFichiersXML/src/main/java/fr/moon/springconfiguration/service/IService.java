package fr.moon.springconfiguration.service;

import fr.moon.springconfiguration.model.Personne;

import java.util.Collection;

public interface IService {


    void create(Personne p);
    void delete(Personne p);
    Collection<Personne> findAll();
    Personne find(Long id);

}
