public class PrimitiveTest{
	public static void main(String[] args){

		int originalScore = 100;
		int copiedScore = originalScore;

		copiedScore += 50;

		System.out.println(originalScore); //val. Doesn't change because the copy is independent of the og. 
		System.out.println(copiedScore);
		
	}
}