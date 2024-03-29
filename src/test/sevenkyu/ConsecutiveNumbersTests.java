package test.sevenkyu;


import org.junit.jupiter.api.Test;

import kata.sevenkyu.ConsecutiveNumbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsecutiveNumbersTests {
   @Test
   public void exampleTests() {
       assertEquals(2, ConsecutiveNumbers.consecutive(new int[]{4,8,6}));
       assertEquals(0, ConsecutiveNumbers.consecutive(new int[]{1,2,3,4}));
       assertEquals(0, ConsecutiveNumbers.consecutive(new int[]{}));
       assertEquals(0, ConsecutiveNumbers.consecutive(new int[]{1}));
       
       assertEquals(0, ConsecutiveNumbers.consecutive(new int[]{1,2,3,4}));
   }
}
