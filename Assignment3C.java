// Assignment 3C

import java.util.Locale;
import java.util.Scanner;

public class Assignment3C {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String choice = "";
        double dues;

        System.out.println("[KSU Club Suggestions]");
        System.out.print("Do you want an indoor or outdoor club?: ");

        while (!choice.toLowerCase().equals("indoor") && !choice.toLowerCase().equals("outdoor") && !choice.toLowerCase().equals("neither")) {
            choice = sc.nextLine();
        }
        choice = choice.toLowerCase();

        System.out.print("How much are you willing to pay in dues?: ");
        dues = sc.nextDouble();

        if (choice.equals("neither")) {
            System.out.println("Sorry, that's not a valid option.");
        }
        else if (choice.equals("indoor")) {
            if (dues < 5 && dues > 0) {
                System.out.println("You could join the Chess club!");
            } else if (dues >= 5) {
                System.out.println("You could join the Virtual Reality club!");
            }
        }
        else if (choice.equals("outdoor")) {
            if (dues < 5 && dues > 0) {
                System.out.println("You could join the Running club!");
            } else if (dues >= 5) {
                System.out.println("You could join the Medieval Combat Sports club!");
            }
        }
    }
}
