package src;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Teacher {
    public static void main(String[] args) {
        // File path
        String filePath = "data.csv";

        // Set rows and columns
        System.out.println("How many days attendance are you going to take?");
        try (Scanner sc = new Scanner(System.in)) {
            int rows = sc.nextInt();
            int columns = 11; // 1 column for date/time and 10 columns for student attendance

            // Create data array with fixed size
            String[][] data = new String[rows][columns];

            // Take input from the user
            getDataFromUser(data);

            // Append data to the existing CSV file
            appendToCSV(filePath, data);
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    public static void getDataFromUser(String[][] data) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("(1 for present, 0 for absent)");
            // Take input for each cell from the user
            for (int i = 0; i < data.length; i++) {
                // First column (date/time)
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String dateTime = sdf.format(new Date());
                data[i][0] = dateTime;

                // Second to last columns (student attendance)
                for (int j = 1; j < data[i].length; j++) {
                    System.out.print("Enter attendance for Roll Number " + j + ": ");
                    data[i][j] = scanner.next();
                }
            }
        } catch (Exception e) {
            System.err.println("An error occurred while getting input: " + e.getMessage());
        }
    }

    public static void appendToCSV(String filePath, String[][] data) {
        try (FileWriter writer = new FileWriter(filePath, true)) { // append mode enabled
            // Write data
            for (String[] rowData : data) {
                writer.append(String.join(",", rowData));
                writer.append("\n");
            }
            writer.flush();
            System.out.println("Data appended to CSV file successfully.");
        } catch (IOException e) {
            System.err.println("Error occurred while writing to the file: " + e.getMessage());
        }
    }
}
