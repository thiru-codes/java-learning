class OperatorPrecedence{
	public static void main(String[] args){
		int a =10, b=5, c=2;

		int r1 = a + b * c;
		int r2 = (a + b) * c;

		System.out.println(r1);
		System.out.println(r2);
	}
}