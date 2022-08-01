package test;



import kata.Dinglemouse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DinglemouseTests {
   @Test
   public void testEx() {
     assertEquals(1, Dinglemouse.riders(new int[]{18, 15}));
     assertEquals(2, Dinglemouse.riders(new int[]{43, 23, 40, 13}));
     assertEquals(3, Dinglemouse.riders(new int[]{33, 8, 16, 47, 30, 30, 46}));
     assertEquals(4, Dinglemouse.riders(new int[]{6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49}));
     assertEquals(5, Dinglemouse.riders(new int[]{23, 14, 47, 38, 30, 22, 5, 24, 21, 42, 40, 43, 31}));
     assertEquals(29, Dinglemouse.riders(new int[]{5, 11, 14, 23, 18, 19, 15, 17, 16, 7, 13, 11, 24, 6, 15, 16, 12, 17, 11, 10, 10, 8, 17, 13, 22, 9, 25, 17, 14, 21, 9, 14, 5, 18, 6, 15, 5, 15, 15, 20, 7, 19, 24, 10, 23, 23, 7, 5, 9, 17, 18, 6, 23, 6, 19, 13, 22, 12, 18, 18, 6, 25, 12, 18, 19, 21, 18, 9, 9, 24, 12, 12, 9, 16, 8, 6, 7, 10, 12, 7, 13, 21, 9, 22, 8, 6, 9, 7, 21, 9, 23, 5, 8, 5, 13, 16, 19, 19, 11, 18, 5, 14, 24, 9, 24, 5, 14, 22, 6, 11, 21, 20, 6, 8, 19, 5, 15, 10, 17, 24, 9, 20, 9, 17, 23, 25, 24, 10, 15, 18, 9, 16, 25, 23, 16, 12, 25, 25, 13, 18, 17, 18, 14, 19, 13, 8, 12, 11, 16, 24, 8, 18, 20, 7, 18, 12, 21, 25, 17, 21, 15, 23, 9, 13, 8, 8, 7, 11, 23, 5, 21, 7, 23, 5, 22, 16, 16, 16, 16, 12, 6, 7, 18, 8}));

   }
}
