class Box{
	int contentValue;
}

public class CoDependenrMutator{
	public static void main(String[] args){

		Box boxA = new Box();
		boxA.contentValue = 500;

		Box boxB = boxA;
		boxB.contentValue = 999;
		
		System.out.println(boxA.contentValue);
	}
}