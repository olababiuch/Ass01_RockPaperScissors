import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playA = "";
        String playB = "";
        String playAgain = "";
        String trash = "";
        boolean done = false;

        do {
            // Player A input
            done = false;
            do {
                System.out.print("Enter move for Player A [R, P, S]: ");
                if (in.hasNextLine()) {
                    playA = in.nextLine();
                    if (playA.equalsIgnoreCase("R") || playA.equalsIgnoreCase("P") || playA.equalsIgnoreCase("S")) {
                        done = true;
                    } else {
                        trash = playA;
                        System.out.println("Player A must enter a valid move, not \"" + trash + "\".");
                    }
                }
            } while (!done);

            // Player B input
            done = false;
            do {
                System.out.print("Enter move for Player B [R, P, S]: ");
                if (in.hasNextLine()) {
                    playB = in.nextLine();
                    if (playB.equalsIgnoreCase("R") || playB.equalsIgnoreCase("P") || playB.equalsIgnoreCase("S")) {
                        done = true;
                    } else {
                        trash = playB;
                        System.out.println("Player B must enter a valid move, not \"" + trash + "\".");
                    }
                }
            } while (!done);

            // Result display
            System.out.println("\nPlayer A: " + playA.toUpperCase() + "   Player B: " + playB.toUpperCase());

            if (playA.equalsIgnoreCase("R")) {
                if (playB.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock! It's a Tie!");
                } else if (playB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock! Player B Wins!");
                } else {
                    System.out.println("Rock breaks Scissors! Player A Wins!");
                }
            } else if (playA.equalsIgnoreCase("P")) {
                if (playB.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper! It's a Tie!");
                } else if (playB.equalsIgnoreCase("S")) {
                    System.out.println("Scissors cut Paper! Player B Wins!");
                } else {
                    System.out.println("Paper covers Rock! Player A Wins!");
                }
            } else if (playA.equalsIgnoreCase("S")) {
                if (playB.equalsIgnoreCase("S")) {
                    System.out.println("Scissors vs Scissors! It's a Tie!");
                } else if (playB.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors! Player B Wins!");
                } else {
                    System.out.println("Scissors cut Paper! Player A Wins!");
                }
            }

            // Ask to play again
            done = false;
            do {
                System.out.print("\nDo you want to play again? [Y/N]: ");
                if (in.hasNextLine()) {
                    playAgain = in.nextLine();
                    if (playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N")) {
                        done = true;
                    } else {
                        trash = playAgain;
                        System.out.println("Please enter Y or N, not \"" + trash + "\".");
                    }
                }
            } while (!done);

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("\nThanks for playing!");
    }
}
