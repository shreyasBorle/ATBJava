import java.util.Scanner;

public class PrintUserNumber {
    public static void main(String[] args)
    {
        Scanner scObj = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scObj.nextInt();
        System.out.println("Number is "+num);
    }
}
