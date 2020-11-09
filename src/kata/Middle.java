package kata;

public class Middle {

   public static String getMiddle(String word) {

      StringBuilder strBuilder = new StringBuilder();

      if (word.length() % 2 == 0) {

         char res = word.charAt((word.length() / 2) - 1);
         strBuilder.append(String.valueOf(res));
         res = word.charAt((word.length() / 2));
         strBuilder.append(String.valueOf(res));

      } else {
         char res = word.charAt(word.length() / 2);
         strBuilder.append(String.valueOf(res));
      }

      return strBuilder.toString();
   }
}
