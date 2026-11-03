package accessmodifier;

public class AccessTest {
    public static void main(String[] args) {
        AccessExample obj = new AccessExample();
        System.out.println(obj.a);
        System.out.println(obj.ch);
        System.out.println(obj.bool);
       //System.out.println(obj.str);
       //The field AccessModifiers.str is not visible
    }
}
