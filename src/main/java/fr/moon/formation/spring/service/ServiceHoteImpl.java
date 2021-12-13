package fr.moon.formation.spring.service;

import fr.moon.formation.spring.dao.DaoHotelImpl;
import fr.moon.formation.spring.model.Hotel;

import java.util.Collection;

public class ServiceHoteImpl implements IService{


    private DaoHotelImpl daoHotel;

    public DaoHotelImpl getDaoHotel() {
        return daoHotel;
    }

    public void setDaoHotel(DaoHotelImpl daoHotel) {
        this.daoHotel = daoHotel;
        System.out.println("ServiceHotel impl : setter Dao Hotal");
    }

    public String getNbreEtoiles() {
        return nbreEtoiles;
    }

    public void setNbreEtoiles(String nbreEtoiles) {
        this.nbreEtoiles = nbreEtoiles;
        System.out.println("ServiceHotel impl : Nbre d'etoiles ");
    }

    private String nbreEtoiles;


    public ServiceHoteImpl(){
        System.out.println("ServiceHotel Impl : constructeur default");
    }

    public ServiceHoteImpl(final DaoHotelImpl daoHotel){
        System.out.println("constructeur avec arguments");
    }

    @Override
    public void createOrder(Hotel h) {
        daoHotel.createOrder(h);

    }

    @Override
    public void deleteOrder(Hotel h) {
    daoHotel.deleteOrder(h);
    }

    @Override
    public void updateOrder(Hotel h) {
       daoHotel.updateOrder(h);
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
