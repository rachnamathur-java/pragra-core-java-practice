package calculator;

import java.util.Scanner;

public class Subtraction {

    public void sub(Scanner scanner) {
        System.out.println("Subtraction Called...");
        System.out.println("                            ");
        double x = Utils.enterNumber(scanner, "First Number");
        double y = Utils.enterNumber(scanner, "Second Number");
        System.out.println("                            ");
        System.out.println("Subtraction of "+ x + " and "+y+ " is = "+ (x-y));
        System.out.println("                            ");
    }

    public void executeSub(Scanner scanner){
        boolean subAgain = true;
        while(subAgain){
            sub(scanner);
            Utils.choice("Subtraction");
            subAgain = Utils.doAgain(scanner, subAgain);
        }
    }
}
