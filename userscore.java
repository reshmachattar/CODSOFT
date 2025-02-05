//task1
//question 7
//display user score which can based on number of attempts taken or round
import java.util.Scanner;
import java.util.Random;

public class userscore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String playAgain;
        int totalAttempts = 0;  
        int roundsPlayed = 0;   
        
        do {
            
            int numberToGuess = random.nextInt(100) + 1;
            int userGuess = 0;
            int attempts = 0;
            
            System.out.println("Welcome to the Guessing Game!");
            
            
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
            
    
            totalAttempts += attempts;
            roundsPlayed++;
            
            
            System.out.println("Your score after this round is: " + attempts + " attempts.");
            System.out.println("Total attempts across " + roundsPlayed + " rounds: " + totalAttempts);
            
            
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next();
            
        } while (playAgain.equalsIgnoreCase("yes"));
        
        
        System.out.println("\nThank you for playing!");
        System.out.println("You played " + roundsPlayed + " rounds with a total of " + totalAttempts + " attempts.");
        
        scanner.close();
    }
}
