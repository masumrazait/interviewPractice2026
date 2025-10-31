package NovemberJavaCoding;

/*
Simple and easy Java solutions for 28 string problems.
Each problem has a method and the main() demonstrates the example.
Feel free to run and tweak the examples.
*/

import java.util.*;

public class Jas {

   // 1. Reverse the string
   public static String reverseString(String s) {
       if (s == null) return null;
       return new StringBuilder(s).reverse().toString();
   }

   // 2. First non-repeated character (ignores spaces)
   public static Character firstNonRepeatedChar(String s) {
       if (s == null) return null;
       Map<Character, Integer> count = new LinkedHashMap<>();
       for (char c : s.toCharArray()) {
           if (c == ' ') continue;
           count.put(c, count.getOrDefault(c, 0) + 1);
       }
       for (char c : s.toCharArray()) {
           if (c == ' ') continue;
           if (count.get(c) == 1) return c;
       }
       return null;
   }

   // 3. Last non-repeated character (ignores spaces)
   public static Character lastNonRepeatedChar(String s) {
       if (s == null) return null;
       Map<Character, Integer> count = new LinkedHashMap<>();
       for (char c : s.toCharArray()) {
           if (c == ' ') continue;
           count.put(c, count.getOrDefault(c, 0) + 1);
       }
       Character last = null;
       for (char c : s.toCharArray()) {
           if (c == ' ') continue;
           if (count.get(c) == 1) last = c;
       }
       return last;
   }

   // 4. Remove duplicate characters (preserve first occurrences)
   public static String removeDuplicateCharacters(String s) {
       if (s == null) return null;
       StringBuilder sb = new StringBuilder();
       Set<Character> seen = new HashSet<>();
       for (char c : s.toCharArray()) {
           if (!seen.contains(c)) {
               seen.add(c);
               sb.append(c);
           }
       }
       return sb.toString();
   }

   // 5. Count occurrences of each character
   public static Map<Character, Integer> countOccurrences(String s) {
       Map<Character, Integer> map = new LinkedHashMap<>();
       if (s == null) return map;
       for (char c : s.toCharArray()) {
           map.put(c, map.getOrDefault(c, 0) + 1);
       }
       return map;
   }

   // 6. Print duplicate characters (unique list of characters that repeat)
   public static Set<Character> duplicateCharacters(String s) {
       Set<Character> duplicates = new LinkedHashSet<>();
       Set<Character> seen = new HashSet<>();
       if (s == null) return duplicates;
       for (char c : s.toCharArray()) {
           if (seen.contains(c)) duplicates.add(c);
           else seen.add(c);
       }
       return duplicates;
   }

   // 7. Print all duplicate characters and their count
   public static Map<Character, Integer> duplicateCharactersWithCount(String s) {
       Map<Character, Integer> counts = countOccurrences(s);
       Map<Character, Integer> result = new LinkedHashMap<>();
       for (Map.Entry<Character, Integer> e : counts.entrySet()) {
           if (e.getValue() > 1) result.put(e.getKey(), e.getValue());
       }
       return result;
   }

   // 8. Highest occurred character(s)
   public static List<Character> highestOccurredCharacters(String s) {
       Map<Character, Integer> counts = countOccurrences(s);
       List<Character> result = new ArrayList<>();
       int max = 0;
       for (int v : counts.values()) if (v > max) max = v;
       for (Map.Entry<Character, Integer> e : counts.entrySet()) {
           if (e.getValue() == max) result.add(e.getKey());
       }
       return result;
   }

   // 9. Remove given character from string
   public static String removeGivenCharacter(String s, char toRemove) {
       if (s == null) return null;
       return s.replace(String.valueOf(toRemove), "");
   }

   // 10. Check string contains digits
   public static boolean containsDigits(String s) {
       if (s == null) return false;
       for (char c : s.toCharArray()) if (Character.isDigit(c)) return true;
       return false;
   }

   // 11. Check string contains special characters (non-letter and non-digit and not space)
   public static boolean containsSpecialCharacters(String s) {
       if (s == null) return false;
       for (char c : s.toCharArray()) {
           if (!Character.isLetterOrDigit(c) && !Character.isSpaceChar(c)) return true;
       }
       return false;
   }

   // 12. Check string contains vowels (aeiou, case-insensitive)
   public static boolean containsVowels(String s) {
       if (s == null) return false;
       String lower = s.toLowerCase();
       for (char c : lower.toCharArray()) if ("aeiou".indexOf(c) >= 0) return true;
       return false;
   }

   // 13. Count letters, digits and special characters
   public static Map<String, Integer> countLettersDigitsSpecial(String s) {
       Map<String, Integer> res = new HashMap<>();
       res.put("letters", 0);
       res.put("digits", 0);
       res.put("special", 0);
       if (s == null) return res;
       for (char c : s.toCharArray()) {
           if (Character.isLetter(c)) res.put("letters", res.get("letters") + 1);
           else if (Character.isDigit(c)) res.put("digits", res.get("digits") + 1);
           else res.put("special", res.get("special") + 1);
       }
       return res;
   }

   // 14. Count capital and small letters
   public static Map<String, Integer> countUpperLower(String s) {
       Map<String, Integer> res = new HashMap<>();
       res.put("upper", 0);
       res.put("lower", 0);
       if (s == null) return res;
       for (char c : s.toCharArray()) {
           if (Character.isUpperCase(c)) res.put("upper", res.get("upper") + 1);
           else if (Character.isLowerCase(c)) res.put("lower", res.get("lower") + 1);
       }
       return res;
   }

   // 15. Count consonants and vowels (letters only)
   public static Map<String, Integer> countVowelsConsonants(String s) {
       Map<String, Integer> res = new HashMap<>();
       res.put("vowels", 0);
       res.put("consonants", 0);
       if (s == null) return res;
       for (char c : s.toLowerCase().toCharArray()) {
           if (Character.isLetter(c)) {
               if ("aeiou".indexOf(c) >= 0) res.put("vowels", res.get("vowels") + 1);
               else res.put("consonants", res.get("consonants") + 1);
           }
       }
       return res;
   }

   // 16. Percentages of letters, digits and special characters (of total length)
   public static Map<String, Double> percentagesLettersDigitsSpecial(String s) {
       Map<String, Double> res = new HashMap<>();
       if (s == null || s.length() == 0) {
           res.put("letters", 0.0);
           res.put("digits", 0.0);
           res.put("special", 0.0);
           return res;
       }
       Map<String, Integer> counts = countLettersDigitsSpecial(s);
       int total = s.length();
       res.put("letters", counts.get("letters") * 100.0 / total);
       res.put("digits", counts.get("digits") * 100.0 / total);
       res.put("special", counts.get("special") * 100.0 / total);
       return res;
   }

   // 17. Percentages of consonants and vowels (of total letters)
   public static Map<String, Double> percentagesVowelsConsonants(String s) {
       Map<String, Double> res = new HashMap<>();
       Map<String, Integer> counts = countVowelsConsonants(s);
       int totalLetters = counts.get("vowels") + counts.get("consonants");
       if (totalLetters == 0) {
           res.put("vowels", 0.0);
           res.put("consonants", 0.0);
           return res;
       }
       res.put("vowels", counts.get("vowels") * 100.0 / totalLetters);
       res.put("consonants", counts.get("consonants") * 100.0 / totalLetters);
       return res;
   }

   // 18. Percentages of Upper, Lower, Special, Digits (of total length)
   public static Map<String, Double> percentagesUpperLowerSpecialDigits(String s) {
       Map<String, Double> res = new HashMap<>();
       if (s == null || s.length() == 0) {
           res.put("upper", 0.0);
           res.put("lower", 0.0);
           res.put("special", 0.0);
           res.put("digits", 0.0);
           return res;
       }
       int upper = 0, lower = 0, digits = 0, special = 0;
       for (char c : s.toCharArray()) {
           if (Character.isUpperCase(c)) upper++;
           else if (Character.isLowerCase(c)) lower++;
           else if (Character.isDigit(c)) digits++;
           else special++;
       }
       int total = s.length();
       res.put("upper", upper * 100.0 / total);
       res.put("lower", lower * 100.0 / total);
       res.put("special", special * 100.0 / total);
       res.put("digits", digits * 100.0 / total);
       return res;
   }

   // 19. Sort the given string characters
   public static String sortString(String s) {
       if (s == null) return null;
       char[] arr = s.toCharArray();
       Arrays.sort(arr);
       return new String(arr);
   }

   // 20. Check whether two strings are anagram (ignore spaces and case)
   public static boolean areAnagrams(String s1, String s2) {
       if (s1 == null || s2 == null) return false;
       String a = s1.replaceAll("\\s+", "").toLowerCase();
       String b = s2.replaceAll("\\s+", "").toLowerCase();
       char[] ca = a.toCharArray();
       char[] cb = b.toCharArray();
       Arrays.sort(ca);
       Arrays.sort(cb);
       return Arrays.equals(ca, cb);
   }

   // 21. Count occurrence of a given character (case-sensitive)
   public static int countGivenCharacter(String s, char ch) {
       if (s == null) return 0;
       int count = 0;
       for (char c : s.toCharArray()) if (c == ch) count++;
       return count;
   }

   // 22. Replace given character to other given character
   public static String replaceCharacter(String s, char oldChar, char newChar) {
       if (s == null) return null;
       return s.replace(oldChar, newChar);
   }

   // 23. Check whether given string is palindrome (ignore non-alphanumerics and case)
   public static boolean isPalindrome(String s) {
       if (s == null) return false;
       StringBuilder sb = new StringBuilder();
       for (char c : s.toLowerCase().toCharArray()) {
           if (Character.isLetterOrDigit(c)) sb.append(c);
       }
       String cleaned = sb.toString();
       return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
   }

   // 24. Reverse words order in a given string
   public static String reverseWordsOrder(String s) {
       if (s == null) return null;
       String[] parts = s.trim().split("\\s+");
       Collections.reverse(Arrays.asList(parts));
       return String.join(" ", parts);
   }

   // 25. Reverse each word in the given string (preserve order)
   public static String reverseEachWord(String s) {
       if (s == null) return null;
       String[] parts = s.split(" ");
       StringBuilder res = new StringBuilder();
       for (int i = 0; i < parts.length; i++) {
           res.append(new StringBuilder(parts[i]).reverse());
           if (i < parts.length - 1) res.append(" ");
       }
       return res.toString();
   }

   // 26. Copy one string to another
   public static String copyString(String s) {
       // simple assignment is a copy for strings (immutable)
       return s == null ? null : new String(s);
   }

   // 27. Concat two strings
   public static String concatStrings(String s1, String s2) {
       if (s1 == null) s1 = "";
       if (s2 == null) s2 = "";
       return s1 + s2;
   }

   // 28. Print short name: Example "Sanjeeva Reddy Nagar" -> "SR Nagar"
   public static String shortName(String fullName) {
       if (fullName == null || fullName.trim().isEmpty()) return fullName;
       String[] parts = fullName.trim().split("\\s+");
       if (parts.length == 1) return parts[0];
       // take initials of first two words
       char i1 = Character.toUpperCase(parts[0].charAt(0));
       char i2 = Character.toUpperCase(parts[1].charAt(0));
       String last = parts[parts.length - 1];
       return "" + i1 + i2 + " " + last;
   }

   // Helper to print map nicely
   private static void printMap(Map<?, ?> map) {
       for (Map.Entry<?, ?> e : map.entrySet()) {
           System.out.println("  " + e.getKey() + " : " + e.getValue());
       }
   }

   public static void main(String[] args) {
       // Demonstrations for given examples:

       // 1
       String ex1 = "Nacre";
       System.out.println("1. Reverse of \"" + ex1 + "\": " + reverseString(ex1));

       // 2
       String ex2 = "Software Services";
       System.out.println("2. First non-repeated char in \"" + ex2 + "\": " + firstNonRepeatedChar(ex2));

       // 3
       System.out.println("3. Last non-repeated char in \"" + ex2 + "\": " + lastNonRepeatedChar(ex2));

       // 4
       String ex4 = "banaans";
       System.out.println("4. Remove duplicates from \"" + ex4 + "\": " + removeDuplicateCharacters(ex4));

       // 5
       String ex5 = "apple";
       System.out.println("5. Count occurrences in \"" + ex5 + "\":");
       printMap(countOccurrences(ex5));

       // 6
       String ex6 = "Programming";
       System.out.println("6. Duplicate characters in \"" + ex6 + "\": " + duplicateCharacters(ex6));

       // 7
       System.out.println("7. Duplicate characters with counts in \"" + ex6 + "\":");
       printMap(duplicateCharactersWithCount(ex6));

       // 8
       String ex8 = "aaaaabbcddddd";
       System.out.println("8. Highest occurred character(s) in \"" + ex8 + "\": " + highestOccurredCharacters(ex8));

       // 9
       String ex9 = "nacre Software";
       System.out.println("9. Remove character 'a' from \"" + ex9 + "\": " + removeGivenCharacter(ex9, 'a'));

       // 10
       String ex10 = "nacre123";
       System.out.println("10. Contains digits in \"" + ex10 + "\": " + containsDigits(ex10));

       // 11
       String ex11 = "nacre123@#";
       System.out.println("11. Contains special characters in \"" + ex11 + "\": " + containsSpecialCharacters(ex11));

       // 12
       String ex12 = "nacre123";
       System.out.println("12. Contains vowels in \"" + ex12 + "\": " + containsVowels(ex12));

       // 13
       String ex13 = "Nacre@123%";
       System.out.println("13. Count letters/digits/special in \"" + ex13 + "\":");
       printMap(countLettersDigitsSpecial(ex13));

       // 14
       String ex14 = "Nacre Software";
       System.out.println("14. Count upper/lower in \"" + ex14 + "\":");
       printMap(countUpperLower(ex14));

       // 15
       String ex15 = "Nacre";
       System.out.println("15. Count vowels/consonants in \"" + ex15 + "\":");
       printMap(countVowelsConsonants(ex15));

       // 16
       String ex16 = "Nacre@123%";
       System.out.println("16. Percentages letters/digits/special in \"" + ex16 + "\":");
       printMap(percentagesLettersDigitsSpecial(ex16));

       // 17
       String ex17 = "Nacre";
       System.out.println("17. Percentages vowels/consonants in \"" + ex17 + "\":");
       printMap(percentagesVowelsConsonants(ex17));

       // 18
       String ex18 = "Nacre@123%";
       System.out.println("18. Percentages upper/lower/special/digits in \"" + ex18 + "\":");
       printMap(percentagesUpperLowerSpecialDigits(ex18));

       // 19
       String ex19 = "nacre";
       System.out.println("19. Sorted \"" + ex19 + "\": " + sortString(ex19));

       // 20
       String s1 = "reaction", s2 = "creation";
       System.out.println("20. Are \"" + s1 + "\" and \"" + s2 + "\" anagrams? " + areAnagrams(s1, s2));

       // 21
       String ex21 = "Today is Monday";
       System.out.println("21. Occurrences of 'o' in \"" + ex21 + "\": " + countGivenCharacter(ex21, 'o'));

       // 22
       String ex22 = "nacre";
       System.out.println("22. Replace 'a' with 'o' in \"" + ex22 + "\": " + replaceCharacter(ex22, 'a', 'o'));

       // 23
       String ex23 = "madam";
       System.out.println("23. Is \"" + ex23 + "\" palindrome? " + isPalindrome(ex23));

       // 24
       String ex24 = "Java is best programming language";
       System.out.println("24. Reverse words order: \"" + ex24 + "\" -> \"" + reverseWordsOrder(ex24) + "\"");

       // 25
       String ex25 = "Today is Monday";
       System.out.println("25. Reverse each word: \"" + ex25 + "\" -> \"" + reverseEachWord(ex25) + "\"");

       // 26
       String str1 = "nacre";
       String str2 = copyString(str1);
       System.out.println("26. Copy string: str1=\"" + str1 + "\", str2=\"" + str2 + "\"");

       // 27
       String a = "nacre", b = " software";
       System.out.println("27. Concat: \"" + a + "\" + \"" + b + "\" = \"" + concatStrings(a, b) + "\"");

       // 28
       String ex28 = "Sanjeeva Reddy Nagar";
       System.out.println("28. Short name for \"" + ex28 + "\": " + shortName(ex28));
   }
}