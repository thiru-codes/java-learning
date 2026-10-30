import java.util.Scanner;

public class Professionals{
	
	String profession;
	String name;
	int age;
	char gender; 
	String email;
	long phone;
	String address;
		
	public void setDetails(String profession, String name, int age, char gender, String email, long phone, String address){
		this.profession = profession;
		this.name = name;
		this.age = age;
	        this.gender = gender; 
		this.email = email;
	   	this.phone = phone;
		this.address = address;
	
	}

	public void displayDetails(){
	System.out.println("Name: " + name + " | Profession: " + profession + " | Age: " + age + 
                            " | Gender: " + gender + " | Email: " + email + " | Phone: " + phone + 
                            " | Address: " + address);
		
	}
		
		
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in); 
		Professionals[] list = new Professionals[7]; //array to hold 7 professionals objects.

		for(int i=0;i<list.length;i++){
			
			System.out.println("\nDetails for professional " + (i+1));

			list[i] = new Professionals();

			System.out.println("Enter profession: ");
			String profession = scanner.next();
			scanner.nextLine();
			
			System.out.println("Enter name: ");
			String name = scanner.nextLine();
			scanner.nextLine();
			
			System.out.println("Enter age: ");
			int age = scanner.nextInt();
			scanner.nextLine();
	
			
			System.out.println("Enter gender (M/F/T): ");
			char gender = scanner.next().charAt(0);
			scanner.nextLine();


			System.out.println("Enter email: ");
			String email = scanner.next();
			scanner.nextLine();


			System.out.println("Enter phone: ");
			long phone = scanner.nextLong();	
			scanner.nextLine();
	
			System.out.println("Enter address: ");
			String address = scanner.nextLine();
			
			list[i].setDetails(profession, name, age, gender, email, phone, address);


		}

		System.out.println("\n====== ALL DETAILS ======");

        	for (Professionals obj : list) {
            		obj.displayDetails();
        	}
        
        	scanner.close();

	}


}