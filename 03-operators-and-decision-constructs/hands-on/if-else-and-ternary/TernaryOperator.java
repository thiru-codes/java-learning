public class TernaryOperator{

	public String checkExamResult(int score){
		return (score>=60) ? "Pass" : "Fail";
	}

	public static void main(String[] args){

		TernaryOperator obj1 = new TernaryOperator();

		System.out.println(obj1.checkExamResult(90));
		System.out.println(obj1.checkExamResult(50));

	}

}