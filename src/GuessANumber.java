import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
  public static void main(String[] args) {
    int secretNumber = -1;
    int guessedNumber = -1;
    int numberOfGuesses = 0;
    boolean keepRunning = true;
    Random random = new Random();
    Scanner keyboard = new Scanner(System.in);

    System.out.println("\nWelcome to Guess A Number!");
    System.out.println("\nI am thinking of a number between 1 and 10.\n");
    while (keepRunning == true && numberOfGuesses < 3) {
      numberOfGuesses++;
      System.out.print("What is your guess? ");
      secretNumber = random.nextInt(10) + 1;
      guessedNumber = keyboard.nextInt();
      if (guessedNumber < secretNumber) {
        System.out.println("No, mine is higher.");
      } else if (guessedNumber > secretNumber) {
        System.out.println("No, mine is lower.");
      } else {
          System.out.println("Exactly! You're really good!");
          keepRunning = false;
      }
    }
  }
}
