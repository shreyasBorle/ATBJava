package Inheritance.Hierarchical;

public class Vehicle {
    public int vehicleID;
    public int topSpeed;
    public String vehicleName;

    public Vehicle(){

    }


    public void Engine()
    {
        System.out.println("you have selected the Engine");
    }

    public void start()
    {
        System.out.println("Vehicle is started.");
    }

    public void getVehicleName()
    {
        System.out.println(vehicleName);
    }
}
