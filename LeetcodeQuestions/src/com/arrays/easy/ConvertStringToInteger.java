package com.arrays.easy;

/*
  The atoi method takes a string as input and returns corresponding integer after conversion - similar to Integer.parseInt
  It discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting
  from this character , takes an optional + or - sign followed by as many numeric characters as possible. The processing stops
  at first non-numeric character then.

  The method should handle the Integer limits , returning max or nin possible integer value is that limit is exceeded.

 */
public class ConvertStringToInteger {

   public int atoi(String str){

     int length = str.length();

     int multiple = 1 ;
     int result = 0;

      int sign = 1 ;
      int validCharCount = 0 ;

     for(int i = 0 ; i < length ; i++){

         if( str.charAt(i) == '-' && validCharCount == 0){
             sign = -1;
             validCharCount++;
         }else if ( str.charAt(i) >= '0' && str.charAt(i) <= '9'){
             int digit = str.charAt(i) - '0' ;
             int oldResult = result ;
             result *= multiple;
             multiple = 10;
             result += digit;
             if(result < 0 && oldResult >= 0 ){
               result = Integer.MAX_VALUE ;
                if(sign == -1)
                  return Integer.MIN_VALUE;
                return result;
             }

         }else if(validCharCount > 0)
           break;

     }

     return result*sign;

   }

   public static void main(String [] args){
     ConvertStringToInteger convertStringToInteger = new ConvertStringToInteger();
     System.out.println(convertStringToInteger.atoi("-1412"));

     System.out.println(convertStringToInteger.atoi("+2323"));
     System.out.println(convertStringToInteger.atoi("-93633"));

     System.out.println(convertStringToInteger.atoi("-562066666666666666666633333333333333777777777777"));

     System.out.println(convertStringToInteger.atoi("562066666666666666666633333333333333777777777777"));

     System.out.println(convertStringToInteger.atoi("-56206666$%#@6666666666666633333333333333777777777777"));
     System.out.println(convertStringToInteger.atoi("  -56206666$%#@66666666666666333 33333333333777777777777"));
     System.out.println(convertStringToInteger.atoi("-+56206666$%#@6666666666666633333333333333777777777777"));
   }

}
