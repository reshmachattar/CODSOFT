//Generate a random number within a specific range
import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the minimum value: ");
        int min = scanner.nextInt();

        
        System.out.print("Enter the maximum value: ");
        int max = scanner.nextInt();

        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;
        
         System.out.println("Random number between " + min + " and " + max + ": " + randomNumber);
        scanner.close();
    }
}
