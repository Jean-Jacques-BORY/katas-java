package kata;

import java.util.Arrays;
import java.util.List;

public class Accumul {

   public static String accum(String s) {

      List<String> list = Arrays.asList(s.split(""));

      StringBuilder strBuilder = new StringBuilder();

      for (int i = 0; i < list.size(); i++) {

         strBuilder.append(list.get(i).toUpperCase());

         for (int j = 1; j < i + 1; j++) {

            strBuilder.append(list.get(i).toLowerCase());
         }

         if (i != list.size() - 1) strBuilder.append("-");
      }

      return strBuilder.toString();
   }

}
