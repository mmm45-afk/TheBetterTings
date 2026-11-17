package inheritance;
public abstract class Student implements iReport {

    // Declare variables
    private String studentNumber;
    private double test;
    private double assignment;
    private double exam;

    // Constructor
    public Student(String studentNumber, double test,
                   double assignment, double exam) {

        this.studentNumber = studentNumber;
        this.test = test;
        this.assignment = assignment;
        this.exam = exam;
    }

    // Getter for student number
    public String getStudentNumber() {
        return studentNumber;
    }

    // Getter for test
    public double getTest() {
        return test;
    }

    // Getter for assignment
    public double getAssignment() {
        return assignment;
    }

    // Getter for exam
    public double getExam() {
        return exam;
    }
}
