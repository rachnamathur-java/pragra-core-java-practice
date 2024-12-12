package loops_problem;

import java.util.Scanner;

public class Ticket
{
    public static void main(String[] args)
    {
        Ticket ticket = new Ticket();


        Scanner sc = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter day");

        String day = sc.nextLine();

        String price = ticket.ticketPrice(day);
        System.out.println("Price is: " + price);

    }
    private String ticketPrice(String day)
    {
        switch(day)
        {
            case "monday", "tuesday", "wednesday", "thursday", "friday":
                return "$10";
            case "saturday":
                return "$15";
            case "sunday":
                return "$12";
            default:
                return "$0";
        }

    }
}
