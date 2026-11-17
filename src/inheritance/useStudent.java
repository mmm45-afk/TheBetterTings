package inheritance;
import java.util.Scanner;

public class useStudent {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get student details
        System.out.print("Enter Student Number: ");
        String studentNumber = input.nextLine();

        System.out.print("Enter Test Result: ");
        double test = input.nextDouble();

        System.out.print("Enter Assignment Result: ");
        double assignment = input.nextDouble();

        System.out.print("Enter Exam Result: ");
        double exam = input.nextDouble();

        // Create Student_Report object
        Student_Report student = new Student_Report(
            studentNumber,
            test,
            assignment,
            exam
        );

        // Print student report
        student.print_report();

        // Close Scanner
        input.close();
    }
}
