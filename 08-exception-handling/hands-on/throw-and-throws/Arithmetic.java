class Calculator{

    public void divide(int a, int b){
        if(b==0){
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        System.out.println(a/b);
    }
}

public class Arithmetic{
    public static void main(String[] args) {
        Calculator c = new Calculator();
        
        try{
            c.divide(10, 0);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}