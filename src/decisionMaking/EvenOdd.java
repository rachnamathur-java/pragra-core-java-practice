package decisionMaking;

import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = scanner.nextInt();
        //int x = Integer.parseInt(num);

        if (x%2 == 0)
        {
            System.out.println( x +" is an even number.");
        }

        else{
            System.out.println(x +" is an odd number. ");
        }
    }
}