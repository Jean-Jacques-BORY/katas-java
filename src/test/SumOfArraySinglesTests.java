package test;


import org.junit.jupiter.api.Test;

import kata.SumOfArraySingles;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfArraySinglesTests {
   
   @Test
   public void basicTests(){     
       assertEquals(15,SumOfArraySingles.repeats(new int []{4,5,7,5,4,8}));
       assertEquals(19,SumOfArraySingles.repeats(new int []{9, 10, 19, 13, 19, 13}));
       assertEquals(12,SumOfArraySingles.repeats(new int []{16, 0, 11, 4, 8, 16, 0, 11}));    
       assertEquals(15,SumOfArraySingles.repeats(new int []{1,2,1,2,4,5,6}));    
       assertEquals(1824,SumOfArraySingles.repeats(new int []{730,804,804,1094,1135,1135,1206,1206,1806,1806}));    
        
   }
   
}

