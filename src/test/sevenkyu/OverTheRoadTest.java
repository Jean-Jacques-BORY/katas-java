package test.sevenkyu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import kata.sevenkyu.OverTheRoad;

public class OverTheRoadTest {
   
   @Test
   public void basicOddCases() {
     assertEquals(6, OverTheRoad.overTheRoad(1, 3));
     assertEquals(4, OverTheRoad.overTheRoad(3, 3));
     assertEquals(8, OverTheRoad.overTheRoad(3, 5));
     assertEquals(16, OverTheRoad.overTheRoad(7, 11));
     assertEquals(596421736780L, OverTheRoad.overTheRoad(23633656673L, 310027696726L)); 
   }
   
   @Test
   public void basicEvenTestCases() {
     assertEquals(5, OverTheRoad.overTheRoad(2, 3));
     assertEquals(3, OverTheRoad.overTheRoad(4, 3));
     assertEquals(9, OverTheRoad.overTheRoad(2, 5));
     assertEquals(1999981L, OverTheRoad.overTheRoad(20, 1000000));
   }
}
