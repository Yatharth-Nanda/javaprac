import java.util.Scanner;

public class Array {
    static Scanner sc=new Scanner(System.in);
    public static void main (String args[])
    {
        System.out.println("Enter 5 numbers ");
        double sum=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int[] arr=new int[5];
        for(int i=0;i<5;i++)
        {arr[i]=sc.nextInt();
         sum+=arr[i]  ;

         if(arr[i]<min)
             min=arr[i];
         if(arr[i]>max)
             max=arr[i];
        }
        System.out.println("Printing the array :");
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("The sum of the array is "+sum);
        System.out.println("The average of the array is "+sum/5.0 );
        System.out.println("The minimum of the array is "+min);
        System.out.println("The maximum of the array is "+max);

        sc.close();
    }
}
