package fr.moon.springconfiguration.service;

import fr.moon.springconfiguration.dao.DaoPersonImpl;
import fr.moon.springconfiguration.model.Personne;

import java.sql.SQLOutput;
import java.util.Collection;

public class ServicePersonImpl implements IService{

    private DaoPersonImpl daoPerson;
    private String localisation;



    public DaoPersonImpl getDaoPerson() {
        return daoPerson;
    }

    public void setDaoPerson(DaoPersonImpl daoPerson) {
        this.daoPerson = daoPerson;
        System.out.println("PersonnServiceImpl : Setter DaoPersonImpl");
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
        System.out.println("Setter de la localisation");
    }




    public ServicePersonImpl(){
        System.out.println("PersonnServiceImpl :  constructeur par defaut");
    }



    @Override
    public void create(Personne p) {
        daoPerson.create(p);
    }

    @Override
    public void delete(Personne p) {
        daoPerson.delete(p);
    }

    @Override
    public Collection<Personne> findAll() {
        return daoPerson.findAll();
    }

    @Override
    public Personne find(Long id) {
        return daoPerson.find(id);
    }
}
