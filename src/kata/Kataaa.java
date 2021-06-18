package kata;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Kataaa {

   public static void main(String[] args) {
      
      Set<String> list = new HashSet<String>();
      
      list.add("toto");
      list.add("toto");
      list.add("toto");
      
      for (String string : list) {
         System.out.println(string);
         
      }
//      if(libelleMaj.matches("\\[|\\]|\\*|\\?|\\:|\\/|\\\\")) {
//         System.out.println(libelleMaj);
//      };
//      
//      if(libelleMaj.matches("(^\\'.*)|(.*\\'$)")) {
//         System.out.println(libelleMaj);
//      };
      
//      // TODO Auto-generated method stub
//      String contextName= "boo.and.foo";
//      String[] strArr = contextName.split(".");
//      for (int i = 0; i < strArr.length; i++) {
//         System.out.println("strArr "+strArr[i]);
//      }
   }

}
