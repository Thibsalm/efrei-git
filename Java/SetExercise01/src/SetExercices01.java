import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream; 

public class SetExercices01 {
	public static void main(String[] args)
	{
		countDistinctWords(getPoemInWords());
	}
	public static List<String> getPoemInWords() {
		String[] words = new String[] {};
		try (Scanner scanner = new Scanner(new URL(
				"http://www.gutenberg.org/cache/epub/1112/pg1112.txt")
						.openStream(),
				"UTF-8").useDelimiter("\\A")) {
			String poem = scanner.next();
			words = poem.split("\\W+");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Arrays.asList(words);
	}

	public static void countDistinctWords(List<String> words) {
		Set distinctWords = new HashSet();
		for(String word : words)
		{
			distinctWords.add(words);
		}
	}

}
