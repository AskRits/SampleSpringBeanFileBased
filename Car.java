/**
 * Created by Ritesh on 4/5/2016.
 */

import org.springframework.context.ApplicationContext;

public class Car {

    private String model ="";
    private HelloWorld hw=null;
    Car(){

    }

    public HelloWorld getHw() {
        return hw;
    }

    public void setHw(HelloWorld hw) {
        System.out.println("myhw"+hw);
        hw.sayHello();
        this.hw = hw;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    void checkEngine(){
        System.out.println("Engine Check");
    }

    void checkSeatBelts(){
        System.out.println("Seatbelt Check");
    }

    void startCar(){
        System.out.println("Car Started");
    }
    void stopCar(){
        System.out.println("Car Stopped");
    }
    void cleanCar(){
        System.out.println("Clean Car");
    }


}
