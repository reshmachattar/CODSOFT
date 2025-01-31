//limit the number of attempted the user has to guess the number
import java.util.Scanner;
import java.util.Random;

public class Limitnumber {

    public static void main(String[] args) {
        // Create a random number generator
        Random rand = new Random();
        
        int randomNumber = rand.nextInt(100) + 1;

        
        int maxAttempts = 5;


        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        int attempts = 0;
        boolean isCorrect = false;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");
        System.out.println("Good luck!");

        
        while (!isCorrect && attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            
    
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid integer.");
                
            }}}}