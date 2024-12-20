import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int numberToGuess = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess, attempts = 0;

        System.out.println("Guess the number (between 1 to 100):");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
    }
}
