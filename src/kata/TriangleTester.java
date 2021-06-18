package kata;

public class TriangleTester {
   public static boolean isTriangle(int a, int b, int c){
     
      return (a < b + c) && ( b < a+ c) && (c < a + b) ? true : false;
      
   }
}
