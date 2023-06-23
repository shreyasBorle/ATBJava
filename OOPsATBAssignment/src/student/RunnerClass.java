package student;

import java.util.Scanner;

public class RunnerClass {
    public static void main(String[] argv){
        int k;
        Scanner in = new Scanner(System.in);

        /*ATBStudent student1 = new ATBStudent(
                "Shreyas",
                "ATB3X",
                1212123323,
                "shreyasb@gmail.com",
                33,
                "Nagpur,MH");*/

        //create array of students and display using loop;
        System.out.println("Enter the total number of students");
        int numberStudent = in.nextInt();

        String sName="";
        String cName="";
        int pNum=0;
        String email="";
        int ag=0;
        String ciName="";

        ATBStudent[] students2 = new ATBStudent[numberStudent];



        for (int i = 0; i < numberStudent; i++){
            System.out.println("Enter Student Name"+numberStudent);
            sName = in.next();
            System.out.println("Enter Course Name ");
            cName = in.next();
            System.out.println("Enter Phone number ");
            pNum = in.nextInt();
            System.out.println("Enter email ");
            email = in.next();
            System.out.println("Enter age of Student ");
            ag = in.nextInt();
            System.out.println("Enter City ");
            ciName = in.next();

            students2[i]= new ATBStudent(sName,cName,pNum,email,ag,ciName);

        }
        for (int j=0;j< numberStudent;j++){

            System.out.println(students2[j].toString());
        }

        //System.out.println(student1.toString());

    }
}
