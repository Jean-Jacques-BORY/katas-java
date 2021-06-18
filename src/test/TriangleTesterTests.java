package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import kata.TriangleTester;

public class TriangleTesterTests {
   @Test
   public void publicTests() {
       assertEquals(true, TriangleTester.isTriangle(1,2,2));
       assertEquals(false, TriangleTester.isTriangle(7,2,2));
   }
}
