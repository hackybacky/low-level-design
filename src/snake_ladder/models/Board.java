package snake_ladder.models;

import java.util.List;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;

public class Board {
	private int size ;
	private HashMap<Integer , Snake> snakes;
	private HashMap<Integer , Ladder> ladders;
	private Queue<Player> players;
	public Board(int size){
		this.size = size;
		this.snakes = new HashMap<>();
		this.ladders = new HashMap<>();
		this.players = new LinkedList<>();
	}
	public int getSize() {
		return this.size;
	}
	public HashMap<Integer , Snake>getSnakes() {
		return this.snakes;
	}
	public HashMap<Integer , Ladder>getLadders() {
		return this.ladders;
	}
	public Queue<Player>getPlayers(){
		return this.players;
	}
	public Boolean setLadder(int start , int end) {
		if(this.ladders.containsKey(start)) {
			return false;
		}
		this.ladders.put(start , new Ladder(start , end));
		return true;
	}
	public Boolean setSnake(int start , int end) {
		if(this.snakes.containsKey(start)) {
			return false;
		}
		this.snakes.put(start, new Snake(start , end));
		return true;
	}
	public void setPlayer(Player player , int newPosition) {
		player.setPosition(newPosition);
		this.players.add(player);
	}
	public Player removePlayer(Player player) {
		return this.players.remove();
	}
}
