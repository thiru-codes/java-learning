package overridingobjectclassmethods;

import java.util.Objects;

class Book{
    private final int ISBN;
    private String title;
    private final String author;
    private double price;

    //constructor
    public Book(int ISBN, String title, String author, double price){
        // can do validation before assigning
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // getters
    public int getISBN(){
        return ISBN;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }

    //setters
    public void setTitle(String title){
        this.title = title;
    }
    public void setPrice(boolean isPriceIncreased, double percentage){
        if(isPriceIncreased){
            this.price = price + (price*percentage/100);
        }
        else{
            this.price = price - (price*percentage/100);
        }
    }

    @Override
    public boolean equals(Object object){
        if(object == null){
            return false;
        }
        if(this == object){
            return true;
        }
        if(object instanceof Book){
            Book book = (Book) object;
            if(this.getISBN() == book.getISBN()){
                return true;
            }
        }
        return false;
    }

    @Override 
    public int hashCode(){
        return Objects.hash(ISBN);
    }

    @Override
    public String toString(){
        return """
            Book 
            \nISBN    : """ + getISBN() + """
            \nTitle   : """ + getTitle() + """
            \nAuthor  : """ + getAuthor() + """        
            \nPrice   : """ + getPrice() + """
        """;
    }

}

public class OverridePractice {
    public static void main(String[] args){
        Book book1 = new Book(124567,"Six of Crows","Leigh Bardugo",899);
        Book book2 = new Book(124567,"Crooked Kingdom","Leigh Bardugo",899);
        Book book3 = new Book(456789,"The Book Thief","Markus Zusak",899);
        Object unrelatedObject = new Object();

        //Two separate books with the same ISBN
        System.out.println(book1.equals(book2));
        //Two books with different ISBNs
        System.out.println(book1.equals(book3));
        //Comparing a book with null
         System.out.println(book1.equals(null));
        //Comparing a book with an unrelated object
        System.out.println(book1.equals(unrelatedObject));
        //Printing a book directly
        System.out.println(book1.toString());
        //Checking that equal books have equal hash codes
        System.out.println(book1.hashCode() == book2.hashCode());
    }
}
