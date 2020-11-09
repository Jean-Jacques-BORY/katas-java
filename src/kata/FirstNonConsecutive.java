package kata;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstNonConsecutive {
   static Integer find(final int[] array) {
      
      int precedent=array[0];
      for (int i = 1; i < array.length; i++) {
         if(array[i] - 1 != precedent) {
            return array[i];
         }
         precedent = array[i];
      }
      return null;
  }
   
   public static String highAndLow(String numbers) {
      // Code here or
       IntSummaryStatistics a = Arrays.asList(numbers.split(" "))
      .stream().collect(Collectors.summarizingInt(i->Integer.valueOf(i)));
         
      return new StringBuilder()
         .append(a.getMax()).append(" ").append(a.getMin()).toString();
    }
   
   public static String reverseLetter(final String str) {
      
      String res = Arrays.asList(str.split(""))
         .stream()
         .filter(a->Character.isAlphabetic(a.codePointAt(0)))
         .collect(Collectors.joining());
      
      String sb = new StringBuilder(res).reverse().toString();
      
      return sb;
      
  }
}
