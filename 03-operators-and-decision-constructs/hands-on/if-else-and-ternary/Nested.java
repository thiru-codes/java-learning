public class Nested{
	public String getAction(String lightColor, boolean isEmergencyVehicle){

		if(lightColor.equals("Red")){
			if(isEmergencyVehicle){ return "Proceed with caution"; }
			else{ return "Stop"; }
		}
		
		if (lightColor.equals("Green")){
			return "Go";
		}	
		return "Unknown";
	}

	public static void main(String[] args){
		Nested obj1 = new Nested();
		System.out.println(obj1.getAction("Red",true));
		System.out.println(obj1.getAction("Red",false));
		System.out.println(obj1.getAction("Green",true));
	}
}

/* if I used == , in this case -> it will work because it is hardcoded and comes from the shared memory : string pool. But won't work for dynamic user inputs, so always .equals() with strings because it is an object class and not a primitive type */