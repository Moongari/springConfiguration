package fr.moon.formation.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //creer une instance de la classe ApplicationContext
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext002.xml");
        //ici on utiliser FileSystemXmlApplicationContext et on doit specifier le chemin sur notre machine

        //ApplicationContext applicationContext = new FileSystemXmlApplicationContext("C:\\Users\\moungamo\\IdeaProjects\\Formation_exercice1_MavenSpring\\exercice-spring-ioc\\src\\main\\java\\resouces\\appContext002.xml");
        // on peut desormais donner un nom a notre applicationContext
        applicationContext.setDisplayName("AppContext002.xml");
        //Recuperer un bean de type MonBean
        MonBean bean = applicationContext.getBean(MonBean.class);

        //appeler la Methode
        bean.helloWordl();

    }
}
