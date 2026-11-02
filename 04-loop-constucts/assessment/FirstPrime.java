public class FirstPrime {
    public static void main(String[] args) {
        for(int i=2;i<=50;i++){
            if(isPrime(i)){
                System.out.println("Prime: " + i);
                if(i>10){
                    System.out.println("First prime greater than 10 found!");
                    System.out.println("Program now exited");
                    break;
                }
            } 
        }
    }
    public static boolean isPrime(int n) {
        for (int i=2;i<= Math.sqrt(n);i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}