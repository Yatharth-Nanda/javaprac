import java.util.Scanner;
public class calc {
    public static void main (String args[])
    { Scanner sc=new Scanner(System.in);
        System.out.println("Enter preferred choice ");
        System.out.println("1 Division of a by b ");
        System.out.println("2 Multiplication of a and b");
        System.out.println("3 Addition of a and b ");
        System.out.println("4 Subtract b from  a ");
        int c =sc.nextInt();
        System.out.println("Enter the two number a and b ");
        double a,b;
        a=sc.nextDouble();
        b=sc.nextDouble();
        switch(c)
        {case 1:
            System.out.println("Result="+(a/b));
            break;
         case 2 :
             System.out.println("Result="+(a*b));
             break;
         case 3 :
                System.out.println("Result="+(a+b));
                break;
         case 4 :
                System.out.println("Result="+(a-b));
                break;
            default:
                System.out.println("please enter a valid input");
        }


    }
}
