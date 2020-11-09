package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import kata.ShortestWord;

class ShortestWordTests {

   @Test
   void test() {
      
      assertEquals(3, ShortestWord.findShort("bitcoin take over the world maybe who knows perhaps"));
      assertEquals(3, ShortestWord.findShort("turns out random test cases are easier than writing out basic ones"));
      
   }

}
