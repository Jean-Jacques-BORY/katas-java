package test.adventofcode2020;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import kata.adventofcode2020.AdventOfCode2020;

public class AdventOfCode2020Tests {
   
   @Test
   public void day1Part1(){
      
       AdventOfCode2020 day1 = new AdventOfCode2020();
       
       assertEquals(514579,day1.solveDay1Part1(new int[]{1721,979,366,299,675,1456}));
   }
   
   @Test
   public void day1Part2(){
      
       AdventOfCode2020 day1 = new AdventOfCode2020();
       
       assertEquals(241861950,day1.solveDay1Part2(new int[]{979,1721,20,30,50,200,999,366,367,299,675,1456}));
   }
   
   @Test
   public void day2Part1(){
      
       AdventOfCode2020 day2 = new AdventOfCode2020();
       
       assertEquals(2, day2.solveDay2Part1(new String[] {
             "1-3 a: abcde",
             "1-3 b: cdefg",
             "2-9 c: ccccccccc",
       }));
   }
   
   @Test
   public void day2Part2(){
      
       AdventOfCode2020 day2 = new AdventOfCode2020();
       
       assertEquals(2, day2.solveDay2Part2(new String[] {
             "1-3 a: abcde",
             "1-3 b: cdefg",
             "2-9 c: ccccccccc",
             "6-12 r: crxrrzrnprrr"
       }));
   }
   
   @Test
   public void day3Part1(){
      
       AdventOfCode2020 day2 = new AdventOfCode2020();
       
       assertEquals(7, day2.solveDay3Part1(new String[] {
             "..##......." , 
             "#...#...#.." , 
             ".#....#..#." , 
             "..#.#...#.#" , 
             ".#...##..#." , 
             "..#.##....." , 
             ".#.#.#....#" , 
             ".#........#" , 
             "#.##...#..." , 
             "#...##....#" , 
             ".#..#...#.#"
       }));
   }
   
   @Test
   public void day3Part2(){
      
       AdventOfCode2020 day2 = new AdventOfCode2020();
       String[] arr = {
             "..##......." , 
             "#...#...#.." , 
             ".#....#..#." , 
             "..#.#...#.#" , 
             ".#...##..#." , 
             "..#.##....." , 
             ".#.#.#....#" , 
             ".#........#" , 
             "#.##...#..." , 
             "#...##....#" , 
             ".#..#...#.#"
       };
       
       int[] directionArr = {
             1, 1, 3, 1, 5, 1, 7, 1, 1, 2 
       };
       assertEquals(336, day2.solveDay3Part2(arr,directionArr));
   }
   
   @Test
   public void solveDay4Part2compareHgt(){
      
      Arrays.asList("123cm")
      .forEach(s-> assertEquals("123", s.replaceAll("cm","")));;
      
      
   }
   
   
   @Test
   public void solveDay4Part2compareHcl(){
      
      Arrays.asList("abcdef","a123ac")
      .forEach(s-> assertEquals(true, s.matches("^([a-f]|[0-9]){6}$")));;
      
            
      Arrays.asList("abcdez","a123123")
      .forEach(s-> assertEquals(false, s.matches("^([a-f]|[0-9]){6}$")));;
   }
   
   @Test
   public void solveDay4Part2(){
      
      AdventOfCode2020 day4 = new AdventOfCode2020();
      
      String input = "eyr:1972 cid:100\r\n" + 
         "hcl:#18171d ecl:amb hgt:170 pid:186cm iyr:2018 byr:1926\r\n" + 
         "\r\n" + 
         "iyr:2019\r\n" + 
         "hcl:#602927 eyr:1967 hgt:170cm\r\n" + 
         "ecl:grn pid:012533040 byr:1946\r\n" + 
         "\r\n" + 
         "hcl:dab227 iyr:2012\r\n" + 
         "ecl:brn hgt:182cm pid:021572410 eyr:2020 byr:1992 cid:277\r\n" + 
         "\r\n" + 
         "hgt:59cm ecl:zzz\r\n" + 
         "eyr:2038 hcl:74454a iyr:2023\r\n" + 
         "pid:3556412378 byr:2007\r\n"
         + "\r\n"
         + "pid:087499704 hgt:74in ecl:grn iyr:2012 eyr:2030 byr:1980\r\n" + 
         "hcl:#623a2f\r\n" + 
         "\r\n" + 
         "eyr:2029 ecl:blu cid:129 byr:1989\r\n" + 
         "iyr:2014 pid:896056539 hcl:#a97842 hgt:165cm\r\n" + 
         "\r\n" + 
         "hcl:#888785\r\n" + 
         "hgt:164cm byr:2001 iyr:2015 cid:88\r\n" + 
         "pid:545766238 ecl:hzl\r\n" + 
         "eyr:2022\r\n" + 
         "\r\n" + 
         "iyr:2010 hgt:158cm hcl:#b6652a ecl:blu byr:1944 eyr:2021 pid:093154719";
      
      assertEquals(4, day4.solveDay4Part2(input));
   }

   @Test
   public void solveDay4Part1(){
      
      AdventOfCode2020 day4 = new AdventOfCode2020();
      
      String input = "ecl:gry pid:860033327 eyr:2020 hcl:#fffffd\r\n" + 
         "byr:1937 iyr:2017 cid:147 hgt:183cm\r\n" + 
         "\r\n" + 
         "iyr:2013 ecl:amb cid:350 eyr:2023 pid:028048884\r\n" + 
         "hcl:#cfa07d byr:1929\r\n" + 
         "\r\n" + 
         "hcl:#ae17e1 iyr:2013\r\n" + 
         "eyr:2024\r\n" + 
         "ecl:brn pid:760753108 byr:1931\r\n" + 
         "hgt:179cm\r\n" + 
         "\r\n" + 
         "hcl:#cfa07d eyr:2025 pid:166559648\r\n" + 
         "iyr:2011 ecl:brn hgt:59in";
      
      assertEquals(2, day4.solveDay4Part1(input));
      
      
   }
   
   @Test
   public void solveDay5Part1(){
      AdventOfCode2020 day = new AdventOfCode2020();
      
      
      String input ="";
      
      assertEquals(1, day.solveDay5Part1(input));
   }
   
}
