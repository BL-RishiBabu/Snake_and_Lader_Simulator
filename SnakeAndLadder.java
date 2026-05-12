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
        int diceCount = 0;
        Random random = new Random();

        // Loop until the player hits exactly 100
        while (playerPosition < WINNING_POSITION) {
            
            int dieRoll = random.nextInt(6) + 1;
            diceCount++;
            
            int option = random.nextInt(3);

            switch (option) {
                case NO_PLAY:
                    // Position remains the same
                    break;
                    
                case LADDER:
                    if (playerPosition + dieRoll <= WINNING_POSITION) {
                        playerPosition += dieRoll;
                    }
                    break;
                    
                case SNAKE:
                    playerPosition -= dieRoll;
                    if (playerPosition < 0) {
                        playerPosition = 0;
                    }
                    break;
            }
            System.out.println("Roll #" + diceCount + " | Die: " + dieRoll + " | Current Position: " + playerPosition);
        }

        System.out.println("\n--- Game Over ---");
        System.out.println("Total number of times the dice was played to win: " + diceCount);
        System.out.println("Final Position: " + playerPosition);
    }
}