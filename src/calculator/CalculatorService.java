package calculator;

import java.util.Scanner;

public class CalculatorService {
    Addition addition = new Addition();
    Subtraction subtraction = new Subtraction();
    Multiplication multiplication = new Multiplication();
    Division division = new Division();
    Modulus module = new Modulus();



    public void chooseFunction() {
        System.out.println("                            ");
        System.out.println("***************************");
        System.out.println("welcome to my calculator");
        System.out.println("***************************");
        System.out.println("                            ");

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("0. Exit");
        System.out.println("                            ");
        System.out.println("Enter your choice ....");
        System.out.println("                            ");


    }

    public int getChooseFunction(Scanner scanner) {
        chooseFunction();
        return scanner.nextInt();
    }

    public void executeService() {
        Scanner scanner = new Scanner(System.in);
        boolean isTerminated = false;
        while (!isTerminated) {
            chooseFunction();
            int userChoice = scanner.nextInt();
            switch (userChoice) {
                case 0:
                    System.out.println("Exit");
                    isTerminated = true;
                    break;
                case 1:
                    addition.executeAddition(scanner);
                    break;
                case 2:
                    subtraction.executeSub(scanner);
                    break;
                case 3:
                    multiplication.executeMulti(scanner);
                    break;
                case 4:
                    division.executeDivision(scanner);
                    break;
                case 5:
                    module.executeMod(scanner);
                    break;
                default:
                    System.out.println("Invalid Menu Option...");
            }

        }
    }
}



