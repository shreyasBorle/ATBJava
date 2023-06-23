package student;

public class ATBStudent {

    String name;
    String courseName;
    int phoneNumber;
    String emailId;
    int age;
    String cityName;



    public ATBStudent(String name, String CName, int pnumber, String email, int a, String CiName)
    {
        this.name = name;
        this.courseName= CName;
        this.phoneNumber = pnumber;
        this.emailId = email;
        this.age= a;
        this.cityName = CiName;
    }

    @Override
    public String toString() {
        return "ATB Student Detail {"+
                "Name = "+name+
                ", Course Name = "+courseName+
                ", Phone Number = "+phoneNumber+
                ", Email ID = "+emailId+
                ", Age = "+age+
                ", City = "+cityName+"}\n";
    }
}
