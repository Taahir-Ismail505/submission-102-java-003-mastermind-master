package za.co.wethinkcode.mastermind;

import java.io.InputStream;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Player {
    private final Scanner inputScanner;

    public Player() {
        this.inputScanner = new Scanner(System.in);
    }

    public Player(InputStream inputStream) {
        this.inputScanner = new Scanner(inputStream);
    }

    /**
     * Gets a guess from user via text console.
     * This must prompt the user to re-enter a guess until a valid 4-digit string is entered, or until the user enters `exit` or `quit`.
     *
     * @return the value entered by the user
     */

    public String getGuess() {
        /**
         * if the length of the user input is not 4 characters it will
         * re run the function until its correct
         * then once its 4 chars it check if its 1 to 8
         * and  for each correct char the "a" counter increases
         * once the "a" counter is 4 it returns the full guess
         */
        while (true) {
            System.out.println("Input 4 digit code:");
            String Guess = inputScanner.nextLine();
            if (Guess.length() == 4) {
                int a = 0;
                for (int i = 0; i < Guess.length(); i++) {
                    char c = Guess.charAt(i);
                    if (c > 48 && c < 57) {
                        a++;
                        if (a == 4) {
                            return Guess;
                        }
                    }
                }
            }
            System.out.println("Please enter exactly 4 digits (each from 1 to 8).");
            continue;
        }
    }

}
