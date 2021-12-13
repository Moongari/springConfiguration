package fr.moon.formation.service;

import fr.moon.formation.model.Formation;

import java.util.Collection;

public interface IFormationService {

    void create(Formation f);

    void update(Formation f);

    void delete(Formation f);

    Collection<Formation> findAll();

    Formation find(Long id);
}
