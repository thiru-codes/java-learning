class Object{
}

public class ScopeDemo{
		
	void buildAndForget(){
		Object dummy = new Object();
	}

	public static void main(String[] args){
	
		ScopeDemo obj = new ScopeDemo();
		obj.buildAndForget();

		System.out.println("Yes. The object created inside buildAndForget() is eligible for GC by the time this print statement executes as it is out of scope.");

	}
}