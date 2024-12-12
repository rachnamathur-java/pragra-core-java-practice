package loops_problem;

import java.util.Scanner;

public class Age
{
    public static void main(String[] args)
    {
        Age age = new Age();


        Scanner sc = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter age");

        String input = sc.nextLine();
        if (input.isBlank()) {
            System.out.println("invalid input , please try again");
            //System.exit(1);
        }

        int inputAge = Integer.parseInt(input);
        String category = age.calculateCategory(inputAge);
        System.out.println("category is :   " + category);

    }
    private String calculateCategory(int age)
    {
        if (age < 13)
            return "child";
        else if (age > 12 && age < 20)
            return "teenager";
        else if (age > 19 && age < 60)
            return "adult";
        else
            return "Senior";
    }
}
