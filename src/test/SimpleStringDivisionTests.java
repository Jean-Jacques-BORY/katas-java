package test;


import kata.SimpleStringDivision;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleStringDivisionTests {
   @Test
   public void basicTests1(){     
       assertEquals(23,SimpleStringDivision.solve("123",1));
         
   }
   @Test
   public void basicTests2(){     
       assertEquals(234,SimpleStringDivision.solve("1234",1));  
   }
   
   @Test
   public void basicTests11(){     
       assertEquals(99,SimpleStringDivision.solve("5995",2));
         
   }
   
   @Test
   public void basicTests3(){     
      assertEquals(34,SimpleStringDivision.solve("1234",2));
   }
   @Test
   public void basicTests4(){     
      assertEquals(4,SimpleStringDivision.solve("1234",3));
   }
   
   @Test
   public void basicTests45(){     
      assertEquals(4444,SimpleStringDivision.solve("1234444258",6));
   }
   
   @Test
   public void basicTests46(){     
      assertEquals(4444258,SimpleStringDivision.solve("1234444258",3));
   }
   
   @Test
   public void basicTests5(){     
      assertEquals(42,SimpleStringDivision.solve("3421",2));
   }
}
