import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int count = 0;
        int tempNumber = number;

        if (tempNumber == 0) {
            count = 1;
        } else {
            while (tempNumber != 0) {
                tempNumber /= 10;
                count++;
            }
        }
        System.out.println("Number of digits: " + count);
    }
}