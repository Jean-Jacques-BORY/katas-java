package kata;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class SumOfArraySingles {
   
   public static int repeats(int [] arr){
      
      List<Integer> list = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
      
      int sum = 0;

      
      
      for (int i = 0; i < list.size(); i++) {
         System.out.println("i " + i +" "+ list.get(i));
         for (int j = 0; j < list.size(); j++) {
            
            System.out.println("j " + j +" "+ list.get(j));
            if(Integer.compare(list.get(i), list.get(j))==0  && i!=j) {
               System.out.println("break ");
               break;
            }
            if(j==list.size()-1) {
               sum+= list.get(i);
               System.out.println("sum: " +" j "+ j +" "+ list.get(i)+" "+sum);
            }
         }
         
      }
     
      
      return sum;
  }
   
}
