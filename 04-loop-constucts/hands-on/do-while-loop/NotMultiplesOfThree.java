public class NotMultiplesOfThree{

	public static void main(String[] args){
		
		int n = 1;
		System.out.println("Printing numbers between 1 - 20 except multiples of 3: ");

		do{
			if (n % 3 != 0 ){ System.out.println(n); }
			n++;
		} while ( n <= 20 );
	}
}