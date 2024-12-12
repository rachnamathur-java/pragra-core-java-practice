package loops_problem;

import java.util.Scanner;

public class ForLoopDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Factorial of number n...");
        System.out.println("Enter number n ");
        int n = scanner.nextInt();

        int fact = 1;
        for(int x = n; x>=1 ;x-- ){
            fact = x * fact;
            System.out.println(fact);
        }
    }
}
