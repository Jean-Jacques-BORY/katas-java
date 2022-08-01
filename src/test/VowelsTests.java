package test;


import org.junit.jupiter.api.Test;

import kata.Vowels;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VowelsTests {
   @Test
   public void testCase1() {
     assertEquals( 5, Vowels.getCount("abracadabra"));
   }
}
