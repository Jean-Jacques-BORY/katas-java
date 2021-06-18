package kata.sevenkyu;

import java.util.Arrays;

public class Poet {
   public static int[] pendulum(final int[] values) {
      
      Arrays.parallelSort(values);
      
      int[] res = new int[values.length];
      
      int start = values.length%2==0 ? (values.length/2)-1 : values.length/2;
      
      int right = 1;
      int left = 0;
      
      for (int i = 0; i < values.length; i++) {
         
         if(i%2==0) {
            res[start-left] = values[i];
            left++;
         }else {
            res[start+right] = values[i];
            right++;
         }
         
      }
      //System.out.println("finish");
      //System.out.println("");
      return res; 
  }
}
