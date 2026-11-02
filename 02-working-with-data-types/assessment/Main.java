class Book{
	String BookName = "Hello";
}

public class Main{
	public static void main(String[] args){

		Book book1 = new Book();
		Book book2 = book1; //memory address stored in book1 is copied to book2
		//both references point to same Book object in heap

		book1 = null; // book1 var is dereferenced
		// Book object is still accessible -> because book2 still points to it
		// so, object not destroyed / garbage collected

		System.out.println("Book Name: " +book2.BookName);
		
	}
}