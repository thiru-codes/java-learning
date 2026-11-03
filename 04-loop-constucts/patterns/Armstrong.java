import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int temp1 = n, temp2 = n;
        int count = 0;
        do{
            count++;
            temp1/=10;
        }while(temp1!=0);

        int armstrongSum = 0;
        while(temp2!=0){
            int digit = temp2%10;
            armstrongSum += (int) Math.pow(digit, count); //returns a double
            temp2/=10;
        }

        boolean isArmstrong = (n==armstrongSum);

        System.out.println((isArmstrong)? "Armstrong" : "Not Armstrong");

        scanner.close();
    }
}
