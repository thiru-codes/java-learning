public class Student{
	
	String name;
	int marks;

	public static void main(String[] args){
		
		Student student1 = new Student(); //object

		//set values using object: 
		student1.name = "XYZ";
		student1.marks = 95;

		//read and print values
		System.out.println("Student name:" + student1.name); 
		System.out.println("Student marks:" + student1.marks);
		
	}
}