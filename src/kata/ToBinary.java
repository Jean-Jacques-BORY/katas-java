package kata;

import java.util.ArrayList;

public class ToBinary {
   public static int toBinary(int n) {
      // Diviser le nombre par 2 (n modulo 2)
      // Stocker le reste de la division dans un tableau
      // Répéter jusqu'à 0 ou > 0
      // Inverser le tableau
      
      StringBuilder strBuilder = new StringBuilder();
      StringBuilder strBuilderRev = new StringBuilder();
      while(n>0) {
         int temp = n%2;
//         System.out.println(temp);
         n= n/2;
         strBuilder.append(temp);
      }
      
//      System.out.println("strb: "+ strBuilder.toString());
//      strBuilder.reverse();
      
      for (int i = strBuilder.length()-1; i >= 0; i--) {
         System.out.println("strb : "+ strBuilder.charAt(i));
         strBuilderRev.append(strBuilder.charAt(i));
      }
      
      System.out.println(strBuilderRev.toString());
      
      return Integer.valueOf(strBuilderRev.toString());
   }
}
