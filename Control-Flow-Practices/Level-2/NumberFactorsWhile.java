import java.util.Scanner;

public class NumberFactorsWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        if (number > 0) {
            int i = 1;
            System.out.print("Factors of " + number + " are: ");
            while (i <= number) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
                i++;
            }
            System.out.println();
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
