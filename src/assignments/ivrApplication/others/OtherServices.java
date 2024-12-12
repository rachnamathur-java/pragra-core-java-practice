package assignments.ivrApplication.others;

import assignments.ivrApplication.utils.Utils;

import java.util.Scanner;

public class OtherServices {
    public void otherServiceMenu(){
        Utils.printLineSeparator();
        System.out.println("1. International roaming");
        System.out.println("2. Value-added services (VAS)");
        System.out.println("3. Lost or stolen phone");
        System.out.println("Press 9 to return Main Menu ");
        System.out.println("Press 0 to Exit ");
        Utils.printLineSeparator();
        System.out.println("Enter your Other Service choice...");
        //Utils.printLineSeparator();
    }

    public boolean otherServicesMenuBlock(boolean backToMainMenu, Scanner scanner){
        otherServiceMenu();
        int otherServiceChoice = scanner.nextInt();
        switch (otherServiceChoice) {
            case 0:
                System.out.println(" You are Exited...");
                System.exit(0);
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
    public void executeOtherServices(Scanner scanner) {
        boolean backToMainMenu = false;
        int nextChoice = 7;
        while (!backToMainMenu) {
            if (nextChoice == 7) {
                backToMainMenu = otherServicesMenuBlock(backToMainMenu, scanner);
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
