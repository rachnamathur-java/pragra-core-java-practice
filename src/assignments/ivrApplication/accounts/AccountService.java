package assignments.ivrApplication.accounts;

import assignments.ivrApplication.utils.Utils;

import java.util.Scanner;

public class AccountService {

    public void accountServiceMenu(){
        Utils.printLineSeparator();
        System.out.println("Press 1 to Check balance");
        System.out.println("Press 2 to Recharge account");
        System.out.println("Press 3 to Pay bills");
        System.out.println("Press 4 to Dispute a charge");
        System.out.println("Press 5 to Change plan");
        System.out.println("Press 6 to Port-in/Port-out number");
        System.out.println("Press 9 to return to Main Menu ");
        System.out.println("Press 0 to Exit ");
        Utils.printLineSeparator();
        System.out.println("Enter your Account Service choice...");
        //Utils.printLineSeparator();
    }

    public boolean accountMenuBlock(boolean backToMainMenu, Scanner scanner) {
        accountServiceMenu();
        int accountChoice = scanner.nextInt();
        switch (accountChoice) {
            case 0:
                System.out.println("You are Exited...");
                System.exit(0);
            case 1:
                System.out.println("Check balance called...");
                break;
            case 2:
                System.out.println("Recharge account called...");
                break;
            case 3:
                System.out.println("Pay bills called...");
                break;
            case 4:
                System.out.println("Dispute a charge called...");
                break;
            case 5:
                System.out.println("Change plan called...");
                break;
            case 6:
                System.out.println("Port-in/Port-out number called...");
                break;
            case 9:
                System.out.println("Going back to Main Menu...");
                backToMainMenu = true;
                break;
            default:
                System.out.println("Invalid Account Service Option...");
        }
        return backToMainMenu;
    }
    public void executeAccountServices(Scanner scanner) {
        boolean backToMainMenu = false;
        int nextChoice = 7;
        while (!backToMainMenu) {
            if (nextChoice == 7) {
                backToMainMenu = accountMenuBlock(backToMainMenu, scanner);
            } else if (nextChoice == 9) {
                backToMainMenu = true;
            } else if (nextChoice == 0) {
                System.exit(0);
            } else {
                System.out.println("Enter a valid choice");
            }
            if (nextChoice==7 && !backToMainMenu) {
                Utils.backToMenuOption();
                nextChoice = scanner.nextInt();
            }
        }
    }
}
