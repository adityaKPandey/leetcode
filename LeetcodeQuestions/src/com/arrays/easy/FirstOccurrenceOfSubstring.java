package com.arrays.easy;

/*
    Find first occurrence of needle in haystack
 */
//TODO Check efficient solution and implement that one
public class FirstOccurrenceOfSubstring {

  public int strStr(String needle , String haystack){
      int i = 0 , j = 0 , k = 0 ;

      while(i < haystack.length() - needle.length() + 1){

          if(haystack.charAt(i+k) == needle.charAt(j)){
             if(j == needle.length() - 1)
               return i;

             k++;
             j++;

          }else{
            k = j = 0;
            i += 1;
          }

      }

      return -1;
  }


  public static void main(String [] args){

    FirstOccurrenceOfSubstring firstOccurrenceOfSubstring = new FirstOccurrenceOfSubstring();
    System.out.println(firstOccurrenceOfSubstring.strStr("dik" , "indika")) ;

    System.out.println(firstOccurrenceOfSubstring.strStr("dik" , "indidika")) ;

  }

}
