package loops_problem;

import java.util.Scanner;

public class MarksSimple {

    public static void main(String[] args)
    {
        MarksSimple marks = new MarksSimple();


        Scanner sc = new Scanner(System.in);  // Create a Scanner object

            System.out.println("Enter marks");

            String input = sc.nextLine();
            if (input.isBlank()) {
                System.out.println("invalid input , please try again");
                //System.exit(1);
            }

        int inputMarks = Integer.parseInt(input);
        String grade = marks.gradeCalculation(inputMarks);
        System.out.println("grade is :   " + grade);

    }

    private String gradeCalculation(int marks)
    {
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

}
