public class OopAssignmentOne {

    public static void main(String[] args)
    {
        ATB obj = new ATB();

        System.out.println("Addition is "+obj.Addition(3,4));
    }
}
class ATB
{
    ATB()
    {
        System.out.println("ATB constructor called with out parameter.");
    }
    public int Addition(int a, int b)
    {
        return(a+b);
    }
}
