class User{
	String username;
    	int id;
    
    	User(int id, String username) { //constructor!!
        	this.id = id;
        	this.username = username;
    	}

	boolean isEquals(User u1, User u2){
		
		if (u1 == null || u2 == null) { return false; } 

		boolean result = ((u1.id == u2.id) && (u1.username.equals(u2.username)));
		// == is good to compare int fields of objects, but for string -> need to use .isEquals() .
		return result;
	}

}

public class ObjectEquality{

	public static void main(String[] args){

		User user1 = new User(101,"ABC");
		User user2 = new User(102,"ABC");

		boolean match = user1.isEquals(user1, user2);
		System.out.println(match);
		

	}

}
