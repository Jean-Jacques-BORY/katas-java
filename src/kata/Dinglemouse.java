package kata;

public class Dinglemouse {
   public static int riders(final int[] stations) {

      int miles = 0;
      int riders = 1;

      for (int i = 0; i < stations.length; i++) {

         if (((miles + stations[i]) <= 100)) {
            miles += stations[i];
         } else {
            miles = stations[i];
            riders++;
         }

      }
      return riders;
   }
}
