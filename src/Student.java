package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Student {
    public static void main(String[] args) {
        String filePath = "data.csv"; // Path to your CSV file

        try {
            // Read the CSV file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            // Print table headers
            String headers = reader.readLine();
            String[] headerColumns = headers.split(",");
            printRow(headerColumns);

            // Print table rows
            String line;
            while ((line = reader.readLine()) != null) {
                String[] rowData = line.split(",");
                printRow(rowData);
            }

            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
        }
    }

    // Print a row of data as a table
    public static void printRow(String[] rowData) {
        for (int i = 0; i < rowData.length; i++) {
            System.out.printf("%-15s", rowData[i]); // Adjust column width as needed
            if (i < rowData.length - 1) {
                // Add 6 extra spaces between columns
                for (int j = 0; j < 6; j++) {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }
}
