package fr.moon.formation.spring.dao;

import fr.moon.formation.spring.model.Hotel;

import java.util.Collection;

public interface IDao {
    void createOrder(Hotel h);
    void deleteOrder(Hotel h);
    void updateOrder(Hotel h);

    Collection<Hotel> findAll();

    Hotel find(long id);
}
