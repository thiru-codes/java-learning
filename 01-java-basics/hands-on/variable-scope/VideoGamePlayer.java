public class VideoGamePlayer{

	private String playerName;
	private int health = 100;

	VideoGamePlayer(String name){
		playerName = name;
	}
	
	public void takeDamage(int damage){
		health = health - damage;
	}
	
	public boolean isAlive(){
		if (health>0){
			return true;
		} else { return false; }
	}
	
	public static void main(String[] args){
		VideoGamePlayer player1 = new VideoGamePlayer("Alex");
		VideoGamePlayer player2 = new VideoGamePlayer("Bob");
		
		player1.takeDamage(100);
		System.out.println(player1.isAlive());
		System.out.println(player2.isAlive());
	}
}