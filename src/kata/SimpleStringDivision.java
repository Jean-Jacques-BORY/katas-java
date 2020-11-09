package kata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleStringDivision {

   public static long solve(String st, int k) {

      // algo : trouver le plus grand nombre possible consecutif en eliminant k element;

      List<Integer> list = new ArrayList<Integer>();
      String[] arr = st.split("");

      for (int i = 0; i < st.length(); i++) {

         StringBuilder temp = new StringBuilder();

         for (int j = 0; j < st.length() - k; j++) {
            if (i + j < st.length()) temp.append(arr[i + j]);
         }

         list.add(Integer.parseInt(temp.toString()));
      }

      return list.stream().max(Integer::compare).orElse(0);

   }

   /**
    * 
    * @param arr
    * @return
    */
   public static int repeats(int[] arr) {
      // ..
      
      Map<Integer,Long> map = new HashMap<Integer,Long>();
      
      for (int i = 0; i < arr.length; i++) {
         
         
         
         
      }
      
      return 0;
   }

}
