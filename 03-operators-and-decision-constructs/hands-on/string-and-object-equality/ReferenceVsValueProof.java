public class ReferenceVsValueProof{

	public static void main(String[] args){

		String s1 = "Java"; //string literal
		String s2 = new String("Java"); //matching string at new memory location

		boolean referenceEquality = (s1 == s2);
		boolean valueEquality = s1.equals(s2);

		System.out.println("Reference Equality for two strings: " + referenceEquality);
		System.out.println("Value Equality for both the strings: " + valueEquality);

	}

}
