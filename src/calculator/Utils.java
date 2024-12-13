package calculator;

import java.util.Scanner;

public class Utils {

    public static void choice(String option) {
        System.out.println("************************************************");
        System.out.println("                            ");
        System.out.println("Press y if you want to continue with " + option);
        System.out.println("Press n if you want to continue with other options ");
        System.out.println("                            ");
    }

    public static char enterChar(Scanner scanner){
        System.out.println("Enter your choice .... ");
        System.out.println("                            ");
        return scanner.next().charAt(0);
    }

    public static double enterNumber(Scanner scanner, String numName){
        System.out.println("enter " + numName);
        return scanner.nextDouble();
    }

    public static boolean doAgain(Scanner scanner, boolean repeat){
        char choiceInput;
        do {
            choiceInput = Utils.enterChar(scanner);
            if ('n' == choiceInput || 'N' == choiceInput) {
                return false;
            } else if ('y' == choiceInput || 'Y' == choiceInput) {
                return true;
            } else {
                System.out.println("Invalid choice ! please try again...");
            }
        } while ('n' != choiceInput
                && 'N' != choiceInput
                && 'y' != choiceInput
                && 'Y' != choiceInput);
        return repeat;
    }


}
