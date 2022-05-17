package com.arrays.easy;

/*
 Design and implement a TwoSum class which supports add and find operations
  void add(input) : Add the number input to an internal data structure . Expected TC : O(1)
  boolean find(sum) : Find if there exists any pair of numbers whose addition is equal to the input 'sum' . Expected TC : O(n)
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  private Map<Integer,Integer> numberVsFrequency = new HashMap<>();

  public void add(Integer input){
    int count = numberVsFrequency.containsKey(input) ? numberVsFrequency.get(input) : 0 ;
    numberVsFrequency.put(input , count+1);
  }

  public boolean find(Integer sum){

    for(Map.Entry<Integer , Integer> entry : numberVsFrequency.entrySet()){
      int key = entry.getKey();

      if(sum - key == key ){
        if(numberVsFrequency.get(key) == 2)
          return true;
      }else if(numberVsFrequency.containsKey(sum - key))
        return true;
    }

    return false;
  }

  public static void main(String [] args){
    TwoSum twoSum = new TwoSum();
    twoSum.add(1);
    twoSum.add(-1);
    twoSum.add(1);
    twoSum.add(4);


    System.out.println(twoSum.find(0));
    System.out.println(twoSum.find(2));
    System.out.println(twoSum.find(5));
    System.out.println(twoSum.find(3));
    System.out.println(twoSum.find(-2));
    System.out.println(twoSum.find(6));

  }

}
