package decisionMaking;

import java.util.Scanner;

public class Practice
{
    Scanner scan = new Scanner(System.in);
    public void myMethod()
    {
        System.out.println("enter num");
        int i = scan.nextInt();
        System.out.println("enter double");
        double d = scan.nextDouble();
        System.out.println("enter string");
        scan.nextLine();
        String s = scan.nextLine();


        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    public double myMethod2()
    {
        System.out.println("enter first double");
        double d1 = scan.nextDouble();
        System.out.println("enter second double");
        double d2 = scan.nextDouble();

        return  d1 + d2;
    }

    public void table()
    {
        System.out.println(" Enter num :");
        int input = scan.nextInt();
        int num;
        int i;

        for(num = input ; num <= 10; num++)
        {
            System.out.print("table of "+ num + " is : ");
            for(i = 1; i <= 10; i++)
            {
                System.out.print(num * i + " ");
            }
            System.out.println();
        }
    }





    public static void main (String[] args)
    {
        Practice practice = new Practice();
        //practice.myMethod();
        //System.out.println(practice.myMethod2());
        practice.table();
        //practice.tableUser();

    }
}