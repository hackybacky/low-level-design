package map_implementation;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mycustommap<Integer , String> mp = new mycustommap(10);
		mp.put(12 , "harry");
		mp.put(14, "jerry");
		System.out.println(mp.get(14));
		
	}

}
