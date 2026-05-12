import java.util.Random;

public class SnakeAndLadder {
    
    public static final int START_POSITION = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Simulator");

        int playerPosition = START_POSITION;

        Random random = new Random();
        
        int dieRoll = random.nextInt(6) + 1;

        System.out.println("The player rolled a: " + dieRoll);
    }
}