import java.util.Scanner;

public class FriendComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageAmar = scanner.nextInt();
        double heightAmar = scanner.nextDouble();
        int ageAkbar = scanner.nextInt();
        double heightAkbar = scanner.nextDouble();
        int ageAnthony = scanner.nextInt();
        double heightAnthony = scanner.nextDouble();
        scanner.close();

        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("Amar is the youngest.");
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            System.out.println("Akbar is the youngest.");
        } else {
            System.out.println("Anthony is the youngest.");
        }

        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Amar is the tallest.");
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            System.out.println("Akbar is the tallest.");
        } else {
            System.out.println("Anthony is the tallest.");
        }
    }
}
