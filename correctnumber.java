

//repeat steps 2 and 3 until the user guess the correct number you can incorporate additional details follows
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        
        Random rand = new Random();
        
        int randomNumber = rand.nextInt(100) + 1;

        
        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        int attempts = 0;
        boolean isCorrect = false;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100.");
        System.out.println("Try to guess it!");

        
        while (!isCorrect) {
            System.out.print("Enter your guess: ");
        
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.next(); 
                System.out.print("Enter your guess: ");
            }
            
            guess = scanner.nextInt();
            attempts++;

            
            if (guess < randomNumber) {
                System.out.println("Your guess is too low. Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Your guess is too high. Try again.");
            } else {
                System.out.println("Congratulations! Your guess is correct.");
                System.out.println("It took you " + attempts + " attempts to guess the correct number.");
                isCorrect = true;
            }
        }

        scanner.close();
    }
}
