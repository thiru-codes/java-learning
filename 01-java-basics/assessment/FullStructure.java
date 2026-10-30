package assessment.q8; //package declaration: current directory structure 

import java.util.Date; //imported required packages
import java.text.SimpleDateFormat;

public class FullStructure{ //class defined 
	public static void main(String[] args){ //contains main method 
		
		Date curr = new Date(); // Date object instance 
		SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy hh:mm"); 
		String today = formatter.format(curr);
		System.out.println("Today's date and time:  " + today); //Formatted console output
		
	}
}
