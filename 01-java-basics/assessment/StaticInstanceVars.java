class StaticInstanceVars{
	
	static String a = "Yo"; //static variable -> class-level members
	String b = "Hey"; //instance variable -> object-level members

	public static void main(String[] args){
		
		System.out.println(StaticInstanceVars.a); //static variable belongs to the class itself, no need to create object to access it. 
		
		StaticInstanceVars obj1 = new StaticInstanceVars(); //need to create object to access the instance variable
		System.out.println(obj1.b);
	}
}