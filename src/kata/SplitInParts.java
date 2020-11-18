package kata;

public class SplitInParts {
   public static String splitInParts(String s, int partLength) {
      // your code
      StringBuilder strBuilder = new StringBuilder();
      for (int i = 1; i < s.length() + 1; i++) {
         strBuilder.append(s.charAt(i - 1));
         if (i % partLength == 0) {
            strBuilder.append(" ");
         }
      }
      return strBuilder.toString().trim();
   }
}
