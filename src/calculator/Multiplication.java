package calculator;

import java.util.Scanner;

public class Multiplication {

    public void multi(Scanner scanner) {
        System.out.println("Multiplication Called...");
        System.out.println("                            ");
        double x = Utils.enterNumber(scanner, "First Number");
        double y = Utils.enterNumber(scanner, "Second Number");
        System.out.println("                            ");
        System.out.println("Multiplication of "+x+ " and "+y+" is = "+(x*y));
        System.out.println("                            ");
    }

    public void executeMulti(Scanner scanner){
        boolean multiAgain = true;
        while (multiAgain){
            multi(scanner);
            Utils.choice("Multiplication");
            multiAgain = Utils.doAgain(scanner, multiAgain);

        }
    }
}
