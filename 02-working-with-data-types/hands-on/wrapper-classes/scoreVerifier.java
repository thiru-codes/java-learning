public class scoreVerifier {
    public static void main(String[] args) {
        //two separate objects outside the integer cache range (200)
        Integer scoreA = Integer.valueOf(200);
        Integer scoreB = Integer.valueOf(200);

        //using .equals() safely compares values, not addresses
        System.out.println("Are values identical? " + scoreA.equals(scoreB)); //prints true
        
        System.out.println(verifyScore(Integer.MAX_VALUE)); //prints true
        System.out.println(verifyScore(200));               //prints false (not max value)
    }

    public static boolean verifyScore(Integer score) {
        if (score == null) return false;
        
        if (score >= 100) {
               if (score == Integer.MAX_VALUE) {
                return true; 
            }
        }
        
        return false;
    }
}
