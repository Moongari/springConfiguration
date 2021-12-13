package fr.moon.formation.service;

import fr.moon.formation.dao.FormationDaoImpl;
import fr.moon.formation.dao.IFormationDao;
import fr.moon.formation.model.Formation;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ServiceFormationImpl implements IFormationService {


    private FormationDaoImpl formationDao;
    private String etablissement;



    public IFormationDao getFormationDao() {
        return formationDao;
    }

    public void setFormationDao(FormationDaoImpl formationDao) {
        this.formationDao = formationDao;
        System.out.println("Formation Sercvice Imple : setter de la formationDao");
    }

    public String getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(String etablissement) {
        this.etablissement = etablissement;
        System.out.println("Formation service impl : setter de l'etablissement");
    }

    public ServiceFormationImpl(){
        System.out.println("ServiceFormationImpl : constructeur par defaut");
    }

    public ServiceFormationImpl(final FormationDaoImpl formationDao,String etablissement){
        super();
        this.formationDao = formationDao;
        this.etablissement = etablissement;
        System.out.println("Formation Service Impl : constructeur avec arguments");
    }
    @Override
    public void create(Formation f) {
        formationDao.create(f);
    }

    @Override
    public void update(Formation f) {

        formationDao.update(f);

    }

    @Override
    public void delete(Formation f) {
        formationDao.delete(f);
    }

    @Override
    public Collection<Formation> findAll() {
        return formationDao.findAll();
    }

    @Override
    public Formation find(Long id) {
        return null;
    }
}
