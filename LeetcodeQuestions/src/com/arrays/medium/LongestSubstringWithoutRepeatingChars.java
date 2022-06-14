package com.arrays.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {

  public int findLengthOfLongestSubstringWithoutRepetition(String input){
    int i = 0;
    int strLen = input.length();
    int maxSubstrLen = 0;
    int thisSubstrLen = 0;

    Set<Integer> lookedUpChars = new HashSet<>();

    while(i < strLen){

      if(lookedUpChars.contains((int)input.charAt(i))){
        thisSubstrLen = 0;
      }else
        thisSubstrLen++;

      if(thisSubstrLen > maxSubstrLen)
        maxSubstrLen = thisSubstrLen ;

      lookedUpChars.add((int) input.charAt(i));
      i++;

    }

    return maxSubstrLen;

  }

  public static void main(String [] args){
    LongestSubstringWithoutRepeatingChars longestSubstringWithoutRepeatingChars = new LongestSubstringWithoutRepeatingChars();
    System.out.println(longestSubstringWithoutRepeatingChars.findLengthOfLongestSubstringWithoutRepetition("bbbb"));
    System.out.println(longestSubstringWithoutRepeatingChars.findLengthOfLongestSubstringWithoutRepetition("abcaefgd"));


  }


}
