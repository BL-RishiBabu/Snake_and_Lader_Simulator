import java.util.Random;

public class SnakeAndLadder {
    
    public static final int START_POSITION = 0;
    public static final int WINNING_POSITION = 100;
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Simulator");
        int playerPosition = START_POSITION;
        Random random = new Random();

        while (playerPosition < WINNING_POSITION) {
            int dieRoll = random.nextInt(6) + 1;
            int option = random.nextInt(3);
            switch (option) {
                case NO_PLAY:
                    break;
                    
                case LADDER:
                    playerPosition += dieRoll;
                    break;
                    
                case SNAKE:
                    playerPosition -= dieRoll;
                    if (playerPosition < 0) {
                        playerPosition = 0;
                    }
                    break;
            }   
            System.out.println("Current Position: " + playerPosition);
        }
        System.out.println("\nCongratulations! You reached position " + playerPosition + " and won the game!");
    }
}