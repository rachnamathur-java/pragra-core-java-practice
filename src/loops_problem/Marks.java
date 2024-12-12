package loops_problem;

import java.util.Scanner;

public class Marks
{
    public static void main(String[] args)
    {
        Marks marks = new Marks();


        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        boolean isValid = false;
        String input = "";
        do
        {
            System.out.println("Enter marks");

            input = myObj.nextLine();
            if (input.isBlank()) {
                System.out.println("invalid input , please try again");
                //System.exit(1);
            }
            isValid =true;
        }while (isValid);

        int inputMarks = Integer.parseInt(input);
        String grade = marks.calculatedByIfMethod(inputMarks);
        System.out.println("grade is :   " + grade);

    }

    private String calculatedByIfMethod(int marks)
    {
        if (marks < 100 && marks >= 90 )
            return "A+";
        else if (marks < 90 && marks >=80)
            return "A";
        else if (marks < 80 && marks >=70)
            return "B+";
        else if (marks <70 && marks >= 60)
            return "B";
        else if (marks <60 && marks >= 50)
            return "C+";
        else if (marks <50 && marks >= 40)
            return "C";
        else
            return "Fail";
    }

}
