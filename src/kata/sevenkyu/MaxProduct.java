package kata.sevenkyu;

public class MaxProduct {
   public int adjacentElementsProduct(int[] array) {

      int max = Integer.MIN_VALUE;
      
      for (int i = 0; i < array.length-1; i++) {
         int temp = array[i] * array[i+1];
         if(max < temp) max = temp;
      }
      
      return max;
    }
}
