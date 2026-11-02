public class ZeroIterationTest{

	public static void main(String[] args){
		int x = 5;

		while(x>100){
			System.out.println("This block does not execute as while loop executes before execution");
		}

		do{
			System.out.println("This line will execute once, because do-while loop checks condition after execution");
		}while (x>100);
	}
}