public class VarDec{
	public static void main(String[] args){
		int var = 10; 
		double varDouble = (double) var; //int -> double : narrowing, so explicit typecasting
		 
		System.out.println("Primitive declaration: " + var);
		System.out.println("Explicit casting: " + varDouble);
	}
}