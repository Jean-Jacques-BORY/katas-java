package kata;

public class Arge {
   public static int nbYear(int p0, double percent, int aug, int p) {

      percent /= 100;
      int year = 0;
      System.out.println(String.format("%d %f %d %d ", p0, percent, aug, p));  
      while (p0 <= p) {
         p0 += (int) (p0 * percent) + aug;
         System.out.println(p0);
         year++;
      }
      return year;
   }
}
