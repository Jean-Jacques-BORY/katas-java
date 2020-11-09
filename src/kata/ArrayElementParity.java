package kata;

public class ArrayElementParity {
   
   public static int solve(int [] arr){
      
      for (int i = 0; i < arr.length; i++) {
         
         for (int j = 0; j < arr.length; j++) {
            
            if( (-arr[i] == arr[j] || -arr[i] == arr[j]) && j!=i) {
               break;
            }
            
            if(j == arr.length-1) {
               return arr[i];
            }
         }
      }
      
      
      return 0;
  }
   
}
