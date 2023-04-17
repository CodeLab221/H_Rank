
import java.util.*;

public class LongestWord {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a list of words, separated by spaces):");
    String input = sc.nextLine();
    sc.close();

    String[] words = input.split(" ");
    List<String> wordList = new ArrayList<>();
    for (String word : words){
      wordList.add(word);
    }
    
    String longestWord = wordList.stream()
      .max((word1, word2) -> Integer.compare(word1.length(), word2.length()))
      .orElse("");

    System.out.println("The longest word is:" + longestWord);

  }

}
