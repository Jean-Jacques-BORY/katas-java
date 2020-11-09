package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import kata.Vowels;

public class VowelsTests {
   @Test
   public void testCase1() {
     assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
   }
}
