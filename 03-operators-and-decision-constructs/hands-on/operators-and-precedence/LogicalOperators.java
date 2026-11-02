class LogicalOperators{

	public boolean isValid(int score, int bonus){

		boolean result = (score>=0 && score<=100) && (bonus == 5 || bonus == 10);
		return result;
	}

	public static void main(String[] args){
		
		LogicalOperators obj1 = new LogicalOperators();
		
		System.out.println(obj1.isValid(45,5));
		System.out.println(obj1.isValid(110,10));
		System.out.println(obj1.isValid(50,15));
		System.out.println(obj1.isValid(110,15));
	}

}