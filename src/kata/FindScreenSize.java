package kata;

public class FindScreenSize {
   public static String findScreenHeight(int width, String ratio) {

      String[] temp = ratio.split(":");
      double res = (double)width / Double.valueOf(temp[0]) * Double.valueOf(temp[1]);
      return String.valueOf(width).concat("x").concat(String.valueOf((int)res));
  }
}
