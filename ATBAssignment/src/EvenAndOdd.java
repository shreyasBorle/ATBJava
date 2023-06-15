import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String args[])
    {
        Scanner scObj = new Scanner(System.in);
        int num;
        System.out.println("Enter Number");
        num = scObj.nextInt();

        if(num % 2 == 0)
        {
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }


    }
}
