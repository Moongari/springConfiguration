package fr.moon.formation;

import fr.moon.formation.dao.FormationDaoImpl;
import fr.moon.formation.model.BeanListeDesPrimitifEtAutre;
import fr.moon.formation.model.Formation;
import fr.moon.formation.service.ServiceFormationImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

class Exercice3 {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext005.xml");
       ServiceFormationImpl serviceFormation = applicationContext.getBean(ServiceFormationImpl.class);
       serviceFormation.create(new Formation(1,"Java","new-york","Formation sur les streams"));
        System.out.println(serviceFormation.findAll());

        //Spring permet d'associer chaque bean definit dans le fichier appContext
        //Spring definit le nom de la classe si il le nom du bean n'est pas definit
        //chaque doit avoir un nom unique dans le context d'application : Regle a retenir

        Map<String,FormationDaoImpl> beans = applicationContext.getBeansOfType(FormationDaoImpl.class);
        beans.entrySet().stream().forEach(b-> System.out.println(b.getKey()));



        /*ici on desire afficher les valeurs de chaques attributs et type declarer dans le bean  BeanListeDesPrimitifEtAutre
        * */
        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("appContext007.xml");
        BeanListeDesPrimitifEtAutre bean007 = applicationContext1.getBean(BeanListeDesPrimitifEtAutre.class);

        System.out.println(bean007.toString());



    }
}
