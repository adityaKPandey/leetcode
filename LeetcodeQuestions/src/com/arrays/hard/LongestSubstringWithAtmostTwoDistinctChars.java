package com.arrays.hard;

import java.util.HashSet;
import java.util.Set;

/*

Given a string S, find the length of the longest substring T that contains at most two
distinct characters.
For example,
Given S = “eceba”,
T is "ece" which its length is 3.


 */

public class LongestSubstringWithAtmostTwoDistinctChars {

  public long findLenOfLongestSubstringWithAtmostTwoDistinctChars(String input) {

    long maxLen = 0;
    long len = 0;
    int k = 0 ;
    Set<Integer> characters = new HashSet<>();
    int[] startPointOfSubstrEndingHere = new int[input.length()];

    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);

      if ( characters.size() < 2 || (characters.contains((int)c) && characters.size() < 3) || (i > 0
          && input.charAt(i) == input.charAt(i - 1))) {

        len++;
        startPointOfSubstrEndingHere[i] = k;

      } else {

        if(!characters.contains((int)c)){
          //brand new char
           int j = i-1;
           while(j > 0 && input.charAt(j) == input.charAt(i-1))
             j--;

           len = i - j ;


        }else {
          //old char but coming after long time
          int j = i-1;
          while(j > 0 && ( input.charAt(j) == input.charAt(i-1)  || input.charAt(j) == input.charAt(i)))
            j--;

          len = i - j ;

        }
        //maxLenTillThatPos[i] = len;

      }

      maxLen = Math.max(len, maxLen);

      characters.add((int) c);
    }

    return maxLen;
  }

  public static void main(String[] args) {

     LongestSubstringWithAtmostTwoDistinctChars longestSubstringWithAtmostTwoDistinctChars = new LongestSubstringWithAtmostTwoDistinctChars();

     System.out.println(longestSubstringWithAtmostTwoDistinctChars.findLenOfLongestSubstringWithAtmostTwoDistinctChars("eceba")) ;


     System.out.println(longestSubstringWithAtmostTwoDistinctChars.findLenOfLongestSubstringWithAtmostTwoDistinctChars("eeebedbb")) ;

    System.out.println(longestSubstringWithAtmostTwoDistinctChars.findLenOfLongestSubstringWithAtmostTwoDistinctChars("ebabcbcbc")) ;

    System.out.println(longestSubstringWithAtmostTwoDistinctChars.findLenOfLongestSubstringWithAtmostTwoDistinctChars("ebeeedfbf")) ;

  }

}
