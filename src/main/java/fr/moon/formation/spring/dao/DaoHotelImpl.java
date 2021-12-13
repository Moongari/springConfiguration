package fr.moon.formation.spring.dao;

import fr.moon.formation.spring.model.Hotel;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class DaoHotelImpl implements IDao{


    private Set<Hotel> hotelSet = new HashSet<>();

    public DaoHotelImpl(){
        System.out.println("DaoImpl : constructeur par defaut");
    }



    @Override
    public void createOrder(Hotel h) {
        hotelSet.add(h);
    }

    @Override
    public void deleteOrder(Hotel h) {
        hotelSet.remove(h);
    }

    @Override
    public void updateOrder(Hotel h) {
    Hotel hotel = hotelSet.stream().filter(hotel1 -> h.equals(hotel1.getId())).findFirst().orElseThrow(()-> new IllegalArgumentException("aucun hotel a ce nom"));
    hotel.setName(h.getName());
    hotel.setAdresse(h.getAdresse());
    hotel.setCountry(h.getCountry());
    hotel.setNbrOfPlace(h.getNbrOfPlace());
    }

    @Override
    public Collection<Hotel> findAll() {
        return null;
    }

    @Override
    public Hotel find(long id) {
        return null;
    }
}
