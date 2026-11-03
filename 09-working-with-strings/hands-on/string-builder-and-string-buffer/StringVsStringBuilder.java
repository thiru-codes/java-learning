public class StringVsStringBuilder {
    public static void main(String[] args) {
        String message = "";
        message = message + "Hello";
        message = message + " ";
        message = message + "A";
        message = message + "!";
        //creates 5 different String objects
        //need to assign to var each time to make it point to the new object

        StringBuilder str1 = new StringBuilder();
        str1.append("Hello");
        str1.append(" ");
        str1.append("A");
        str1.append("!");
        //1 object is modified
        // no need to assign as the same object is being modified
    }
}
