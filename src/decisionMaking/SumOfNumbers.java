package decisionMaking;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sum of numbers from 1 to n...");
        System.out.println("Enter number n ");
        int n = scanner.nextInt();
        int sum = 0;
        int x = 0;
            do{

                sum = x+ sum ;
                 x++;
            }while(x<=n);
        System.out.println("Sum of 1 to "+ n + " is "+ sum);


            //int sum = n*(n+1)/2;


    }
}
