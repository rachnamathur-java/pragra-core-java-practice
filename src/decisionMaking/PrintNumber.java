package decisionMaking;

import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("print numbers from 1 to n...");
        System.out.println("Enter number n ");
        int n = scanner.nextInt();
        int x = 1;
        do{
            System.out.println(x);
            x++;
        }
        while (x<n+1);


    }
}
