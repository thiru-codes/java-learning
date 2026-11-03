class Person{
    String name = "Hello";
}


public class NullPointer{
    public static void main(String[] args){

        Person p = null;

        try{
            System.out.println(p.name);
        }
        catch(NullPointerException e){
            System.out.println(e + ": Person object has not been created.");
        }
    }
}