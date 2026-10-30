class LoopScope{
	public static void main(String[] args){
		for(int i=0;i<=5;i++){ //parameter variable
			int counter = 5 + i; //loop-scoped variable
			System.out.println(counter);
		}	
	}
}