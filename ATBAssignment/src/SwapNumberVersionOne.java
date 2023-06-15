import java.util.Scanner;

public class SwapNumberVersionOne {
    //Swaping the numbers using third varaible
    public static void main(String args[])
    {
        Scanner scObj = new Scanner(System.in);
        int num1, num2,temp;
        System.out.println("Enter Number 1 for Swap");
        num1 = scObj.nextInt();
        System.out.println("Enter Number 2 Swap ");
        num2 = scObj.nextInt();

        System.out.println("Before Swap Num1 is "+num1+ " and Num2 is "+num2);

        //swaping
        temp = num1;
        num1=num2;
        num2=temp;

        System.out.println("After Swap Num1 is "+num1+ " and Num2 is "+num2);

    }
}
