import java.util.*;

public class NumberGuessingGame {
    public static int generateGuess(int low, int high) {
        Random r = new Random();
        return r.nextInt(high - low + 1) + low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);
            System.out.println("Enter feedback (low/high/correct): ");
            String feedback = sc.nextLine();
            if (feedback.equals("correct")) {
                System.out.println("Guessed correctly!");
                break;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            }
        }
    }
}