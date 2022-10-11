package numberGame;
import java.util.*;

public class GuessingG {
	 // Function that executes the
    // number guessing game
    public static void
    guessingNumberGame()
    {
        
        Scanner userguess = new Scanner(System.in);
 
        // Generate the numbers
        int number = 1 + (int)(100
                               * Math.random());
 
        // Given 5 tries
        int tries = 5;
 
        int i, guess;
 
        System.out.println(
            "Can you guess what number I am thinking between 1-100?"
            + "\nYou have 5 chances to guess"
            + "\nLet's Begin!");
        try {
        	   
            // pause for 2 seconds
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace(); 
        }
        // Iterate over tries
        for (i = 0; i < tries; i++) {
 
            System.out.println(
                "Take a guess:");
 
            // Take input for guessing
            guess = userguess.nextInt();
 
            // If the number is guessed
            if (number == guess) {
                System.out.println(
                    "Congratulations!"
                    + "You did it!!" + " You guessed the number!");
                break;
            }
            else if (number > guess
                     && i != tries - 1) {
                System.out.println(
                    "Try again" + "\nThe number is "
                    + "greater than " + guess);
            }
            else if (number < guess
                     && i != tries - 1) {
                System.out.println(
                    "Try again" +"\nThe number is"
                    + " less than " + guess);
            }
        }
 
        if (i == tries) {
            System.out.println(
                "Oops you have ran out of guesses!");
            try {
            	   
                // pause for 2 seconds
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace(); 
            }
            System.out.println(
                "The number was " + number);
        }
    }
    public static void
    main(String arg[])
    {
 
        // Function Call
        guessingNumberGame();
    }
}

