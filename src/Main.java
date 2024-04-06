package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean exitRequested;
        Scanner scanner;

        do {
            scanner = new Scanner(System.in); // Create a new Scanner instance for each iteration
            exitRequested = false;

            System.out.println("Choose an option:");
            System.out.println("1. Add Attendance");
            System.out.println("2. View Attendance");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Teacher.main(new String[0]); // Run the main method of Teacher class
                    break;
                case 2:
                    Student.main(new String[0]); // Run the main method of Student class
                    break;
                case 3:
                    exitRequested = true; // Set flag to exit the loop
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            //scanner.close(); // Close the Scanner instance
        } while (!exitRequested);
    }
}
