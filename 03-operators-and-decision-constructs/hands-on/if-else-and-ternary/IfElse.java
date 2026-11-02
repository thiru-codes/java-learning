public class IfElse{

	public double getFinalPrice(double cartAmount, boolean isMember){
		
		if(isMember) {
			return cartAmount *= 0.80;
		}

		else if (cartAmount >= 100){
			return cartAmount *= 0.90;
		}
		
		return cartAmount;
	}


	public static void main(String[] args){

		IfElse obj1 = new IfElse();

		System.out.println(obj1.getFinalPrice(60.75,true));
		System.out.println(obj1.getFinalPrice(120.25,true));
		System.out.println(obj1.getFinalPrice(120.25,false));
		System.out.println(obj1.getFinalPrice(60.75,false));

	}
}