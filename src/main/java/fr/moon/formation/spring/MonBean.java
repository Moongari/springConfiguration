package fr.moon.formation.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MonBean implements ApplicationContextAware {

    // on recupere une copier vers application Context
    // on pourra par exemple afficher le nom de l'application context utilisé
    private ApplicationContext applicationContext;

    public void helloWordl(){
        System.out.println("Hello world Moustafa from :" + applicationContext.getDisplayName());
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
