package test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


import kata.Cockroach;
import kata.WordValues;
import org.junit.jupiter.api.Test;

public class CockroachSpeedTests {
   @Test
   public void basicTests() throws Exception{
     Cockroach cockroach = new Cockroach();
     assertEquals(30, cockroach.cockroachSpeed(1.08));
     assertEquals(30, cockroach.cockroachSpeed(1.09));
     assertEquals(0, cockroach.cockroachSpeed(0));
   }
   
   @Test
   public void basicTests1(){     
      
       assertArrayEquals(new int[]{6,24},WordValues.nameValue(new String[]{"abc","abc abc"}));
       assertArrayEquals(new int[]{88,12,225},WordValues.nameValue(new String[]{"codewars","abc","xyz"}));
       assertArrayEquals(new int[]{351,282,330},WordValues.nameValue(new String[]{"abcdefghijklmnopqrstuvwxyz","stamford bridge","haskellers"})); 
   }
}
