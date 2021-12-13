package fr.moon.springconfiguration;

import fr.moon.springconfiguration.service.ServicePersonImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        //ApplicationContext context = new ClassPathXmlApplicationContext("appContext-config-dao.xml","appContext-config-service.xml");
        //on peut aussi utiliser une regex si les fichiers config respectent un standard grace a étoile
        ApplicationContext context = new ClassPathXmlApplicationContext("appContext-config-011.xml");
        //on peut aussi utiliser la balise import dans le fichier appContext-config-All.xml
        //ApplicationContext context = new ClassPathXmlApplicationContext("appContext-config-All.xml");

        //ServicePersonImpl servicePerson = context.getBean(ServicePersonImpl.class);



    }
}
