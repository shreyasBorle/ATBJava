package Inheritance.Hierarchical;

import java.io.FilterOutputStream;

public class Tata extends Car {
    public Tata()
    {
    }


    public void TopSpeedCar()
    {
        super.topSpeed = 200;
        System.out.println("Tata cars top speed is "+topSpeed);
    }
}
