import java.util.Scanner;

public class StringAnalyzer{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int numberOfChars = sentence.length();
        System.out.println("Total no. of characters: " + numberOfChars);

        String[] words = sentence.split(" ");
        int numberOfWords = words.length;
        System.out.println("Total no. of words: " + numberOfWords);

        String sentenceUpperCase = sentence.toUpperCase();
        System.out.println("Sentence in upper case: " + sentenceUpperCase);

        String sentenceLowerCase = sentence.toLowerCase();
        System.out.println("Sentence in lower case: " + sentenceLowerCase);

        scanner.close();
    }
}