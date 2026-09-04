package string.class_problems;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors  {

    public static String playRound(String playerMove, String computerMove) {

        if (playerMove.equals(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
            return "Player Wins";
        }

        return "Computer Wins";
    }

    public static String getComputerMove() {
        Random random = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};

        return moves[random.nextInt(3)];
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rounds = 5;
        int wins = 0;
        int losses = 0;
        int draws = 0;

        System.out.println("Round | Player | Computer | Result");

        for (int i = 1; i <= rounds; i++) {

            System.out.print("Enter Rock, Paper or Scissors: ");
            String playerMove = scanner.nextLine();

            String computerMove = getComputerMove();

            String result = playRound(playerMove, computerMove);

            System.out.println(i + " | " + playerMove + " | "
                    + computerMove + " | " + result);

            if (result.equals("Player Wins")) {
                wins++;
            } else if (result.equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }
        }

        double winPercentage = (wins * 100.0) / rounds;

        System.out.println("\nWins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.println("Win %: " + winPercentage);

        scanner.close();
    }
}