public class StringEquality{
	public static void main(String[] args){
		
		String str1 = "Java";
		String str2 = new String("Java");

		System.out.println("Reference comparison with == : " + (str1==str2));
		System.out.println("Value comparison with .equals() : " + (str1.equals(str2)));

	}

}