package snake_ladder.models;

public class Snake {
	
	private int start , end;
	
	public Snake(int s , int e){
		this.start = s ;
		this.end = e;
	}
	
	public int getStart() {
		return this.start;
	}
	
	public int getEnd() {
		return this.end;
	}
	
}
