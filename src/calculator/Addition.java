package calculator;

import java.util.Scanner;


public class Addition {

    private void add(Scanner scanner) {
        System.out.println("Addition Called...");
        System.out.println("                            ");
        double x = Utils.enterNumber(scanner, "First Number");
        double y = Utils.enterNumber(scanner, "Second Number");
        System.out.println("                            ");
        System.out.println("Sum of "+x+ " and " +y+ " is =  " + (x+y));
        System.out.println("                            ");
    }

    public  void executeAddition(Scanner scanner){
        boolean addAgain = true;
        while(addAgain){
            add(scanner);
            Utils.choice("Addition");
            addAgain = Utils.doAgain(scanner, addAgain);
        }
    }
}
