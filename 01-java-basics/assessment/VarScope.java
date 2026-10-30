public class VarScope{	
	String name = "Thiru" ; // instance variable declared inside a class, and instantiated for each object.

	public static void main(String args[]){

		int age = 21; //local variable, only lives inside the method.
		
		VarScope obj1 = new VarScope();
		System.out.println(obj1.name); //need to create object to access the instance variable
		
		System.out.println(age); //can access the local variable directly
	
	}
}
	