package snake_ladder.drivers;

import snake_ladder.models.*;
import java.util.Queue;
import java.util.LinkedList;

public class GameService {
	private Board board;
	private int noOfPlayers ;
	private Queue<Player> players;
	private boolean isGameCompleted;
	private int noOfDice;
	private Dice dice;
	public GameService(int boardSize ) {
		this.board = new Board(boardSize);
		this.players = new LinkedList<>();
		this.isGameCompleted = false;
	}
	public void setDiceNumber(int noOfDices) {
		this.noOfDice = noOfDices;
		this.dice = new Dice(noOfDices);
	}
	
	public void setPlayerNumber(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	public void addPlayer(String name , int startPosition) {
		players.add(new Player(name , startPosition));
	}
	public boolean setSnake(int start , int end) {
		return board.setSnake(start, end);
	}
	public boolean setLadder(int start , int end) {
		return board.setLadder(start, end);
	}
	public int determineNumberOnDice() {
		int numberOnDice = dice.roll();
		if (numberOnDice == 6) {
			return numberOnDice + determineNumberOnDice();
		}
		return numberOnDice;
	}
	int givePositionAfterSnakeAndLadder(int newPosition) {
		if(board.getLadders().containsKey(newPosition)) {
			newPosition = board.getLadders().get(newPosition).getEnd();
			return newPosition;
		}
		if(board.getSnakes().containsKey(newPosition)) {
			System.out.println("Oops got bitten by Snake at " + newPosition);
			newPosition = board.getSnakes().get(newPosition).getEnd();
			return newPosition;
		}
		return newPosition;
	}
	public int positionAfterMove(Player player) {
		int numberOnDice = determineNumberOnDice();
		int currentPosition = player.getPosition();
		int newPosition = currentPosition + numberOnDice;
		if(newPosition > this.board.getSize())return currentPosition;
		while(true) {
			int newPost = givePositionAfterSnakeAndLadder(newPosition);
			if(newPost == newPosition)break;
			newPosition = newPost;
		}
		return newPosition;
	}
	public Player startGame() {
		Player winner = null;
		System.out.println("Game has started");
		while(!isGameCompleted) {
			Player current_player = players.remove();
			int newPositionAfterMove = positionAfterMove(current_player);
			
			if(newPositionAfterMove == board.getSize()) {
				isGameCompleted = true;
				winner = current_player;
			}
			current_player.setPosition(newPositionAfterMove);
			System.out.println(current_player.getName() + " moved to " + newPositionAfterMove);
			players.add(current_player);
		}
		return winner;	
	}
	
}
