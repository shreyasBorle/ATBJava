package Inheritance.Multievel;

import Inheritance.SingleInheritance.Vehicle;

public class Car extends Vehicle {
    public Car()
    {
        System.out.println("Select the car");
    }

    public void carName(String n)
    {
        System.out.println("Car name is "+n);
    }

}
