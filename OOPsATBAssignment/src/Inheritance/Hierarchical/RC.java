package Inheritance.Hierarchical;

public class RC {
    public static void main(String[] argv)
    {
        Car ca = new Car();
        ca.carName("cars");
        ca.Engine();
        ca.start();

        System.out.println("===============================================================");

        Tata tata = new Tata();
        tata.carName("Tata altroz");
        tata.Engine();
        tata.start();
        tata.TopSpeedCar();
    }
}
