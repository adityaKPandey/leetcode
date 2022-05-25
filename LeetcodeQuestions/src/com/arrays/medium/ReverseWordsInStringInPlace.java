package com.arrays.medium;




/*

Given  a string input sentence , reverse it word by word. The sentence does not have leading or trailing spaces and
words are always separated by a single space .
Eg. input = "the sky is blue"
   output = "blue is sky the"

*/

public class ReverseWordsInStringInPlace {


  public  String reverseWordsInString(char [] sentence){

    int strLen = sentence.length;

    int i = 0 ;

    reverse(0,strLen - 1 , sentence);

    for(int j = 0 ; j < strLen  ; j++){

        if(sentence[j] == ' ' || j == strLen - 1) {
          int k = j;
           if(j == strLen - 1)
             k = j+1;

          reverse(i,k-1,sentence);
          i = j+1;
        }else
          continue;

    }


    return new String(sentence);

  }

   public void reverse(int start , int end , char [] array){
      for(int i = start , j = end ; i <= j ; i++,j--){
         char temp = array[i] ;
         array[i] = array[j] ;
         array[j] = temp;
      }
   }



   public static void main(String [] args){

      ReverseWordsInStringInPlace reverseWordsInString = new ReverseWordsInStringInPlace() ;

      System.out.println(reverseWordsInString.reverseWordsInString("the sky is blue".toCharArray()));



   }




}
