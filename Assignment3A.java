// Assignment 3A

import java.util.Scanner;

public class Assignment3A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String choice = "";
        int howMany;

        System.out.println("Welcome to the KSU Bookstore!");
        System.out.print("Do you want to purchase Scrappy dolls?: ");

        while (!choice.toLowerCase().equals("yes")) {
            choice = sc.nextLine();

            if (choice.toLowerCase().equals("no")) {
                System.out.println("Have a nice day!");
                System.exit(0);
            }
        }

        System.out.print("How many Scrappy dolls do you want to buy?: ");
        howMany = sc.nextInt();

        if (howMany <= 0) {
            System.out.println("Have a nice day!");
            System.exit(0);
        }

        if (howMany <= 5) {
            System.out.println(howMany + " Scrappy dolls cost $" + howMany * 2 + ".00. Thank you!");
            System.out.println("Have a nice day!");
        } else {
            System.out.println(howMany + " Scrappy dolls cost $" + ((howMany * 2) - ((howMany * 2) * 0.1)) + "0. Thank you!");
            System.out.println("Have a nice day!");
        }
    }
}
