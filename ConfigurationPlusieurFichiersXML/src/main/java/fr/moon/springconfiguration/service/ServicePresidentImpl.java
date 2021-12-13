package fr.moon.springconfiguration.service;

import fr.moon.springconfiguration.dao.DaoPersonImpl;
import fr.moon.springconfiguration.model.Personne;

import java.util.Collection;

public class ServicePresidentImpl implements IService{


   private DaoPersonImpl daoPerson;
    private String nameofCountry;



    public ServicePresidentImpl(){
        System.out.println("ServicePresidentImpl : constructeur par Defaut");
    }



    public DaoPersonImpl getDaoPresident() {
        return daoPerson;
    }

    public void setDaoPerson(DaoPersonImpl daoPerson) {
        this.daoPerson = daoPerson;
        System.out.println("Setter ServicePredisent : DaoImpl");
    }

    public String getNameofCountry() {
        return nameofCountry;
    }

    public void setNameofCountry(String nameofCountry) {
        this.nameofCountry = nameofCountry;
        System.out.println("Setter country Predisent ");
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
