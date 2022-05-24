package com.arrays.medium;


import java.util.LinkedList;

/*
Given  a string input sentence , reverse it word by word. The sentence can have leading or trailing spaces and multiple spaces between words
Eg. input = "  the    sky is blue  "
   output = "blue is sky the"
 */
public class ReverseWordsInString {


  public  String reverseWordsInStringBetterApproach(String sentence){

    int strLen = sentence.length();
    StringBuilder result = new StringBuilder();

    int j = sentence.length() ;

    for(int i = strLen - 1 ; i >= 0 ; i--){

      if(sentence.charAt(i) == ' '){
          j = i ;
       }else if(i == 0 || sentence.charAt(i-1) == ' '){

         if(result.length() != 0)
           result.append(" ");


         result.append(sentence.substring(i,j));
       }

    }

    return result.toString();

  }


  public  String reverseWordsInString(String sentence){
     int strLen = sentence.length();

     LinkedList<String> linkedList = new LinkedList<>();

     StringBuilder newWord = new StringBuilder();

     for(int i = 0 ; i < strLen ; i++){

         if(sentence.charAt(i) == ' ' || i == strLen - 1) {

           if(i == strLen - 1 && sentence.charAt(i) != ' ')
             newWord.append(sentence.charAt(i)) ;

           if(newWord.length() > 0)
              linkedList.addFirst(newWord.toString());

           newWord = new StringBuilder();

         }else{

           newWord.append(sentence.charAt(i));

         }

     }

     String result = "" ;
     int i = 0;
     for(String str : linkedList){
       if(i  == 0)
         result += str ;
       else
         result += " " + str;

       i++;
     }

     return result ;

   }

   public static void main(String [] args){

      ReverseWordsInString reverseWordsInString = new ReverseWordsInString() ;
      System.out.println(reverseWordsInString.reverseWordsInString("  the sky   is blue   "));

      System.out.println(reverseWordsInString.reverseWordsInStringBetterApproach("  the sky   is blue   "));


   }




}
