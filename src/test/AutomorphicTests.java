package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import kata.Automorphic;

public class AutomorphicTests {
   @Test
   public void One_Digit_Number()
   {
       assertEquals("Automorphic", Automorphic.autoMorphic(1));
       assertEquals("Not!!",       Automorphic.autoMorphic(3));
       assertEquals("Automorphic", Automorphic.autoMorphic(6));
       assertEquals("Not!!",       Automorphic.autoMorphic(9));
   }
   @Test
   public void Two_Digit_Number()
   {
       assertEquals("Automorphic", Automorphic.autoMorphic(25));
       assertEquals("Not!!",       Automorphic.autoMorphic(13));
       assertEquals("Automorphic", Automorphic.autoMorphic(76));
       assertEquals("Not!!",       Automorphic.autoMorphic(95));
   }
   @Test
   public void Larger_Number()
   {
       assertEquals("Automorphic", Automorphic.autoMorphic(625));
       assertEquals("Not!!",       Automorphic.autoMorphic(225));
       assertEquals("Not!!",       Automorphic.autoMorphic(425));
       assertEquals("Not!!",       Automorphic.autoMorphic(399));
   }
}
