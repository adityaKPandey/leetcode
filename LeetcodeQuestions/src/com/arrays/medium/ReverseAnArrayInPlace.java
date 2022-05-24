package com.arrays.medium;

import java.util.Arrays;

public class ReverseAnArrayInPlace<T> {

    public  void reverse(T [] array){
        int size = array.length ;

        for(int i = 0 , j = size - 1 ; i <= j ; i++,j--){
            //swap array[i] and array[j]

            T temp = array[i] ;
            array[i] = array[j] ;
            array[j] = temp;
        }

    }

    public static void main(String [] args){

        Integer [] array = {1,2,3,4} ;
        ReverseAnArrayInPlace reverseAnArrayInPlace = new ReverseAnArrayInPlace();
        reverseAnArrayInPlace.reverse(array);

        Arrays.stream(array).forEach(System.out :: println);

        System.out.println("#######");
        Character [] charArray = {'a','b' , 'c' , 'd' , 'e'} ;
        reverseAnArrayInPlace.reverse(charArray);
        Arrays.stream(charArray).forEach(System.out :: println);
    }

}
