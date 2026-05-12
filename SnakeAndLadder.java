import java.util.Random;

public class SnakeAndLadder {
    
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Simulator");

        int playerPosition = 0;
        Random random = new Random();

        int dieRoll = random.nextInt(6) + 1;
        System.out.println("Die Rolled: " + dieRoll);

        int option = random.nextInt(3);

        switch (option) {
            case NO_PLAY -> {
                System.out.println("Option: NO PLAY. Player stays at " + playerPosition);
            }
            case LADDER -> {
                playerPosition += dieRoll;
                System.out.println("Option: LADDER! Player moves ahead to " + playerPosition);
            }
            case SNAKE -> {
                playerPosition -= dieRoll;
                if (playerPosition < 0) {
                    playerPosition = 0;
                }
                System.out.println("Option: SNAKE! Player moves behind to " + playerPosition);
            }
        }

        System.out.println("Final Position for this turn: " + playerPosition);
    }
}