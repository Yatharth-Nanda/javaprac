import java.util.Scanner;
public class loop {

    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("For loop");
        for(int i=1;i<=10;i++) {
            System.out.println(i);
        }

        System.out.println(" While loop");
        int i=1;
        while(i<=20)
        {
            System.out.println(i++);
        }
        System.out.println("do while loop");
        do {
            System.out.println("Please enter a number between 1 and 10");
            i=sc.nextInt();

        }while(i<1||i>10);
        }

}
