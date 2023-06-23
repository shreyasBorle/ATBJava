package Overloading;

public class RunClass {
    public static void main(String[] argv)
    {

        AdditionCalculator cal = new AdditionCalculator();
        System.out.println(cal.add(2,3));
        System.out.println(cal.add(2.5,3.5));
        System.out.println(cal.add(2,3,5));

    }
}
