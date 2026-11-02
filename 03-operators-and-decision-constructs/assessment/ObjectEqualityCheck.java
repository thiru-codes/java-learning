public class ObjectEqualityCheck{

	public static void main(String[] args){

		Integer int1 = 5;
		Integer int2 = 5;

		System.out.println("Comparing two Integer objects with the same value: 5");
		
		System.out.println("Comparing using == : " + (int1==int2));
		System.out.println("Comparing using .equals() : " + (int1.equals(int2)));

	}

}
//The Java Integer wrapper class cache is a memory optimization mechanism that 
// reuses pre-allocated Integer objects for values between -128 and 127. 
// When you assign a primitive int to an Integer object within this range 
// (a process called autoboxing), 
// Java returns the exact same object reference from an internal static cache 
// instead of allocating a new instance on the heap. 