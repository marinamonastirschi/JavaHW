package groupProject;

import java.util.Arrays;

public class Task4 {
    /* Check if Two Strings are Anagrams: Given two strings, determine if
they are anagrams, meaning they contain the same characters in a
different order. For example, "listen" and "silent" are anagrams.
     */
   public static boolean areAnagrams(String word1, String word2) {
            char[] arr1 = word1.toCharArray();
            char[] arr2 = word2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        }
    public static void main(String[] args) {
        String word1="listen";
        String word2="silent";
        if(areAnagrams(word1, word2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}

