package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import kata.Arge;

public class ArgeTests {
   private static void testing(int actual, int expected) {
      assertEquals(expected, actual);
  }
  @Test
  public void test1() {
      System.out.println("Fixed Tests: nbYear");    
      testing(Arge.nbYear(1500, 5, 100, 5000),15);
      testing(Arge.nbYear(1500000, 2.5, 10000, 2000000), 10);
      testing(Arge.nbYear(1500000, 0.25, 1000, 2000000), 94);
      testing(Arge.nbYear(1500, 0.05, 100, 5000), 35);
  }
}
