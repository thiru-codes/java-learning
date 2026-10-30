public class User{
	public static int totalUsers = 0;

	User(){
		totalUsers+=1;
	}

	public static void main(String[] args){
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		int count = User.totalUsers;
		System.out.println(count);
	}
}