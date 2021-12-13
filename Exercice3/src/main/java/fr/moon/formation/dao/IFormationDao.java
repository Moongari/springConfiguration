package fr.moon.formation.dao;

import fr.moon.formation.model.Formation;

import java.util.Collection;

public interface IFormationDao {

    void create(Formation f);

    void update(Formation f);

    void delete(Formation f);

    Collection<Formation> findAll();

    Formation find(Long id);


}
