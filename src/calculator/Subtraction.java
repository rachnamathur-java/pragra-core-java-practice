package calculator;

import java.util.Scanner;

public class Subtraction {
    public void sub(Scanner scanner) {
        //System.out.println("Subtraction Called...");
        System.out.println("enter num1 ");
        int x = scanner.nextInt();
        System.out.println("enter num2 ");
        int y = scanner.nextInt();
        int sub = x - y;
        System.out.println(sub);

    }
}
