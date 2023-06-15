import java.util.Scanner;

public class MultiplyFloatingNumber {
    public static void main(String args[])
    {
        Scanner scObj = new Scanner(System.in);
        float num1, num2;
        System.out.println("Enter Number 1 for Multiplication");
        num1 = scObj.nextFloat();
        System.out.println("Enter Number 2 Multiplication ");
        num2 = scObj.nextFloat();

        System.out.println("Sum of two number is "+(num1*num2));

    }
}
