import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double first = scanner.nextDouble();
        String op = scanner.next();
        double second = scanner.nextDouble();
        scanner.close();

        double result;

        switch (op) {
            case "+":
                result = first + second;
                System.out.printf("%.2f + %.2f = %.2f\n", first, second, result);
                break;

            case "-":
                result = first - second;
                System.out.printf("%.2f - %.2f = %.2f\n", first, second, result);
                break;

            case "*":
                result = first * second;
                System.out.printf("%.2f * %.2f = %.2f\n", first, second, result);
                break;

            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.printf("%.2f / %.2f = %.2f\n", first, second, result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid Operator.");
                break;
        }
    }
}