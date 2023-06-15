import java.util.Scanner;

public class AdditionOfNumber {
    public static void main(String args[])
    {
        Scanner scObj = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter Number 1 ");
        num1 = scObj.nextInt();
        System.out.println("Enter Number 2 ");
        num2 = scObj.nextInt();

        System.out.println("Sum of two number is "+(num1+num2));

    }
}
