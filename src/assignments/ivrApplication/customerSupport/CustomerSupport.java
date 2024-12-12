package assignments.ivrApplication.customerSupport;

import assignments.ivrApplication.utils.Utils;

import java.util.Scanner;

public class CustomerSupport {
    public void customerSupportMenu(){
        Utils.printLineSeparator();
        System.out.println("Press 1 for Technical support");
        System.out.println("Press 2 for Billing inquiries");
        System.out.println("Press 3 for General inquiries");
        System.out.println("Press 9 to return Main Menu ");
        System.out.println("Press 0 to Exit ");
        Utils.printLineSeparator();
        System.out.println("Enter your Customer Service choice...");
        //Utils.printLineSeparator();
    }
    public boolean customerSupportMenuBlock(boolean backToMainMenu, Scanner scanner) {
        customerSupportMenu();
        int customerChoice = scanner.nextInt();
        switch (customerChoice) {
            case 0:
                System.out.println(" You are Exited...");
                System.exit(0);
            case 1:
                System.out.println("Technical support called...");
                break;
            case 2:
                System.out.println("Billing inquiries called...");
                break;
            case 3:
                System.out.println("General inquiries called...");
                break;
            case 9:
                System.out.println("Main Menu...");
                backToMainMenu = true;
                break;
            default:
                System.out.println("Invalid Customer Support Option...");
        }
        return backToMainMenu;
    }
    public void executeCustomerSupport(Scanner scanner){
        boolean backToMainMenu = false;
        int nextChoice = 7;
        while (!backToMainMenu) {
            if (nextChoice == 7) {
                backToMainMenu = customerSupportMenuBlock(backToMainMenu, scanner);
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
