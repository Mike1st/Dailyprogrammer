import java.util.ArrayList;

public class WordCountCompare {
	public static void main(String args[]) {
		findLongest("");
	}
	
	public static void findLongest(String sentence) {
		sentence = sentence.replaceAll("[^\\w\\s]","");
		String[] word = sentence.split(" ");
		String longest = word[0];
		for(int i = 0; i < word.length; i++)
		{
			if(longest.length() < word[i].length())
				longest = word[i];
		}
		System.out.println(longest);
	}
	
	public static void findShortest(String sentence) {
		sentence = sentence.replaceAll("[^\\w\\s]","");
		String[] word = sentence.split(" ");
		String shortest = word[0];
		for(int i = 0; i < word.length; i++)
		{
			if(shortest.length() > word[i].length())
				shortest = word[i];
		}
		System.out.println(shortest);
	}
}
