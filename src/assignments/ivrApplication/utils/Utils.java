package assignments.ivrApplication.utils;

public class Utils {
    public static void printLineSeparator(){
        System.out.println("****************************************");
    }

    public static void backToMenuOption(){
        printLineSeparator();
        System.out.println("Press 9 to return Main Menu");
        System.out.println("Press 0 to Exit");
        System.out.println("Press 7 to continue with Previous Menu");
        printLineSeparator();
    }
}
