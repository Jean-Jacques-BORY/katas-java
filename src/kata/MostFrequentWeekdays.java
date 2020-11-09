package kata;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MostFrequentWeekdays {
   public static String[] mostFrequentDays(int year) {
      // Implement me! :)

      Calendar cal = Calendar.getInstance();
      cal.setFirstDayOfWeek(Calendar.MONDAY);
      
      Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
      for (int i = 2; i < 8; i++) {
         map.put(i, 0);
      }
      map.put(1, 0);
      
      for (int i = 0; i < 12; i++) {
         for (int j = 1; j <= cal.getActualMaximum(Calendar.DAY_OF_MONTH); j++) {
            cal.set(year, i, j);
            int day = cal.get(Calendar.DAY_OF_WEEK);
            int temp = map.get(day) + 1;
            map.put(day, temp);
         }
      }

      DateFormatSymbols dfs = new DateFormatSymbols(Locale.US);
      String weekdays[] = dfs.getWeekdays();
      
      int maxValueInMap = (Collections.max(map.values()));

      List<String> resultList = new ArrayList<String>();

      for (Entry<Integer, Integer> entry : map.entrySet()) { // Itrate through hashmap
         if (entry.getValue() == maxValueInMap) {
            resultList.add(weekdays[entry.getKey()]); // Print the key with max value
         }
      }

      String[] itemsArray = new String[resultList.size()];
      return resultList.toArray(itemsArray);
   }
}
