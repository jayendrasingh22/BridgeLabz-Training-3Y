import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight = scanner.nextDouble();
        double heightCm = scanner.nextDouble();
        scanner.close();

        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);

        System.out.printf("Your BMI is: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi < 25) {
            System.out.println("Weight Status: Normal weight");
        } else if (bmi < 30) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obesity");
        }
    }
}