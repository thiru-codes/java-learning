public class WrapperClass{

	public static void main(String[] args){
	
		String str = "123A"; //cannot convert directly, need to parse the string to numbers
		Integer varInt = Integer.parseInt(str);
		
		varInt += 10;
		
		System.out.println("Result after Integer wrapper and parsing: " + varInt);
	}	
	
}