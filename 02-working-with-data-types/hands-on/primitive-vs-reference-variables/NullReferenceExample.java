class Box{
	int contentValue;
}

public class NullReferenceExample{
	public static void main(String[] args){
		
		Box sampleBox = new Box(); // Creates Object 1 on Heap. sampleBox points to it.
		sampleBox.contentValue = 25;

		Box referenceBox = new Box(); // Creates Object 2 on Heap. referenceBox points to it.
		referenceBox = sampleBox;  // Overwrites referenceBox! Now it points to Object 1. 
		
		// (Object 2 is now lost in memory with no pointer).

		referenceBox = null; // Severed the referenceBox pointer. It now points to nothing.
		System.out.println(sampleBox.contentValue); 
	}
}