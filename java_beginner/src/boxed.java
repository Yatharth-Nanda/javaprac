import java.util.Scanner;
public class boxed {
    public static void main (String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of the person ");
        int a=sc.nextInt();
        System.out.println("Enter the name of the person ");
        String b=sc.next();
        System.out.println("Hello "+b+" ! You are "+a+" years old .");
    }
}
