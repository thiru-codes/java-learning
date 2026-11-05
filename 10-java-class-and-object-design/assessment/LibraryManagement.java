package librarymanagement;

import java.util.Objects;
import java.time.LocalDateTime;

abstract class Book {
    // 1. private fields
    private String title;
    private String publisher;
    private double price;
    private static int bookCount = 0;

    // composition
    ISBN ISBN;
    Author author; 
      
    public Book(ISBN ISBN,Author author,String title, String publisher, double price){
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.price = price;
        bookCount++;
    }

    public static int getBookCount(){
        return bookCount;
    }
    
    @Override
    public boolean equals(Object object){
        if(object == null) return false;
        if(this == object) return true;
        if(object instanceof Book){
            Book book = (Book) object;
            if(this.ISBN.getISBN() == book.ISBN.getISBN()){
                return true;
            }
        }
        return false;
    }

    @Override 
    public int hashCode(){
        return Objects.hash(ISBN.getISBN());
    }


    @Override
    public String toString(){
        return "Book title: " + title +  
                "\n {ISBN        : " + ISBN + " }" +
                "\n {Author      : " + author + " }" + 
                "\n Publisher   : " + publisher +
                "\n Price       : " + price;
    }
}

class EBook extends Book{
    public EBook(ISBN ISBNcode,Author author,String title, String publisher, double price){
        super(ISBNcode,author,title,publisher,price);
    }
}

class PrintedBook extends Book{
    public PrintedBook(ISBN ISBNcode,Author author,String title, String publisher, double price){
        super(ISBNcode,author,title,publisher,price);
    }

}  

class Author {
    String name;
    String agent;

    public Author(String name, String agent){
        this.name = name;
        this.agent = agent;
    }

    @Override
    public String toString(){
        return "Name: " + name +  
                "\nAgent : " + agent; 
    }
}

final class ISBN{
    private final int ISBNcode;
    private final LocalDateTime ISBNTimeOfIssue;

    public ISBN(int ISBNcode){
        this.ISBNcode = ISBNcode;
        this.ISBNTimeOfIssue = LocalDateTime.now();
    }

    public int getISBN(){
        return ISBNcode;
    }

    @Override
    public String toString(){
        return "Code: " + ISBNcode +  
                "\nTime of Issue : " + ISBNTimeOfIssue; 
    }
}

class Library{
    private Library(){
    }
    private static Library instance = new Library();
    public static Library getInstance(){
        return instance;
    }

    private static String libraryName;
    static{
        libraryName = "Fantastic Books and where to find them";
    }

    public void frontDesk(){
        System.out.println("Welcome to the FBAWTFT library!!");
    }

    
    public static String getLibraryName(){
        return libraryName;
    }

}


public class LibraryManagement {
    public static void main(String[] args){
        System.out.println("Library Management");

        Author author1 = new Author("Leigh Bardugo", "Dude A");
        Author author2 = new Author("Markus Zusak", "Dude B");
        Author author3 = new Author("Another Author" , "Another Dude");
        
        ISBN isbn1 = new ISBN(1001);
        ISBN isbn2 = new ISBN(1002);
        ISBN isbn3 = new ISBN(1001); 

        Book book1 = new PrintedBook(isbn1,author1,"Six of Crows","Penguins",799);
        Book book2 = new EBook(isbn2,author2,"The Book Thief","Bloomsburry",599);
        Book book3 = new PrintedBook(isbn3,author3,"Another Book","Random publishing",399);

        System.out.println("\nLibrary");
        System.out.println("Library Name: " + Library.getLibraryName());
        Library library = Library.getInstance();
        library.frontDesk();



        System.out.println("\nBook Count");
        System.out.println("Total books created: " + Book.getBookCount());

        System.out.println("Book 1");
        System.out.println(book1);

        System.out.println("\nBook 2");
        System.out.println(book2);

        System.out.println("\nBook 3");
        System.out.println(book3);

        System.out.println("\nAuthor");
        System.out.println(author1);

        System.out.println("\nISBN");
        System.out.println(isbn1);

        System.out.println("\nEquals Test");
        System.out.println("book1 equals book2: " + book1.equals(book2));
        System.out.println("book1 equals book3: " + book1.equals(book3));

        System.out.println("\nHashCode Test");
        System.out.println("book1 hashCode: " + book1.hashCode());
        System.out.println("book3 hashCode: " + book3.hashCode());

        System.out.println("\nBook Count");
        System.out.println("Total books created: " + Book.getBookCount());
    }
}