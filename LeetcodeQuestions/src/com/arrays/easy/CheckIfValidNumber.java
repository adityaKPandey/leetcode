package com.arrays.easy;

/*
Given a string , check if it forms a valid decimal number.
Ignore leading and trailing whitespaces
 */

// "  -0.001  "  -> valid
// "-0 .01" => invalid
// ".01" ==> valid

// "-.1"

public class CheckIfValidNumber {


  public boolean isValidDecimalNumber(String input){
    int size =  input.length();

    boolean firstNonWhiteSpaceFound = false;

    boolean dotFound = false;

    boolean firstNumberFound = false;

    for(int i = 0 ;i < size ; i++) {

      char c = input.charAt(i);

      if (c == ' ' && !firstNonWhiteSpaceFound) {
        continue;
      }
      
      if (firstNonWhiteSpaceFound && (c == '+' || c == '-'))
        return false;


      if(i > 0 && c  < '0' && c > '9' && ((input.charAt(i-1)  >='0' && input.charAt(i-1) <= '9' ) || input.charAt(i-1) == '.' || input.charAt(i-1) == '+'  || input.charAt(i-1) == '-'))
        return false;

      if(firstNonWhiteSpaceFound && i > 0 && input.charAt(i-1) == ' ' && c != ' ')
        return false;

      if ((c == '+' || c == '-' || c >= '0' && c <= '9' || c == '.') && !firstNonWhiteSpaceFound)
        firstNonWhiteSpaceFound = true;

      if( !firstNumberFound && c >= '0' && c <= '9')
        firstNumberFound = true;

      if (!dotFound && c == '.'){
        dotFound = true;
      }else if(dotFound && c == '.')
        return false;

    }

    return true;
  }

  public static void main(String [] args){
    CheckIfValidNumber checkIfValidNumber = new CheckIfValidNumber();

    //valid numbers scenarios
    System.out.println(checkIfValidNumber.isValidDecimalNumber("0.01"));
    System.out.println(checkIfValidNumber.isValidDecimalNumber(" 0.01"));
    System.out.println(checkIfValidNumber.isValidDecimalNumber("  0.01"));
    System.out.println(checkIfValidNumber.isValidDecimalNumber("0.01 "));
    System.out.println(checkIfValidNumber.isValidDecimalNumber("0.01  "));

    System.out.println(checkIfValidNumber.isValidDecimalNumber("-0.01"));
    System.out.println(checkIfValidNumber.isValidDecimalNumber(" +0.01"));
    System.out.println(checkIfValidNumber.isValidDecimalNumber("  -9.01"));
    System.out.println(checkIfValidNumber.isValidDecimalNumber("+4.01 "));
    System.out.println(checkIfValidNumber.isValidDecimalNumber("-8.95  "));

    System.out.println(checkIfValidNumber.isValidDecimalNumber(".95  "));
    System.out.println(checkIfValidNumber.isValidDecimalNumber(" -.95  "));


    //invalid numbers scenarios
    System.out.println(checkIfValidNumber.isValidDecimalNumber(" -.95 5"));
    System.out.println(checkIfValidNumber.isValidDecimalNumber("+0.95 4444"));
    System.out.println(checkIfValidNumber.isValidDecimalNumber("+95 4444"));
    System.out.println(checkIfValidNumber.isValidDecimalNumber("+95 4444"));
    System.out.println(checkIfValidNumber.isValidDecimalNumber("+95 4444"));

  }

}
