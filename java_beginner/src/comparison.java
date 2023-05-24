import java.util.Scanner;

public class comparison {
    public static void main (String args[]) {
        int a, b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two integer numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
            System.out.println("The greater number is "+a);
        else
            System.out.println("The greater number is "+b);
    }
}
