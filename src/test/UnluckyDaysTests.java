package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import kata.UnluckyDays;

class UnluckyDaysTests {

   @Test
   void test() {
      assertEquals(3, UnluckyDays.unluckyDays(2015));
      assertEquals(1, UnluckyDays.unluckyDays(1986));
      assertEquals(2, UnluckyDays.unluckyDays(2020));
   }

}
