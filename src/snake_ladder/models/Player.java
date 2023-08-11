package snake_ladder.models;

public class Player {
	private String name ;
	private int position;
	public Player(String name , int startPosition){
		this.name = name;
		this.position = startPosition;
	}
	public String getName() {
		return this.name;
	}
	public int getPosition() {
		return this.position;
	}
	public void setPosition(int newPosition) {
		this.position = newPosition;
	}
}
