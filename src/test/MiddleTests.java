package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import kata.Middle;

public class MiddleTests {
   @Test
   public void evenTests() {
     assertEquals("es", Middle.getMiddle("test"));
     assertEquals("dd", Middle.getMiddle("middle"));
   }
   
   @Test
   public void oddTests() {
     assertEquals("t", Middle.getMiddle("testing"));
     assertEquals("A", Middle.getMiddle("A"));
   }
}
