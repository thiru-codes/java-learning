import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class Logger{
	public static void main(String[] args){
		String sentence = "Java basics are making sense!";
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt",true))){
			writer.write(sentence);
			System.out.println("Success!");
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}