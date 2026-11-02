public class Convert{

	public short convertToShort(long bigNumber){
		
		short conv = (short) bigNumber;
		System.out.println("Resulting value after explicit casting: " + conv);
		return conv;
		
	}

	public static void main(String[] args){
		
		Convert c = new Convert();
		System.out.println(c.convertToShort(1000000000000L));
		
	}

}