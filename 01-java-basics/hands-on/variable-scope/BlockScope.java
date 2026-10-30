class BlockScope{
	public static void main(String[] args){
		int age = 21;
		if (age>=18){
			boolean canVote = true; //canVote is block-scoped variable
			System.out.println(canVote);
		} 
	}
}