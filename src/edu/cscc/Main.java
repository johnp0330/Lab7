package edu.cscc;
import java.util.*;

/**
 * John Phan, Lab7, 2/25/2020
 * Creating Rock, Paper, Scissor, Lizard, Spock game
 */
public class Main {
    /**
     * Creating input for user
     */
    private static Scanner input = new Scanner(System.in);

    /**
     * Creating variables
     */
    public static void main(String[] args) {
        String h_pick;
        String c_pick;
        String answer;
        boolean isValid;
/**
 * Loops to make sure the user enter the correct choices
 */
        do {
            System.out.println("Let's play rock, paper, scissors, lizard, spock");
            do {
                System.out.print("Enter your choice: ");
                h_pick = input.nextLine();
                isValid = RPSLSpock.isValidPick(h_pick);
                if (!isValid) {
                    System.out.println(h_pick + " is not a valid choice");
                }
            } while (!isValid);

            c_pick = RPSLSpock.generatePick();
            System.out.print("Computer picked " + c_pick + "  ");

            if (c_pick.equalsIgnoreCase(h_pick)) {
                System.out.println("Tie!");
            } else if (RPSLSpock.isComputerWin(c_pick, h_pick)) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }
/**
 * Let the user choose to play again or end the game
 */
            System.out.print("Play again ('y' or 'n'): ");
            answer = input.nextLine();
        } while ("Y".equalsIgnoreCase(answer));
        System.out.println("Live long and prosper!");
    }
}