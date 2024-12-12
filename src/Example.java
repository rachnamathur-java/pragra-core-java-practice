

import java.util.Scanner;

public class Example {
    static Scanner  keyboard =  new Scanner(System.in);
    private static String lastChoice;
    private  static Integer planChoose;



    public void displayDashboard(){
        boolean display  =  true;
        while (display) {
            displayMenu();
            int choice  =  getUserChoice();
            processChoice(choice);
            System.out.println();
        }
    }

    public static void displayMenu(){
        System.out.println("***************\nWelcome to Rogers\n***************");
        System.out.println("Please choose one of these options");
        System.out.println("1.Mobile");
        System.out.println("2.Internet");
        System.out.println("3.TV&Streaming");
        System.out.println("4.Home Security");
        System.out.println("5.Exit");
    }

    public static int getUserChoice(){
        System.out.print("Enter one of these option: ");
        return keyboard.nextInt();
    }

    public void processChoice(int choice) {
        switch (choice) {
            case 1:
                mobileDeals();
                break;
            case 2:
                internetDeals();
                break;
            case 3:
                tvStreaming();
                break;
            case 4:
                homeSecurity();
                break;
            case 5:
                exitApplication();
                break;
            default:
                System.out.println("Sorry wrong input try again");
                displayMenu();
        }
    }

    public void mobileDeals(){
        System.out.println("Which mobile deals you want to choose ?");
        System.out.println("1.5G Infinite Essential");
        System.out.println("2.5G Infinite Extra");
        System.out.println("3.5G Infinite Premium");
        System.out.println("4.Go back to Main menu");
        System.out.print("Enter one of these option: ");
        planChoose = keyboard.nextInt();
        switch (planChoose) {
            case 1:
                System.out.println("5G Infinite Essential");
                chekcoutfirstPlam();
                break;
            case 2:
                System.out.println("5G Infinite Extra");
                checkOutSecondPlan();
                break;
            case 3:
                System.out.println("5G Infinite Premium ");
                checkOutThirdPlan();
                break;
            case 4:
                displayMenu();
                break;
            default:
                System.out.println("Sorry we don't have that plan please visit us later");
                System.exit(0);
        }
    }

    public void internetDeals(){
        System.out.println("Which internet are you interested ?");
        System.out.println("1.5G Home internet");
        System.out.println("2.Starter");
        System.out.println("3.Essentials");
        System.out.println("4.Go Back");
        System.out.print("Enter one of these option: ");
        planChoose = keyboard.nextInt();
        switch (planChoose){
            case 1:
                System.out.println("5G Home internet ");
                checkOutFirstInternet();
                break;
            case 2:
                System.out.println("Starter pack");
                checkOutSecondInternet();
                break;
            case 3:
                System.out.println("Essential pack");
                checkOutThirdInternet();
                break;
            case 4 :
                displayMenu();
                break;
            default:
                System.out.println("Sorry we don't have this deals for now visit us later");
                System.exit(0);

        }
    }

    public void tvStreaming(){
        System.out.println("Which TV&Streaming deals you want to choose ?");
        System.out.println("1.Essential");
        System.out.println("2.Popular TV");
        System.out.println("3.Ultimate TV");
        System.out.println("4.Go back to Main menu");
        System.out.print("Enter one of these option: ");
        planChoose = keyboard.nextInt();
        switch (planChoose) {
            case 1:
                System.out.println("Essential Deals");
                chekcoutfirstTVPlam();
                break;
            case 2:
                System.out.println("Popular TV");
                checkOutSecondTVPlan();
                break;
            case 3:
                System.out.println("Ultimate TV");
                checkOutThirdTVPlan();
                break;
            case 4:
                displayMenu();
                break;
            default:
                System.out.println("Sorry we don't have that plan please visit us later");
                System.exit(0);
        }
    }

    public void homeSecurity(){
        System.out.println("We have only one plan for Home Security");
        System.out.println("1.Rogers Xfinity Self Protection, TV and Internet");
        System.out.println("2.Go Back");
        planChoose = keyboard.nextInt();
        switch (planChoose) {
            case 1:
                System.out.println("Rogers Xfinity Self Protection, TV and Internet ");
                checkOutHomeSecurity();
                break;
            case 2:
                displayMenu();
                break;
            default:
                System.out.println("Sorry We don't have that plan Bye");
                System.exit(0);

        }
    }

    public void  exitApplication(){
        System.out.println("Thank you for visiting Rogers Application.");
        System.exit(0);
    }

    public void chekcoutfirstPlam(){
        System.out.println("You chose 5G Infinite Essential.\nIt Includes: ");
        System.out.println("Access to Rogers 5G/5G+ network\n" +
                "75 GB 100 GB at speeds up to 1 Gbps. Unlimited data at reduced speeds thereafter*\n" +
                "Unlimited Canada-wide talk and text1\n" +
                "Unlimited international messaging from Canada4");
        System.out.println("It will be 50$ and No Additional Charges");
        System.out.print("Are you sure you want take this plan ?");
        lastChoice = keyboard.next();
        if(lastChoice.equals("yes")){
            System.out.println("Thank you for choosing 5G Infinite Essential Plan ");
            System.exit(0);
        } else if(lastChoice.equals("no")) {
            mobileDeals();
        } else  {
            System.out.println("Wrong input System Failure");
            System.exit(0);
        }

    }

    public void checkOutSecondPlan(){
        System.out.println("You chose 5G Infinite Extra.\nIt Includes: ");
        System.out.println("Access to Rogers 5G/5G+ network\n" +
                "150 GB 175 GB at speeds up to 1 Gbps. Unlimited data at reduced speeds thereafter*\n" +
                "Unlimited Canada-wide talk and text1\n" +
                "Unlimited international messaging from Canada4\n" +
                "1000 International Long Distance minutes to select countries16");
        System.out.println("It will be 60$ and No Additional Charges");
        System.out.print("Are you sure you want take this plan ?");
        lastChoice = keyboard.next();
        if(lastChoice.equals("yes")){
            System.out.println("Thank you for choosing 5G Infinite Extra ");
            System.exit(0);
        } else if(lastChoice.equals("no")) {
            mobileDeals();
        } else  {
            System.out.println("Wrong input System Failure");
            System.exit(0);
        }
    }

    public void checkOutThirdPlan(){
        System.out.println("You chose 5G Infinite Premium.\nIt Includes: ");
        System.out.println("Access to Rogers 5G/5G+ network\n" +
                "175 GB 200 GB at speeds up to 1 Gbps. Unlimited data at reduced speeds thereafter*\n" +
                "Unlimited international messaging from Canada4\n" +
                "1000 International Long Distance minutes to select countries18\n" +
                "\n" +
                "Travel Features\n" +
                "\n" +
                "Use your plan's calling, texting and data allotment within Canada, the U.S. and Mexico2\n" +
                "Unlimited international messaging from the U.S. and Mexico17\n" +
                "1000 International Long Distance minutes to select countries from the U.S. and Mexico18");
        System.out.println("It will be 80$ and No Additional Charges");
        System.out.print("Are you sure you want take this plan ?");
        lastChoice = keyboard.next();
        if(lastChoice.equals("yes")){
            System.out.println("Thank you for choosing 5G  Infinite Premium ");
            System.exit(0);
        } else if(lastChoice.equals("no")) {
            mobileDeals();
        } else  {
            System.out.println("Wrong input System Failure");
            System.exit(0);
        }
    }

    public void checkOutFirstInternet(){
        System.out.println("You chose 5G Home internet.\nIt Includes: ");
        System.out.println("Powered by our 5G mobile network\n" +
                "Easy set up – just plug and play\n" +
                "100 Mbps download speed1\n" +
                "Good for 1-3 devices");
        System.out.println("It will be 60$ and No Additional Charges");
        System.out.print("Are you sure you want take this plan ?");
        lastChoice = keyboard.next();
        if(lastChoice.equals("yes")){
            System.out.println("Thank you for choosing 5G Home internet ");
            System.exit(0);
        } else if(lastChoice.equals("no")) {
            internetDeals();
        } else  {
            System.out.println("Wrong input System Failure");
            System.exit(0);
        }
    }

    public void checkOutSecondInternet(){
        System.out.println("You chose Starter Plan.\nIt Includes: ");
        System.out.println("Powered by Rogers Xfinity Internet\n" +
                "Supports streaming, TV and security\n" +
                "100 Mbps download speeds1\n" +
                "Unlimited usage for up to 10 devices");
        System.out.println("It will be 75$ and No Additional Charges");
        System.out.print("Are you sure you want take this plan ?");
        lastChoice = keyboard.next();
        if(lastChoice.equals("yes")){
            System.out.println("Thank you for choosing Starter Internet Plan ");
            System.exit(0);
        } else if(lastChoice.equals("no")) {
            internetDeals();
        } else  {
            System.out.println("Wrong input System Failure");
            System.exit(0);
        }
    }

    public void checkOutThirdInternet(){
        System.out.println("You chose Essentials Plan.\nIt Includes");
        System.out.println("Powered by Rogers Xfinity Internet\n" +
                "Supports streaming, TV and security\n" +
                "250 Mbps download speeds1\n" +
                "Unlimited usage for 10-15 devices");
        System.out.println("It will be 95$ and No Additional Charges");
        System.out.print("Are you sure you want take this plan ?");
        lastChoice = keyboard.next();
        if(lastChoice.equals("yes")){
            System.out.println("Thank you for choosing Essentials Internet Plan ");
            System.exit(0);
        } else if(lastChoice.equals("no")) {
            internetDeals();
        } else  {
            System.out.println("Wrong input System Failure");
            System.exit(0);
        }
    }

    public void chekcoutfirstTVPlam(){
        System.out.println("You chose Essentials Plan.\nIt Includes");
        System.out.println("Up to 35 channels\n" +
                "Local news and Canadian stations");
        System.out.println("It will be 25$ and No Additional Charges");
        System.out.print("Are you sure you want take this plan ?");
        lastChoice = keyboard.next();
        if(lastChoice.equals("yes")){
            System.out.println("Thank you for choosing Essentials TV Plan ");
            System.exit(0);
        } else if(lastChoice.equals("no")) {
            tvStreaming();
        } else  {
            System.out.println("Wrong input System Failure");
            System.exit(0);
        }
    }

    public void checkOutSecondTVPlan(){
        System.out.println("You chose Popular TV.\nIt Includes: ");
        System.out.println("Up to 116 channels\n" +
                "Popular sports, TV and movies");
        System.out.println("It will be 55$ and No Additional Charges");
        System.out.print("Are you sure you want take this plan ?");
        lastChoice = keyboard.next();
        if(lastChoice.equals("yes")){
            System.out.println("Thank you for choosing Popular TV Plan ");
            System.exit(0);
        } else if(lastChoice.equals("no")) {
            tvStreaming();
        } else  {
            System.out.println("Wrong input System Failure");
            System.exit(0);
        }
    }

    public void checkOutThirdTVPlan(){
        System.out.println("You chose Ultimate  TV.\nIt Includes: ");
        System.out.println("Up to 154 channels\n" +
                "More news, sports + entertainment");
        System.out.println("It will be 55$ and No Additional Charges");
        System.out.print("Are you sure you want take this plan ?");
        lastChoice = keyboard.next();
        if(lastChoice.equals("yes")){
            System.out.println("Thank you for choosing Ultimate TV Plan ");
            System.exit(0);
        } else if(lastChoice.equals("no")) {
            tvStreaming();
        } else  {
            System.out.println("Wrong input System Failure");
            System.exit(0);
        }
    }

    public void checkOutHomeSecurity(){
        System.out.println("You chose Rogers Xfinity Self Protection.\nIt Includes: ");
        System.out.println("Unlimited 1 Gbps speed\n" +
                "Up to 154 channels (varies by region)\n" +
                "Disney+ Standard with Ads\n" +
                "More news, sports + entertainment\n" +
                "Includes 24/7 Video Recording on us\n" +
                "Includes 1 camera rental on us");
        System.out.println("It will be 190$ and No Additional Charges");
        System.out.print("Are you sure you want take this plan ?");
        lastChoice = keyboard.next();
        if(lastChoice.equals("yes")){
            System.out.println("Thank you for choosing Rogers Xfinity Self Protection Plan ");
            System.exit(0);
        } else if(lastChoice.equals("no")) {
            homeSecurity();
        } else  {
            System.out.println("Wrong input System Failure");
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        Example example = new Example();
        example.displayDashboard();
    }
}
