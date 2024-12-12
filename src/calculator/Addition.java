package calculator;

import java.util.Scanner;

public class Addition {
    Scanner scanner = new Scanner(System.in);
    public void add() {
        //System.out.println("Addtion");
        System.out.println("enter num1 ");
        int x = scanner.nextInt();
        System.out.println("enter num2 ");
        int y = scanner.nextInt();
        int sum = x + y;
        System.out.println(sum);


    }
}
