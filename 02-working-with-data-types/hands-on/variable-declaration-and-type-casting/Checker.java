public class Checker{

	public boolean isLosslessCast(double val){

		int min = Integer.MIN_VALUE; //object wrapper class for int.
		int max = Integer.MAX_VALUE;
		
		if(val>=min && val<=max && val%1 == 0.0){
			return true;
		}

		else { return false; }
		
	}
	
	public static void main(String[] args){
		
		Checker check = new Checker();
		
		System.out.println(check.isLosslessCast(5.0));
		System.out.println(check.isLosslessCast(5.7));
		System.out.println(check.isLosslessCast(3000000000.0));
	}
}

/*
Two consideration:
1. no decimal truncation -> after decimal, accept only if 0.  -> check remainder when divided by 1.
2. No overflow -> should be within range of int. -> min, max for boundary conditions of int -> use Integer wrapper class files.

*/