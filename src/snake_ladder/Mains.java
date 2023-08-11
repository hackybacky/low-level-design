package snake_ladder;
import snake_ladder.models.*;
import snake_ladder.drivers.*;
import java.util.Scanner;
public class Mains {
	 public static void main(String[] args) {
	        // Your code here
		 	Scanner scanner = new Scanner(System.in);
		 	System.out.println("Enter the Board size : ");
		 	int size = scanner.nextInt();
	        GameService game = new GameService(size);
	        System.out.println("Enter the total no of dice in game : ");
	        int dice = scanner.nextInt();
	        game.setDiceNumber(dice);
	        System.out.println("Enter the total no of Players");
	        int players = scanner.nextInt();
	        game.setPlayerNumber(players);
	        for(int i = 0 ; i < players ; i++) {
	        	System.out.println("Enter the player name : ");
	        	String playerName = scanner.next();
	        	game.addPlayer(playerName, 0);
	        }
	        System.out.println("Enter the total number of snakes in game : ");
	        int snakes = scanner.nextInt();
	        for(int i = 0 ; i < snakes ; i++) {
	        	System.out.println("Give starting and ending point of snake");
	        	int start = scanner.nextInt();
	        	int end = scanner.nextInt();
	        	game.setSnake(start , end);
	        }
	        System.out.println("Enter the total number of Ladders in game : ");
	        int ladders = scanner.nextInt();
	        for(int i = 0 ; i < ladders ; i++) {
	        	System.out.println("Give starting and ending point of ladder");
	        	int start = scanner.nextInt();
	        	int end = scanner.nextInt();
	        	game.setLadder(start , end);
	        }
	        System.out.println("Winner of our game is " +game.startGame().getName());
	    }
}
