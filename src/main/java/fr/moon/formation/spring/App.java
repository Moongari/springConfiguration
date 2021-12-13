package fr.moon.formation.spring;

import fr.moon.formation.spring.service.ServiceHoteImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static  void main(String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("appContext-01.xml");
        ServiceHoteImpl serviceHote = context.getBean(ServiceHoteImpl.class);

    }
}
