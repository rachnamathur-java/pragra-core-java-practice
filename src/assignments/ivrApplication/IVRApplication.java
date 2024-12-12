package assignments.ivrApplication;
import assignments.ivrApplication.services.Services;
import java.util.Scanner;

public class IVRApplication {
    public static void main(String[] args) {

        Services services = new Services();

        Scanner scanner = new Scanner(System.in);
        int langaugeChoice = services.executeLangaugeMenu(scanner);

        if (langaugeChoice == 1) {
            System.out.println("English Language Selected...");
            services.executeServicesMenu(scanner);
        } else
            System.out.println("French Language Selected...");
    }
}
