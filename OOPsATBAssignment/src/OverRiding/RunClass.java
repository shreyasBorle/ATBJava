package OverRiding;

public class RunClass {
    public static void main(String[] argv)
    {
        Vegetable veg = new Vegetable();

        veg = new Onion();
        veg.chopFine();

        Onion onion = new Onion();
        onion.chopBlock();

        Tomato tomato = new Tomato();
        tomato.chopFine();
    }
}
