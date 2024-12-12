package decisionMaking;

import java.util.Scanner;

public class PositiveNum {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        String num = scanner.nextLine();
        int number = Integer.parseInt(num);
        if (number > 0)
        {
            System.out.println(number+" is a positive number.");
        }
        else{
            System.out.println(number+" is a negetive number.");
        }
    }
}
