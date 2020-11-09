package test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

import kata.MostFrequentWeekdays;

public class MostFrequentWeekdaysTests {
   @Test
   public void SampleTests() {
      assertArrayEquals(new String[] { "Monday" }, MostFrequentWeekdays.mostFrequentDays(1770));
      assertArrayEquals(new String[] { "Saturday" }, MostFrequentWeekdays.mostFrequentDays(1785));
      assertArrayEquals(new String[] { "Tuesday" }, MostFrequentWeekdays.mostFrequentDays(1901));
      assertArrayEquals(new String[] { "Saturday" }, MostFrequentWeekdays.mostFrequentDays(2135));
      assertArrayEquals(new String[] { "Sunday" }, MostFrequentWeekdays.mostFrequentDays(3043));
      assertArrayEquals(new String[] { "Monday" }, MostFrequentWeekdays.mostFrequentDays(2001));
      assertArrayEquals(new String[] { "Sunday" }, MostFrequentWeekdays.mostFrequentDays(3150));
      assertArrayEquals(new String[] { "Tuesday" }, MostFrequentWeekdays.mostFrequentDays(3230));
      assertArrayEquals(new String[] { "Friday", "Saturday" }, MostFrequentWeekdays.mostFrequentDays(2016));
      assertArrayEquals(new String[] { "Wednesday" }, MostFrequentWeekdays.mostFrequentDays(1986));
      assertArrayEquals(new String[] { "Thursday" }, MostFrequentWeekdays.mostFrequentDays(3361));
      assertArrayEquals(new String[] { "Saturday" }, MostFrequentWeekdays.mostFrequentDays(1910));
      assertArrayEquals(new String[] { "Monday", "Tuesday" }, MostFrequentWeekdays.mostFrequentDays(1968));
      assertArrayEquals(new String[] { "Wednesday" }, MostFrequentWeekdays.mostFrequentDays(1794));
      assertArrayEquals(new String[] { "Monday", "Sunday" }, MostFrequentWeekdays.mostFrequentDays(1984));
      assertArrayEquals(new String[] { "Saturday", "Sunday" }, MostFrequentWeekdays.mostFrequentDays(2000));
   }

}
