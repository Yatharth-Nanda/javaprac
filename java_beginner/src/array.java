import java.util.Scanner;

public class Array {
    static Scanner sc=new Scanner(System.in);
    public static void main (String args[])
    {
        System.out.println("Enter 5 numbers ");
        int[] arr=new int[5];
        for(int i=0;i<5;i++)
        {arr[i]=sc.nextInt();
        }
        System.out.println("Printing the array :");
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
