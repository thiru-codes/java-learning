public class PrimitiveObjectReference{
	
	void updateVars(int a, Integer b){
		a += 10; // a method cannot modify a primitive var. outside of its scope
		b += 20; //new object in memory and updates the reference variable to point to it, leaving the original object completely untouched
		//can modify a mutable object's internal data -> but Wrapper classes are immutable
	}
	
	
	public static void main(String[] args){
			
		int a = 5; // primitive variable 
		Integer b = 5; // b -> object reference to Integer wrapper class

		System.out.println("Values before update:");
		System.out.println("Primitive var: " + a + ", Integer ref. var: " + b);

		
		PrimitiveObjectReference obj1 = new PrimitiveObjectReference();
		
		obj1.updateVars(a,b);
		System.out.println("Values after update:");
		System.out.println("Primitive var: " + a + ", Integer ref. var: " + b);
		
	}
		
}