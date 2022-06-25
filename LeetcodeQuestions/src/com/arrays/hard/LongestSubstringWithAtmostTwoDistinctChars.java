package com.arrays.hard;

import java.util.HashSet;
import java.util.Set;

/*
<TRY AGAIN>
Given a string S, find the length of the longest substring T that contains at most two
distinct characters.
For example,
Given S = “eceba”,
T is "ece" which its length is 3.


 */

public class LongestSubstringWithAtmostTwoDistinctChars {

  /*
      The trick is to maintain a sliding window that always satisfies the invariant where there
are always at most two distinct characters in it. When we add a new character that breaks
this invariant, how can we move the begin pointer to satisfy the invariant? Using the
above example, our first window is the substring “abba”. When we add the character ‘c’
into the sliding window, it breaks the invariant. Therefore, we have to readjust the
window to satisfy the invariant again. The question is which starting point to choose so
the invariant is satisfied.
Let’s look at another example where S = “abaac”. We found our first window “abaa”.
When we add ‘c’ to the window, the next sliding window should be “aac”

   */
  public long findLenOfLongestSubstringWithAtmostTwoDistinctCharsEfficient(String input) {
    long maxLen = 0;
    int i = 0, j = -1;
    // i = starting point of this sliding window
    //
    for (int k = 1; k < input.length(); k++) {
      char c = input.charAt(k);

      if ( c == input.charAt(k - 1)) {
           continue;
      }else{
         if(j >= 0 && input.charAt(j) != input.charAt(k)) {
           maxLen = Math.max(k-i,maxLen);
           i = j+1;
         }

         j = k-1;

      }

    }

    return  Math.max(input.length()-i,maxLen);
  }

  public static void main(String[] args) {

     LongestSubstringWithAtmostTwoDistinctChars longestSubstringWithAtmostTwoDistinctChars = new LongestSubstringWithAtmostTwoDistinctChars();

    System.out.println("aabbc " + longestSubstringWithAtmostTwoDistinctChars.findLenOfLongestSubstringWithAtmostTwoDistinctCharsEfficient("aabbc")) ;

    System.out.println("eceba " + longestSubstringWithAtmostTwoDistinctChars.findLenOfLongestSubstringWithAtmostTwoDistinctCharsEfficient("eceba")) ;


     System.out.println("eeebedbb " + longestSubstringWithAtmostTwoDistinctChars.findLenOfLongestSubstringWithAtmostTwoDistinctCharsEfficient("eeebedbb")) ;

    System.out.println("ebabcbcbc " + longestSubstringWithAtmostTwoDistinctChars.findLenOfLongestSubstringWithAtmostTwoDistinctCharsEfficient("ebabcbcbc")) ;

    System.out.println("ebeeedfbf " + longestSubstringWithAtmostTwoDistinctChars.findLenOfLongestSubstringWithAtmostTwoDistinctCharsEfficient("ebeeedfbf")) ;

  }

}
