package test.sevenkyu;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import kata.sevenkyu.NextHappyYear;

public class NextHappyYearTests {
   @Test
   public void Check_Basic_Values() {
       assertEquals(1023, NextHappyYear.nextHappyYear(1001));
       assertEquals(1203, NextHappyYear.nextHappyYear(1123));
       assertEquals(2013, NextHappyYear.nextHappyYear(2001));
       assertEquals(2340, NextHappyYear.nextHappyYear(2334));
       assertEquals(3401, NextHappyYear.nextHappyYear(3331));
       assertEquals(2345, NextHappyYear.nextHappyYear(2342));
       assertEquals(2013, NextHappyYear.nextHappyYear(1987));
       assertEquals(2014, NextHappyYear.nextHappyYear(2013));
       assertEquals(3012, NextHappyYear.nextHappyYear(3000));
   }
   @Test
   public void Check_Larger_Values() {
       assertEquals(5601, NextHappyYear.nextHappyYear(5555));
       assertEquals(7801, NextHappyYear.nextHappyYear(7712));
       assertEquals(8091, NextHappyYear.nextHappyYear(8088));
       assertEquals(8901, NextHappyYear.nextHappyYear(8800));
       assertEquals(9012, NextHappyYear.nextHappyYear(8989));
       assertEquals(9012, NextHappyYear.nextHappyYear(8977));
       assertEquals(6870, NextHappyYear.nextHappyYear(6869));
       assertEquals(9012, NextHappyYear.nextHappyYear(8999));
   }
}
