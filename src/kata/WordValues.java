package kata;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class WordValues {
   
   
   public static int [] nameValue(String [] arr){
      
      Map<String,Integer> map = new HashMap<String, Integer>();

      for(int i = 0; i<26;i++) {
        char a = (char) ('a'+i);
          map.put(String.valueOf(a), i+1);
      }
      
      int[] resInt = new int[arr.length];
      
      for (int i = 0; i < arr.length; i++) {
         
         final int i1= i+1;
         
         int res = Stream.of(arr[i].split(""))
         .filter(c->c.trim().length()!=0)
         .map(c-> (int) map.get(c) * i1)
         .reduce(0,(a,b)->a.intValue() + b.intValue());
         
         resInt[i] += res ;
      }
      
      return resInt;
  }
}
