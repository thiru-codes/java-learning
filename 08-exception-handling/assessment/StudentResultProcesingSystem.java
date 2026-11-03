import java.util.Scanner;

class Calculate{
    public double average(int[] results){
        double average=0; 

        for(int i=0;i<5;i++){
            if(results[i]<0){
                throw new InvalidResultException("Invalid Result for Subject " + (i+1) + ", cannot be less than zero");
            }
            else if(results[i]>100){
                throw new InvalidResultException("Invalid Result for Subject " + (i+1) + ", cannot be greater than hundred");
            }
            average+=results[i];
        }

        average/=results.length;
        if(average<40){
            throw new FailException("Failed, average result must be greater than 40");
        }
        return average;
    }
}

class InvalidResultException extends RuntimeException{
    public InvalidResultException(String message){
        super(message);
    }
}

class FailException extends RuntimeException{
    public FailException(String message){
        super(message);
    }
}

public class StudentResultProcesingSystem {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
    
        int[] results = new int[5];

        System.out.println("Student Result Prcoessing System");
        System.out.println();
        System.out.println("Enter results for 5 subjects:");

        
        try(Scanner scanner = new Scanner(System.in);){
            for(int i=0;i<5;i++){
            System.out.print("Subject " + (i+1) + ": ");
            results[i] = scanner.nextInt();
        }
            System.out.println("Results average: " + calculate.average(results));
        }
        catch(InvalidResultException e){
            System.out.println(e.getMessage());
        }
        catch(FailException e){
            System.out.println(e.getMessage());
        }

    }
}
