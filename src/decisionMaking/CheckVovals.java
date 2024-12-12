package decisionMaking;

import java.util.Scanner;

public class CheckVovals
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = scanner.nextLine().charAt(0);


        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            System.out.println("ch is vowel");
        }
        else
        {
            System.out.println("ch is consonent");
        }
    }
}
