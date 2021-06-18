package kata.adventofcode2020;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AdventOfCode2020 {

   public static void main(String[] args) {
      AdventOfCode2020 adventOfCode2020 = new AdventOfCode2020();
      // System.out.println(day1.solveDay1Part1(day1.getCsv()));
      // System.out.println(day1.solveDay1Part2(day1.toIntArray(day1.getCsv("day1_input.csv"))));

      // System.out.println(adventOfCode2020
      // .solveDay2Part1(adventOfCode2020.toStringArray(adventOfCode2020.getCsv("day2_input.csv"))));

      // System.out.println(adventOfCode2020.solveDay2Part2(adventOfCode2020.toStringArray(adventOfCode2020.getCsv("day2_input.csv"))));

      // System.out.println(adventOfCode2020.solveDay3Part1(adventOfCode2020.toStringArray(adventOfCode2020.getCsv("day3_input.csv"))));

      // System.out.println(adventOfCode2020.solveDay3Part2(adventOfCode2020.toStringArray(adventOfCode2020.getCsv("day3_input.csv")), new int[] { 1, 1, 3, 1, 5, 1, 7, 1, 1, 2 }));

//      adventOfCode2020.solveDay4Part1(adventOfCode2020.csvToString(adventOfCode2020.getCsv("day4_input.csv")));
   
      adventOfCode2020.solveDay4Part2(adventOfCode2020.csvToString(adventOfCode2020.getCsv("day4_input.csv")));

   }
   
   public int solveDay5Part1(String input) {
      
      return 0;
   }
   
   public boolean compareLessAndMost(Integer value, Integer less, Integer most) {
      
      if (value.compareTo(less)<0 || value.compareTo(most)>0) {
         return false;
      }
      return true;
   }
   
   public boolean compareHgt(String valueStr) {
      
      boolean isValid = true;
      
      int value = 0;
      if(valueStr.endsWith("cm")) {
         value = Integer.valueOf(valueStr.replaceAll("cm",""));
         
         isValid = compareLessAndMost(value, 150, 193);
      }else if(valueStr.endsWith("in")) {
         value = Integer.valueOf(valueStr.replaceAll("in",""));
         isValid = compareLessAndMost(value, 59, 76);
      }else {
         isValid = false;
      }
      
      return isValid;
   }
   
   public int solveDay4Part2(String input) {

      List<String> passportFields = new ArrayList<>(Arrays.asList("byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid", "cid"));

      int count = 0;
      System.out.println("inputstr1 " + input);
      input = input.replaceAll("(\r\n\r\n)", "*");
      input = input.replaceAll("\r\n", " ");
      System.out.println("inputstr " + input);
      String[] inputArr = input.split("\\*");
      // System.out.println("\narray \n");
      
      for (int i = 0; i < inputArr.length; i++) {
         
         System.out.println("Passport: "+i);
         
         String[] passport = inputArr[i].split(" ");
         Map<String, String> mapTemp = new HashMap<String, String>();
         for (int j = 0; j < passport.length; j++) {
            String[] passportTemp = passport[j].split(":");
            mapTemp.put(passportTemp[0], passportTemp[1]);
         }
         if (mapTemp.size() == 8 || (mapTemp.size() == 7 && !mapTemp.containsKey("cid"))) {
            

            boolean isValid = true;
            for (Entry<String, String> entry : mapTemp.entrySet()) {
               if (isValid) {
//                  System.out.println(" "+entry.getKey()+ " " +entry.getValue());
                  Integer value = 0;
                  try {
                     value = Integer.valueOf(entry.getValue());
                  } catch (NumberFormatException e) {
//                    System.out.println("nan");
                  }
                  String valueStr = entry.getValue();
                  switch (entry.getKey()) {
                     case "byr":
                        isValid = compareLessAndMost(value, 1920, 2002);
                        break;
                     case "iyr":
                        isValid = compareLessAndMost(value, 2010, 2020);
                        break;
                     case "eyr":
                        isValid = compareLessAndMost(value, 2020, 2030);
                        break;
                     case "hgt":
                        
                        if(valueStr.endsWith("cm")) {
                           value = Integer.valueOf(valueStr.replaceAll("cm",""));
                           isValid = compareLessAndMost(value, 150, 193);
                        }else if(valueStr.endsWith("in")) {
                           value = Integer.valueOf(valueStr.replaceAll("in",""));
                           isValid = compareLessAndMost(value, 59, 76);
                        }else {
                           isValid = false;
                        }
//                        System.out.println("value " + value );
                        break;

                     case "hcl":
                        if(valueStr.startsWith("#")) {
                           valueStr = valueStr.replaceAll("#","");
                           boolean test = valueStr.matches("^([a-f]|[0-9]){6}$");
                           isValid = test;
                        }else {
                           isValid=false;
                        }
                        break;
                     case "ecl":
                        List<String> strArr = Arrays.asList("amb", "blu", "brn", "gry", "grn", "hzl", "oth");
                        isValid=strArr.contains(valueStr);
                        break;
                     case "pid":
                        isValid = valueStr.matches("^[0-9]{9}$");
                        break;

                     default:
                        break;
                  }
                  System.out.println(String.format("key: %s, valueInt : %d, valueStr: %s, isValid: %s", entry.getKey(), value, valueStr, isValid));
                  
               }else {
                  break;
               }
               
            }
            
            if(!isValid) {
               System.out.println("count "+count);
               count++;
            }
         }else {
            System.out.println("count "+count);
            count++;
         }
         System.out.println();
      }
      System.out.println(inputArr.length-count);
      return inputArr.length-count;
   }

   public int solveDay4Part1(String input) {

      List<String> passportFields = new ArrayList<>(Arrays.asList("byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid", "cid"));

      int count = 0;
      System.out.println("inputstr1 " + input);
      input = input.replaceAll("(\r\n\r\n)", "*");
      input = input.replaceAll("\r\n", " ");
      System.out.println("inputstr " + input);
      String[] inputArr = input.split("\\*");
      // System.out.println("\narray \n");

      for (int i = 0; i < inputArr.length; i++) {
         String[] passport = inputArr[i].split(" ");
         Map<String, String> mapTemp = new HashMap<String, String>();
         for (int j = 0; j < passport.length; j++) {
            String[] passportTemp = passport[j].split(":");
            mapTemp.put(passportTemp[0], passportTemp[1]);
         }
         if (mapTemp.size() == 8 || (mapTemp.size() == 7 && !mapTemp.containsKey("cid"))) {
            System.out.println("valid");
            count++;
         }
         System.out.println();
      }
      System.out.println(count);
      return count;
   }

   public int solveDay3Part2(String[] strArr, int[] directionArr) {

      List<Integer> countList = new ArrayList<Integer>();

      for (int i = 0; i < directionArr.length; i += 2) {
         int count = 0;
         int x = directionArr[i];
         int y = directionArr[i + 1];

         System.out.println(String.format("length %d %d %d ", strArr.length, x, y));
         count = solveDay3Part2Method(strArr.clone(), x, y);
         System.out.println("count " + count);
         countList.add(count);
      }
      countList.forEach(System.out::println);
      return countList.stream().reduce(1, (a, b) -> a * b);

   }

   public int solveDay3Part2Method(String[] array, int x, int y) {

      int cursor = x;
      int count = 0;

      for (int i = 0 + y; i < array.length; i += y) {

         while (cursor > array[i].length() - 1) {
            array[i] += array[i];
         }

         char test = array[i].charAt(cursor);
         char[] arr = array[i].toCharArray();
         if (test == '#') {
            arr[cursor] = 'X';
            count++;
         } else {
            arr[cursor] = 'O';
         }
         System.out.println(String.valueOf(arr));

         // System.out.println("test cursor i arr :"+ test +" "+cursor+" "+ i + " "+ array[i]);

         cursor += x;
      }

      return count;
   }

   public int solveDay3Part1(String[] array) {

      int cursor = 3;
      int count = 0;

      System.out.println("length " + array.length);

      for (int i = 1; i < array.length; i++) {

         while (cursor > array[i].length() - 1) {
            array[i] += array[i];
         }

         char test = array[i].charAt(cursor);
         if (test == '#') count++;
         System.out.println(test);
         System.out.println(array[i]);

         cursor += 3;
      }

      return count;
   }

   public int solveDay2Part2(String[] array) {

      int count = 0;

      for (int i = 0; i < array.length; i++) {

         String[] splitFull = array[i].split(" ");
         String[] splitFirst = splitFull[0].split("-");
         int pos1 = Integer.valueOf(splitFirst[0]) - 1;
         int pos2 = Integer.valueOf(splitFirst[1]) - 1;
         char testChar = splitFull[1].charAt(0);

         if (splitFull[2].charAt(pos1) == testChar && splitFull[2].charAt(pos2) != testChar) {
            count++;
            System.out.println(array[i] + " valid");
         } else if (splitFull[2].charAt(pos2) == testChar && splitFull[2].charAt(pos1) != testChar) {
            count++;
            System.out.println(array[i] + " valid");
         } else {
            System.out.println(array[i] + " invalid");
         }

      }

      return count;
   }

   public int solveDay2Part1(String[] array) {

      int count = 0;

      for (int i = 0; i < array.length; i++) {

         String[] splitFull = array[i].split(" ");

         String[] splitFirst = splitFull[0].split("-");
         int min = Integer.valueOf(splitFirst[0]);
         int max = Integer.valueOf(splitFirst[1]);

         char testChar = splitFull[1].charAt(0);

         long countChars = splitFull[2].chars().filter(c -> c == testChar).count();
         System.out.println(countChars);
         if (countChars <= max && countChars >= min) count++;
      }

      return count;
   }

   public int solveDay1Part2(int[] arr) {
      Arrays.parallelSort(arr);
      for (int i = 0; i < arr.length - 1; i++) {
         int firstElement = arr[i];

         for (int j = i + 1; j < arr.length; j++) {
            int secondElement = arr[j];
            int firstPlusSecond = firstElement + secondElement;

            for (int j2 = j + 1; j2 < arr.length; j2++) {

               int thirdElement = arr[j2];
               int test = firstPlusSecond + thirdElement;
               System.out.println(String.format("%d %d %d %d %d %d %d %d", i, j, j2, firstElement, secondElement, thirdElement, firstPlusSecond, test));

               if (test == 2020) {
                  return firstElement * secondElement * thirdElement;
               }
            }
         }
      }
      return -1;
   }

   public int solveDay1Part1(int[] arr) {

      for (int i = 0; i < arr.length; i++) {

         int firstElem = arr[i];

         for (int j = i + 1; j < arr.length; j++) {

            int secondElem = arr[j];
            int test = firstElem + secondElem;
            if (test == 2020) {
               return firstElem * secondElem;
            }
         }
      }

      return -1;
   }

   public String csvToString(BufferedReader reader) {

      return reader.lines().collect(Collectors.joining("\r\n"));
   }

   public String[] toStringArray(BufferedReader reader) {

      return reader.lines().toArray(String[]::new);
   }

   public int[] toIntArray(BufferedReader reader) {

      return reader.lines().mapToInt(Integer::valueOf).toArray();
   }

   public BufferedReader getCsv(String inputFile) {

      InputStream is = getClass().getClassLoader().getResourceAsStream(inputFile);

      InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
      return new BufferedReader(isr);
   }
}
