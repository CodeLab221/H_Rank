import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;
        int guessTaken = 0;
        Scanner scanner = new Scanner(System.in);

        for (guessTaken = 1; guessTaken <= 10; guessTaken++) {
            System.out.println("Take a guess.");
            guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("Your guess is too low.");
            } else if (guess > secretNumber) {
                System.out.println("Your guess is too high.");
            } else {
                break; // This condition is the right guess!
            }
        }

        if (guess == secretNumber) {
            System.out.println("You guessed my number in " + guessTaken + " guesses!");
        } else {
            System.out.println("Nope. The number I was thinking of was " + secretNumber + ".");
        }
         

        scanner.close();
    }
}
