package com.arrays.medium;


import java.util.Arrays;

// Given an array of integers sorted in ascending order, find two numbers such that they add to a specific target number
public class TwoSumProblemInAscSortedArray {


  public int[] twoSum(int[] numbers, int target) {
    int i = 0, j = numbers.length - 1;

    while (i < j && i < numbers.length && j > -1) {
      int currentSum = numbers[i] + numbers[j];
      if (currentSum == target) {
        return new int[]{numbers[i], numbers[j]};
      } else if (currentSum < target) {
        i++;
      } else {
        j--;
      }
    }

    return new int[0];
  }

  public static void main(String[] args) {
    TwoSumProblemInAscSortedArray twoSumProblem = new TwoSumProblemInAscSortedArray();
    int[] result = twoSumProblem.twoSum(new int[]{1, 2, 3, 4, 5}, 9);
    Arrays.stream(result).forEach(System.out::println);
    System.out.println("######");

    int[] result2 = twoSumProblem.twoSum(new int[]{-5, -2, -1, 0, 5}, 0);
    Arrays.stream(result2).forEach(System.out::println);
    System.out.println("######");

    int[] result3 = twoSumProblem.twoSum(new int[]{-5, -2, -1, 0, 5}, -3);
    Arrays.stream(result3).forEach(System.out::println);
    System.out.println("######");

    int[] result4 = twoSumProblem.twoSum(new int[]{-5, -2, -1, 0, 5}, -1);
    Arrays.stream(result4).forEach(System.out::println);
    System.out.println("######");

  }

}
