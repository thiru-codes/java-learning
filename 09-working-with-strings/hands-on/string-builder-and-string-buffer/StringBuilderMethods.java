public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("Core");

        str1.append(" Java").append(" Training");
        System.out.println(str1);

        str1.delete(0, 5).delete(4, 13);
        System.out.println(str1);

        StringBuilder str2 = new StringBuilder("Hello Java");
        str2.replace(0, 5, "Core");
        System.out.println(str2);

    }
}
