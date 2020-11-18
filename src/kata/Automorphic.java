package kata;

public class Automorphic {
   public static String autoMorphic(int number)
   {
      
      /**
       *  return String
          .valueOf((int)Math.pow(Double.valueOf(number), 2))
          .endsWith(String.valueOf(number)) ? "Automorphic" : "Not!!";
       */
      
      String strFinal = String.valueOf((int)Math.pow(Double.valueOf(number), 2));
      int lengthBegin =strFinal.length() - String.valueOf(number).length();
      int resFinal = Integer
         .valueOf(strFinal
         .substring(lengthBegin,strFinal.length()));
      
       return resFinal == number ? "Automorphic" : "Not!!";
   }
}
