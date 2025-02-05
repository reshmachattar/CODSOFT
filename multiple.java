//task1
//question 6
//Add the option for multiple round allowing the user play again
import java.util.Scanner;
import java.util.Random;

public class multiple{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String playAgain;
        
        do {
            // Generate a random number between 1 and 100
            int numberToGuess = random.nextInt(100) + 1;
            int userGuess = 0;
            int attempts = 0;
            
            System.out.println("Welcome to the Guessing Game!");
            
            // Game loop
            while (userGuess != numberToGuess) {
                System.out.print("Guess a number between 1 and 100: ");
                userGuess = scanner.nextInt();
                attempts++;
                
                if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                }
            }
            
            // Ask if the user wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next();
            
        } while (playAgain.equalsIgnoreCase("yes"));
        
        System.out.println("Thank you for playing! Goodbye.");
        scanner.close();
    }
}
