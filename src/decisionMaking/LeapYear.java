package decisionMaking;

import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year ");
        String value = scanner.nextLine();
        int year = Integer.parseInt(value);


        if (year%4 == 0)
        {
            System.out.println("year "+year+" is a leap year.");
        }
        else{
            System.out.println("year "+year+" is not a leap year.");
        }
    }
}
