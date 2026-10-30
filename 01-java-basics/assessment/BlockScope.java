public class BlockScope{

	public static void main(String[] args){
		int age = 18;
		boolean canVote = false; //initialise var outside -> block scope
		if(age>=18){
			canVote = true; 
		}
		System.out.println(canVote); //now can access outside the if-block
	}

}


/*
Cannot access a variable declared inside an if-block outside of it
Fix: Declare var outside and assign value inside
*/
	
