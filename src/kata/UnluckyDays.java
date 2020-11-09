package kata;

import java.util.Calendar;

public class UnluckyDays {
   
   public static int unluckyDays(int year) {
      
      Calendar cal = Calendar.getInstance();
      int count = 0;
      for (int i = 0; i < 12; i++) {
         cal.set(year, i, 13);
         if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
            System.out.println(cal.getTime().toString());
            count++;
         }
      }
      return count;
    }
   
}
