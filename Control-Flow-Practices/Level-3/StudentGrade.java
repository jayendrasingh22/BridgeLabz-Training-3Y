import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int physics = scanner.nextInt();
        int chemistry = scanner.nextInt();
        int maths = scanner.nextInt();
        scanner.close();

        double average = (physics + chemistry + maths) / 3.0;
        char grade;
        String remarks;

        if (average >= 90) {
            grade = 'A';
            remarks = "Excellent";
        } else if (average >= 80) {
            grade = 'B';
            remarks = "Very Good";
        } else if (average >= 70) {
            grade = 'C';
            remarks = "Good";
        } else if (average >= 60) {
            grade = 'D';
            remarks = "Satisfactory";
        } else {
            grade = 'F';
            remarks = "Fail";
        }

        System.out.printf("Average Mark: %.2f\n", average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}