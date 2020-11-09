package kata;

public class Cockroach {
   public int cockroachSpeed(double x){
      // Good Luck!
      //hour to second => 1h = 60 min = 3600 seconds
      //km to cm => *100000
      
      double res = (x*100000) /3600 ;
      System.out.println(res);
      return (int) Math.floor(res);
    }
   
   
}
