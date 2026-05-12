import java.util.Random;

public class SnakeAndLadder {
    
    public static final int WINNING_POSITION = 100;
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Simulator - 2 Player Mode");

        int player1Position = 0;
        int player2Position = 0;
        int diceCount = 0;
        boolean isPlayer1Turn = true;
        Random random = new Random();

        while (player1Position < WINNING_POSITION && player2Position < WINNING_POSITION) {
            
            String currentPlayerName = isPlayer1Turn ? "Player 1" : "Player 2";
            int currentPosition = isPlayer1Turn ? player1Position : player2Position;
            
            int dieRoll = random.nextInt(6) + 1;
            diceCount++;
            int option = random.nextInt(3);

            boolean playAgain = false;

            switch (option) {
                case NO_PLAY:
                    break;
                    
                case LADDER:
                    if (currentPosition + dieRoll <= WINNING_POSITION) {
                        currentPosition += dieRoll;
                    }
                    if (currentPosition < WINNING_POSITION) {
                        playAgain = true; 
                    }
                    break;
                    
                case SNAKE:
                    currentPosition -= dieRoll;
                    if (currentPosition < 0) {
                        currentPosition = 0;
                    }
                    break;
            }

            if (isPlayer1Turn) {
                player1Position = currentPosition;
            } else {
                player2Position = currentPosition;
            }

            System.out.println(currentPlayerName + " rolled " + dieRoll + " | Option: " + option + " | Position: " + currentPosition);

            if (currentPosition == WINNING_POSITION) {
                break;
            }

            if (!playAgain) {
                isPlayer1Turn = !isPlayer1Turn;
            } else {
                System.out.println("--> Ladder Bonus! " + currentPlayerName + " plays again.");
            }
        }

        System.out.println("\n--- Final Report ---");
        System.out.println("Total Dice Rolls: " + diceCount);
        if (player1Position == WINNING_POSITION) {
            System.out.println("THE WINNER IS: PLAYER 1");
        } else {
            System.out.println("THE WINNER IS: PLAYER 2");
        }
    }
}