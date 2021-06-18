package kata.sevenkyu;

import java.util.Arrays;
import java.util.stream.Collectors;

public class NextHappyYear {
   static public int nextHappyYear(int year) {
    
      while (true) {
         int size = Arrays.asList(String.valueOf(++year).split("")).stream().distinct().collect(Collectors.toList()).size();
         if (size == 4) {
            return year;
         }
      }
      //rem utilisation de hashmap plus rapide
   }
}
