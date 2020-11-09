package kata;

import java.util.Arrays;
import java.util.List;

public class Vowels {
   public static int getCount(String str) {
      
      int vowelsCount = 0;
      
      List<String> vowelsArray = Arrays.asList("aeiou".split(""));
            
      for (int i = 0; i < str.length(); i++) {
            if(vowelsArray.contains(String.valueOf(str.charAt(i))))
               vowelsCount++;
      }
      
      return vowelsCount;
    }
}
