public class LostObjectTrap{
	public static void main(String[] args){
		
		new LostObjectTrap(); // Created on the heap, but instantly abandoned and eligible for GC!
	}
}