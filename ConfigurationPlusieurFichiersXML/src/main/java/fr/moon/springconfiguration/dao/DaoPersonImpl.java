package fr.moon.springconfiguration.dao;

import fr.moon.springconfiguration.model.Personne;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class DaoPersonImpl implements IDao{

    private List<Personne> personneList = new ArrayList<>();


    public DaoPersonImpl(){
        System.out.println("PersonnDaoimpl : constructeur par defaut");
    }

    @Override
    public void create(Personne p) {
        personneList.add(p);
    }

    @Override
    public void delete(Personne p) {
        personneList.remove(p);
    }

    @Override
    public Collection<Personne> findAll() {
        List<Personne> list = personneList.stream().collect(Collectors.toList());
        return list;
    }

    @Override
    public Personne find(Long id) {
        return personneList.stream().filter(personne -> id.equals(personne.getId())).findFirst().orElseThrow(()->new IllegalArgumentException("pas trouve"));

    }
}
