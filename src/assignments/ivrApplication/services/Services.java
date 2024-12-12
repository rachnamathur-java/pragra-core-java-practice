package assignments.ivrApplication.services;


import assignments.ivrApplication.accounts.AccountService;
import assignments.ivrApplication.customerSupport.CustomerSupport;
import assignments.ivrApplication.others.OtherServices;
import assignments.ivrApplication.utils.Utils;

import java.util.Scanner;

public class Services {
    AccountService accountService = new AccountService();
    CustomerSupport customerSupport = new CustomerSupport();
    OtherServices otherServices = new OtherServices();

    public void langaugeMenu() {
        System.out.println("                                        ");
        System.out.println("------  WELCOME to ROGERS  -------");
        System.out.println("                                        ");
        System.out.println("Press 1 for English");
        System.out.println("Press 2 for French");
    }

    public void servicesMenu(){
        Utils.printLineSeparator();
        System.out.println("Press 1 for Account Service");
        System.out.println("Press 2 for Customer Support");
        System.out.println("Press 3 Other Services");
        System.out.println("Press 0 To Exit");
        Utils.printLineSeparator();
        System.out.println("Enter your choice...");
        //Utils.printLineSeparator();
    }

    public int executeLangaugeMenu(Scanner scanner) {
        langaugeMenu();
        return scanner.nextInt();
    }

    public void executeServicesMenu(Scanner scanner) {
        boolean isTerminated = false;
        while (!isTerminated) {
            servicesMenu();
            int menuChoice = scanner.nextInt();
            switch (menuChoice) {
                case 0:
                    System.out.println("Exit");
                    isTerminated = true;
                    break;
                case 1:
                    System.out.println("Account Service Called...");
                    accountService.executeAccountServices(scanner);
                    break;
                case 2:
                    System.out.println("Customer Service Called...");
                    customerSupport.executeCustomerSupport(scanner);
                    break;
                case 3:
                    System.out.println("Other Services Called...");
                    otherServices.executeOtherServices(scanner);
                    break;
                default:
                    System.out.println("Invalid Menu Option...");
            }

        }
    }
}
