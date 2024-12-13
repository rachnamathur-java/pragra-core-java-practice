package calculator;

import java.util.Scanner;

public class Modulus {

    public  void mod(Scanner scanner){
        System.out.println("Modulus Called...");
        System.out.println("                            ");
        double x = Utils.enterNumber(scanner, "First Number");
        double y = Utils.enterNumber(scanner, "Second Number");
        System.out.println("                            ");
        System.out.println("Modulus of "+x+ " and "+y+" is = "+(x%y));
        System.out.println("                            ");
    }

    public void executeMod(Scanner scanner){
        boolean modAgain = true;
        while (modAgain){
            mod(scanner);
            Utils.choice("Modulus");
            modAgain = Utils.doAgain(scanner, modAgain);
        }
    }
}
