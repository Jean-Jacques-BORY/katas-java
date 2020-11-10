package kata;

public class AlphabetSymmetry {

   /**
    * algo
    * ascii table
    * a = 97
    * a = 97-97
    * si a== asci - 97 alors compteur++
    * @param arr
    * @return
    */
   public static int[] solve(String[] arr) {
      // do your thing

      int ascii = 97;
      int[] res = new int[arr.length];

      for (int i = 0; i < arr.length; i++) {

         String tempStr = arr[i].toLowerCase();
         int tempCount = 0;
         for (int j = 0; j < tempStr.length(); j++) {
            if ((int) tempStr.charAt(j) == ascii + j) tempCount++;
         }
         res[i] = tempCount;
      }
      return res;

   }
}
