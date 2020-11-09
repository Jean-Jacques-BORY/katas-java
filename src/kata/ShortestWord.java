package kata;

import java.util.Arrays;

public class ShortestWord {
   public static int findShort(String s) {
      
      
      return Arrays
         .asList(s.split(" "))
         .stream()
         .mapToInt(String::length)
         .distinct()
         .min()
         .getAsInt();
      
   }
}
