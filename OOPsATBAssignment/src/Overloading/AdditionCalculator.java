package Overloading;

public class AdditionCalculator {
    AdditionCalculator()
    {
    }

    public int add(int a, int b)
    {
        return a+b;
    }
    public double add(double a, double b)
    {
        return a+b;
    }
    public long add(long a, long b)
    {
        return a+b;
    }

    public int add(int a, int b,int c)
    {
        return a+b+c;
    }
}
