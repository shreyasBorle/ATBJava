package Inheritance.Multievel;

public class RC {
    public static void main(String[] argv)
    {
        Car ca = new Car();
        ca.carName("Tata cars");
        ca.Engine();
        ca.start();

        System.out.println("===============================================================");

        Bike bik = new Bike();
        bik.bikeName("Royal Enfiled Himalayan");
        bik.Engine();
        bik.start();
    }
}
