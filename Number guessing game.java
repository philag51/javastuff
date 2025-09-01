import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        System.out.println("Hello! Enter a number between 1 & 10 and I'll try to guess it!");

        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10)); // Array of numbers 1-10

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numero;

        // Get valid user input
        while (true) {
            System.out.print("Enter a number between 1 and 10: ");
            numero = scanner.nextInt();

            if (numero >= 1 && numero <= 10) {
                System.out.println("You entered: " + numero);
                break;  // exit loop if valid
            } else {
                System.out.println("Invalid number! Try again.");
            }
        }

        // Generate random guess
        int guess = random.nextInt(10) + 1; // 1-10 inclusive

        // Check if guess matches
        if (guess == numero) {
            System.out.println("You entered " + numero + " and I guessed " + guess + ". I was right!");
        } else {
            System.out.println("Nope, I was wrong! You entered " + numero + " and I guessed " + guess + ".");
        }

        scanner.close();
    }
}
