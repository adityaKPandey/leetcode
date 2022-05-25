package com.arrays.medium;

import java.util.Arrays;

public class RotateAnArrayInPlace<T> {

    public  void rotate(T [] array , int k ){
        int size = array.length ;
        reverse(0,size - 1 , array);
        reverse(0 , k -1 , array );
        reverse(k,size - 1 , array);


    }


    public void reverse(int start , int end , T [] array){
        for(int i = start , j = end ; i <= j ; i++,j--){
            T temp = array[i] ;
            array[i] = array[j] ;
            array[j] = temp;
        }
    }

    public static void main(String [] args){

        Integer [] array = {1,2,3,4} ;
        RotateAnArrayInPlace rotateAnArrayInPlace = new RotateAnArrayInPlace();
        rotateAnArrayInPlace.rotate(array,1);


        Arrays.stream(array).forEach(System.out :: println);

        System.out.println("#######");
        Character [] charArray = {'a','b' , 'c' , 'd' , 'e'} ;
        rotateAnArrayInPlace.rotate(charArray,2);
        Arrays.stream(charArray).forEach(System.out :: println);
    }

}
