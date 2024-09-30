import java.util.ArrayList;
import java.util.HashSet;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
      // Create a HashSet to store unique strings
      HashSet<String> uniqueWords = new HashSet<>();
      
      // Add all strings from the list to the HashSet
      for (String word : list)
      {
         uniqueWords.add(word);
      }
      
      // The size of the HashSet is the number of unique words
      return uniqueWords.size();
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}

