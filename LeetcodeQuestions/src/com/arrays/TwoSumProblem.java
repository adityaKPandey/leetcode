package com.arrays;


import java.util.Arrays;
import java.util.HashSet;

// Given an array of integers , find two numbers such that they add to a specific target number
public class TwoSumProblem {

  public int[] twoSum(int[] numbers, int target) {
    HashSet<Integer> lookupSet = new HashSet<>();

    for (int number : numbers) {
      if (lookupSet.contains(target - number) && target - number != number) {
        return new int[]{number, target - number};
      }

      lookupSet.add(number);
    }
    return new int [0];
  }

  public static void main(String[] args) {
    TwoSumProblem twoSumProblem = new TwoSumProblem();
    int[] result = twoSumProblem.twoSum(new int[]{1, 2, 3, 4, 5}, 9);
    Arrays.stream(result).forEach(System.out::println);
    System.out.println("######");

    int[] result2 = twoSumProblem.twoSum(new int[]{-1,-5,-2,0,5}, 0);
    Arrays.stream(result2).forEach(System.out::println);
    System.out.println("######");
  }

}
