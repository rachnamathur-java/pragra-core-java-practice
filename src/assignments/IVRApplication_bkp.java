package assignments;

import java.util.Scanner;

public class IVRApplication_bkp {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        IVRApplication_bkp ivr = new IVRApplication_bkp();
        int langaugeChoice = ivr.getLangaugeChoice();
        if (langaugeChoice == 1) {
            System.out.println("English Language Selected...");
            ivr.getMainMenuChoice();
        } else
            System.out.println("French Language Selected...");
    }

    public void langaugeMenu() {
        System.out.println("                                        ");
        System.out.println("------  WELCOME to ROGERS  -------");
        System.out.println("                                        ");
        System.out.println("Press 1 for English");
        System.out.println("Press 2 for French");
    }

    public void mainMenu(){
        printLineSeparator();
        System.out.println("1. Account Service press 1");
        System.out.println("2. Customer Support press 2");
        System.out.println("3. Other Services press 3");
        System.out.println("4. To Exit Press 0");
        printLineSeparator();
        System.out.println("Enter your choice...");
        printLineSeparator();
    }

    public void accountServiceMenu(){
        printLineSeparator();
        System.out.println("Press 1 to Check balance");
        System.out.println("Press 2 to Recharge account");
        System.out.println("Press 3 to Pay bills");
        System.out.println("Press 4 to Dispute a charge");
        System.out.println("Press 5 to Change plan");
        System.out.println("Press 6 to Port-in/Port-out number");
        System.out.println("Press 9 to return Main Menu ");
        System.out.println("Press 0 to Exit ");
        printLineSeparator();
        System.out.println("Enter your Account Service choice...");
        printLineSeparator();
    }

    public void customerServiceMenu(){
        printLineSeparator();
        System.out.println("Press 1 for Technical support");
        System.out.println("Press 2 for Billing inquiries");
        System.out.println("Press 3 for General inquiries");
        System.out.println("Press 9 to return Main Menu ");
        System.out.println("Press 0 to Exit ");
        printLineSeparator();
        System.out.println("Enter your Customer Service choice...");
        printLineSeparator();
    }
    public void otherServiceMenu(){
        printLineSeparator();
        System.out.println("1. International roaming");
        System.out.println("2. Value-added services (VAS)");
        System.out.println("3. Lost or stolen phone");
        System.out.println("Press 9 to return Main Menu ");
        System.out.println("Press 0 to Exit ");
        printLineSeparator();
        System.out.println("Enter your Other Service choice...");
        printLineSeparator();
    }

    public void printLineSeparator(){
        System.out.println("****************************************");
    }

    public void backToMenuOption(){
        printLineSeparator();
        System.out.println("Press 9 to return Main Menu");
        System.out.println("Press 0 to Exit");
        System.out.println("Press 7 to continue with Previous Menu");
        printLineSeparator();
    }

    public int getLangaugeChoice() {
        langaugeMenu();
        return scanner.nextInt();
    }

    public void getMainMenuChoice() {
        boolean isTerminated = false;
        while (!isTerminated) {
            mainMenu();
            int menuChoice = scanner.nextInt();
            switch (menuChoice) {
                case 0:
                    System.out.println("Exit");
                    isTerminated = true;
                    break;
                case 1:
                    System.out.println("Account Service Called...");
                    accountServices();
                    break;
                case 2:
                    System.out.println("Customer Service Called...");
                    customerServices();
                    break;
                case 3:
                    System.out.println("Other Services Called...");
                    otherServices();
                    break;
                default:
                    System.out.println("Invalid Menu Option...");
            }

        }
    }

    public boolean accountMenuBlock(boolean backToMainMenu) {
        accountServiceMenu();
        int accountChoice = scanner.nextInt();
        switch (accountChoice) {
            case 0:
                System.out.println(" You are Exit...");
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



    public void accountServices() {
        boolean backToMainMenu = false;
        int nextChoice = 7;
        while (!backToMainMenu) {
            if (nextChoice == 7) {
                backToMainMenu = accountMenuBlock(backToMainMenu);
            } else if (nextChoice == 9) {
                backToMainMenu = true;
            } else if (nextChoice == 0) {
                System.exit(0);
            } else {
                System.out.println("press a valid choice");
            }
            if (nextChoice==7 && !backToMainMenu) {
                backToMenuOption();
                nextChoice = scanner.nextInt();
            }
        }
    }

    public boolean customerMenuBlock(boolean backToMainMenu) {
            customerServiceMenu();
            int customerChoice = scanner.nextInt();
            switch (customerChoice) {
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
                    System.out.println("Invalid Account Service Option...");
            }
        return backToMainMenu;
    }

    public void customerServices(){
        boolean backToMainMenu = false;
        int nextChoice = 7;
        while (!backToMainMenu) {
            if (nextChoice == 7) {
                backToMainMenu = customerMenuBlock(backToMainMenu);
            } else if (nextChoice == 9) {
                backToMainMenu = true;
            } else if (nextChoice == 0) {
                System.exit(0);
            } else {
                System.out.println("press a valid choice");
            }
            if (nextChoice==7 && !backToMainMenu) {
                backToMenuOption();
                nextChoice = scanner.nextInt();
            }
        }

    }

    public boolean otherServicesMenuBlock(boolean backToMainMenu){
        otherServiceMenu();
        int otherServiceChoice = scanner.nextInt();
        switch (otherServiceChoice) {
            case 1:
                System.out.println("International roaming system service called.....");
                break;
            case 2:
                System.out.println("Value-added services (VAS) called....");
                break;
            case 3:
                System.out.println("Lost or stolen phone service called....");
                break;
            case 9:
                System.out.println("Main Menu called...");
                backToMainMenu = true;
                break;
            default:
                System.out.println("Invalid Other Services Option...");
        }
        return backToMainMenu;
    }

    public void otherServices() {
        boolean backToMainMenu = false;
        int nextChoice = 7;
        while (!backToMainMenu) {
            if (nextChoice == 7) {
                backToMainMenu = otherServicesMenuBlock(backToMainMenu);
            } else if (nextChoice == 9) {
                backToMainMenu = true;
            } else if (nextChoice == 0) {
                System.exit(0);
            } else {
                System.out.println("press a valid choice");
            }
            if (nextChoice==7 && !backToMainMenu) {
                backToMenuOption();
                nextChoice = scanner.nextInt();
            }
        }

    }
}
