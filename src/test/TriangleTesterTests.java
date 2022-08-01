package test;


import org.junit.jupiter.api.Test;

import kata.TriangleTester;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTesterTests {
   @Test
   public void publicTests() {
       assertEquals(true, TriangleTester.isTriangle(1,2,2));
       assertEquals(false, TriangleTester.isTriangle(7,2,2));
   }
}
