import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    //design pattern singleton garanti qu'un classe n'a qu'une instance et fournit un acces global a cette instance
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("appContext008.xml");
        MyClassSingleton singleton = context.getBean(MyClassSingleton.class);
        singleton.afficher();

        BeanACreer beanACreer = context.getBean(BeanACreer.class);
        beanACreer.afficher();




    }
}
