public class StringCreation{
    public static void main(String[] args) {

        String str1 = "Java"; // creates an object in the String Pool
        String str2 = new String("Java"); // checks in Pool -> already there; so, creates a new object in heap and str2 points to it
        String str3 = "Java"; // checks, already in Pool: no new memory allocated, points to the same object

        System.out.println(str1==str2); 
        System.out.println(str2==str3); 
        System.out.println(str1==str3);
    }
}