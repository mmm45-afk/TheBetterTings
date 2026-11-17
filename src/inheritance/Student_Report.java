package inheritance;
public class Student_Report extends Student {

    // Constructor
    public Student_Report(String studentNumber, double test,
                          double assignment, double exam) {

        super(studentNumber, test, assignment, exam);
    }

    // Implement print_report method
    @Override
    public void print_report() {

        // Calculate assessment weightings
        double testMark = getTest() * 0.25;

        double assignmentMark = getAssignment() * 0.25;

        double examMark = getExam() * 0.50;

        // Calculate final result
        double finalResult = testMark + assignmentMark + examMark;

        // Display student report
        System.out.println("\n========== STUDENT REPORT ==========");

        System.out.println("Student Number: " + getStudentNumber());

        System.out.println("------------------------------------");

        System.out.println("Test Result:       " + getTest());
        System.out.println("Test Weighting:    " + testMark);

        System.out.println("Assignment Result: " + getAssignment());
        System.out.println("Assignment Weight: " + assignmentMark);

        System.out.println("Exam Result:       " + getExam());
        System.out.println("Exam Weighting:    " + examMark);

        System.out.println("------------------------------------");

        System.out.printf("FINAL RESULT:      %.2f%%%n", finalResult);

        System.out.println("====================================");
    }
}
