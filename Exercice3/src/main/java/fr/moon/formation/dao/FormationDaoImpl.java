package fr.moon.formation.dao;

import fr.moon.formation.model.Formation;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FormationDaoImpl implements IFormationDao{

    private Set<Formation> formationSet = new HashSet<>();
    public FormationDaoImpl(){
        System.out.println("Formation Dao impl : constructeur par defaut");
    }



    @Override
    public void create(Formation f) {
        formationSet.add(f);

    }

    @Override
    public void update(Formation f) {
        Formation formation = formationSet.stream().filter(formation1 -> f.getId() == formation1.getId()).findFirst()
                .orElseThrow(()->new IllegalArgumentException("formation non trouvé"));
        f.setLieu(f.getLieu());
        f.setTypeDeFormation(f.getTypeDeFormation());
        f.setName(f.getName());


    }

    @Override
    public void delete(Formation f) {
        formationSet.remove(f);

    }

    @Override
    public Collection<Formation> findAll() {
        return new HashSet<>(formationSet);
    }

    @Override
    public Formation find(Long id) {
        return formationSet.stream().filter(formation1-> id.equals(formation1.getId())).findFirst()
                .orElseThrow(()-> new IllegalArgumentException("formation non trouvée"));

    }
}
