package decisionMaking;

import java.util.Scanner;

public class MaxFunction {
    public static void main(String[] args)
    {
       // int x = 199;
        //int y = 20;
        //int z = 36;

        Scanner sc = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter first number x");
        int x = sc.nextInt();
        System.out.println("Enter second number y");
        int y = sc.nextInt();
        System.out.println("Enter third number z");
        int z = sc.nextInt();

       /* int x = Integer.parseInt(x1);
        int y = Integer.parseInt(y1);
        int z = Integer.parseInt(z1);*/


        if ((x > y) && (x > z))
        {
            System.out.println(x + " is the largest number");
        }
        else if( y > z )
        {
            System.out.println(y + " is the largest number");
        }

        else
        {
            System.out.println(z + " is the largest number");
        }
    }
}
