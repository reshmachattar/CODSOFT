//task 1
//compare the user guess with the generated number and provide feedback on 
 //whether the geuss is correct to high or too low  java program
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        
        Random rand = new Random();
        
        int randomNumber = rand.nextInt(100) + 1;

        
        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        boolean isCorrect = false;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100.");
        System.out.println("Try to guess it!");

        
        while (!isCorrect) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

        
            if (guess < randomNumber) 
            {
                System.out.println("Your guess is too low. Try again.");
            } else if (guess > randomNumber) 
            {
                System.out.println("Your guess is too high. Try again.");
            } else 
            {
                System.out.println("Congratulations! Your guess is correct.");
                isCorrect = true;
            }
        }

        scanner.close();
    }
}
