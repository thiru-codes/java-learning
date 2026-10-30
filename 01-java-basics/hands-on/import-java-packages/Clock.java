import java.util.Date;
import java.text.SimpleDateFormat;

class Clock{
	public static void main(String[] args){
		Date curr = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
		String year = formatter.format(curr);
		System.out.println("In the year: " + year);
	}
}
