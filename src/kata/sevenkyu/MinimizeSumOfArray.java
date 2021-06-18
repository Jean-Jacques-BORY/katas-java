package kata.sevenkyu;

import java.util.Arrays;

public class MinimizeSumOfArray {
   public static int minSum(int[] passed)
   {
      Arrays.sort(passed);
      int j = passed.length-1;
      int res = 0;
      for (int i = 0; i < passed.length/2; i++) {
      
         res += passed[i] * passed[j];
         j--;
         
      }
      
       return res;
   }
}
