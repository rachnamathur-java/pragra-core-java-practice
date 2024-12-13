package calculator;

import java.util.Scanner;

public class Division {

    public void div(Scanner scanner) {
        System.out.println("Division Called...");
        System.out.println("                            ");
        double x1 = Utils.enterNumber(scanner, "First Number");
        double x =  x1;
        double y1 = Utils.enterNumber(scanner, "Second Number");
        double y = y1;
        double z = x/y;
        System.out.println("                            ");
        System.out.println("Division of "+x+ " and "+y+ " is = "+z);
        System.out.println("                            ");
    }

    public  void executeDivision(Scanner scanner){
        boolean divAgain = true;
        while(divAgain){
            div(scanner);
            Utils.choice("Division");
            divAgain = Utils.doAgain(scanner, divAgain);

        }
    }
}
