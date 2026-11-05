import java.util.Scanner;

@FunctionalInterface
interface MathOperation{
    int operate(int a,int b);
}

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculator");

        System.out.print("Enter first number : ");
        int a = scanner.nextInt();

        System.out.print("Enter second number : ");
        int b = scanner.nextInt();
        System.out.println();

        // Java treats a lambda expression as an instance of a class 
        // that implements the target functional interface
        // assigned the instance to the variable addition
        MathOperation addition = (x,y) -> x+y; // => instance of the functional interface
        MathOperation subtraction = (x,y) -> x-y;
        MathOperation multiplication = (x,y) -> x*y;
        //a lambda does not automatically generate a separate .class file 
        // on your hard drive at compile time


        System.out.println("Addition        : " + addition.operate(a,b));
        System.out.println("Subtraction     : " + subtraction.operate(a,b));
        System.out.println("Multiplication  : " + multiplication.operate(a,b));


        // MathOperation addition = (a,b) -> a+b;
        // Your lambda expression (a, b) -> a + b attempts to create new variables named a and b
        // Java blocks this because it cannot tell if a inside the lambda means the user's input 
        // or the lambda's parameter
        scanner.close();
    }
}
