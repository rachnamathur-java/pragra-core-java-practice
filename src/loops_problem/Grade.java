package loops_problem;

import java.util.Scanner;

public class Grade
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter marks");

        String input = sc.nextLine();
        int inputMarks = Integer.parseInt(input);

        if (inputMarks <= 100 && inputMarks >= 90 ) {
            System.out.println("A+");
        }
        else if (inputMarks < 90 && inputMarks >=80) {
            System.out.println("A");
        }
        else if (inputMarks < 80 && inputMarks >=70) {
            System.out.println("B+");
        }
        else if ((inputMarks <70) && (inputMarks >= 60)) {
            System.out.println("B");
        }
        else if (inputMarks <60 && inputMarks >= 50) {
            System.out.println("C+");
        }
        else if (inputMarks <50 && inputMarks >= 40) {
            System.out.println("C");
        }
        else
        System.out.println("fail");

    }
}
