import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ritesh on 4/5/2016.
 */
public class MainApp {
    public static void main(String[] arr) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld hw = (HelloWorld) context.getBean("HelloWorld");
        hw.sayHello();
        Car car = (Car) context.getBean("Car");
        car.startCar();
        car.getModel();
        ((AbstractApplicationContext)context).close();
    }
}
