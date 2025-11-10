import java.util.Scanner;

public class GradeCalculator {

    // Method to determine the grade based on the average
    // Takes the average score as input and returns a String representing the grade
    public static String remarks(double average) {
        if (average >= 95) {
            return "A";
        } else if (average >= 85) {
            return "B";
        } else if (average >= 80) {
            return "C";
        } else if (average >= 75) {
            return "D";
        } else if (average >= 65) {
            return "F";
        } else {
            return "Failed";
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask for the student's name
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("===============================");

        // Ask for grades for each subject
        System.out.println("Enter your Math grade: ");
        double math = scanner.nextDouble();

        System.out.println("Enter your Science grade: ");
        double science = scanner.nextDouble();

        System.out.println("Enter your English grade: ");
        double english = scanner.nextDouble();

        System.out.println("Enter your Programming grade: ");
        double prog = scanner.nextDouble();

        // Check if any score is invalid (less than 0 or greater than 100)
        if (math < 0 || science < 0 || english < 0 || prog < 0 
            || math > 100 || science > 100 || english > 100 || prog > 100) {
            System.out.println("====== Invalid score entered =====");
            scanner.close(); // Close the scanner before exiting
            return; // Stop the program if invalid input
        }

        // Calculate the average of all four subjects
        double aver = (math + science + english + prog) / 4;

        // Call the remarks method to get the grade based on the average
        String grade = remarks(aver);

        // Print the final details
        System.out.println("========= Details =========");
        System.out.println("Name: " + name);
        System.out.println("Average: " + aver);
        System.out.println("Remarks: " + grade);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
