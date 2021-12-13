import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext-config-properties.xml");
        DatabaseProperties databaseProperties = applicationContext.getBean(DatabaseProperties.class);
        System.out.println(databaseProperties);

    }
}
