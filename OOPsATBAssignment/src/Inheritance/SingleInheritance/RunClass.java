package Inheritance.SingleInheritance;

public class RunClass {

    public static void main(String[] argv)
    {
        Car c = new Car();
        c.carName("Honda");

        //Parent class method called by using child class object
        c.Engine();
        c.start();
    }



}
