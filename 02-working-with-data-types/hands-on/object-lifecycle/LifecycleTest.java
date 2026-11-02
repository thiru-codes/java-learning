class Target{
}

public class LifecycleTest{

	public static void main(String[] args){
		
		Target t1 = new Target(); //points to Object A
		Target t2 = new Target(); //points to Object B
		
		t1 = t2; // Now, t1 points to Object B. So, Object A loses its only pointer and becomes eligible for GC		
	}
}