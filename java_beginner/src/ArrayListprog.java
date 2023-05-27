import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class ArrayListprog {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int flag=1;
        List<String> grocery = new ArrayList<>();
        int c = 1;
        while (flag==1) {
            System.out.println("Choose one of the following options ");
            System.out.println("1.) add items to the list ");
            System.out.println("2.) Delete a given item from the list ");
            System.out.println("3.) Search if an item exists in the list ");
            System.out.println("4.) Print current list ");
            System.out.println("5.) Clear the grocery list");
            System.out.println("Press any other number  to exit ");
            c = sc.nextInt();
            switch (c)
            {
                case 1:
                    System.out.println("Enter the item to be added");
                    String s=sc.next();
                    grocery.add(s);
                    break;
                case 2:
                    System.out.println("Enter the item to be deleted ");
                    String s2=sc.next();
                    for(int i=0;i<grocery.size();i++)
                    {
                        //System.out.println("comparing "+ grocery.get(i)+" with "+ s2);
                        if(s2.equals(grocery.get(i))) //designed to remove first instance of the element
                        {
                           System.out.println("  deleting element from list ");
                            grocery.remove(i);
                            break;
                        }

                    }
                    break;
                case 3:
                    System.out.println("Enter the item to be searched for in the list ");
                    String s1=sc.next();
                    if(grocery.contains(s1))
                    System.out.println("Item is present in the list ");
                    else
                    System.out.println("Item is not present in the list ");
                    break;
                case 4:
                    System.out.println("Printing the list elements" );
                    for(String s3:grocery) {
                        System.out.println(s3);
                    }
                    break;
                case 5:
                    System.out.println("Clearing the grocery list");
                    grocery.clear();
                    break;
                default :
                    System.out.println("You've chosen to exit the list program");
                    flag = 0;
                    break;

                    }

            }


        }
    }

