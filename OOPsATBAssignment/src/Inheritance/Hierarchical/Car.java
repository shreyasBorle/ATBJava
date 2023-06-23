package Inheritance.Hierarchical;

import Inheritance.Hierarchical.Vehicle;

public class Car extends Vehicle {
    public Car()
    {
        super.topSpeed = 100;
        System.out.println("Car top speed is "+topSpeed);
    }

    public void carName(String n)
    {
        System.out.println("Car name is "+n);
    }

}
