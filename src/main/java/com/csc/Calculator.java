package com.csc;
import java.util.Arrays;


public class Calculator {
  public int maximumUsingForLoop(int[] nums){
    if (nums.length == 0) return 0;
    int max = nums[0];
    for (int i = 0; i < nums.length; i++){
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    return max;
  }

  public int minimumUsingForLoop(int[] nums){
    if (nums.length == 0) return 0;
    int min = nums[0];
    for (int i = 0; i < nums.length; i++){
      if (nums[i] < min) {
        min = nums[i];
      }
    }
    return min;
  }

  public int sumUsingForLoop(int[] nums){
    if (nums.length == 0) return 0;
    int sum = 0;
    for (int i = 0; i < nums.length; i++){
        sum += nums[i];
    }
    return sum;
  }

  public double averageUsingForLoop(int[] nums){
    if (nums.length == 0) return 0;
    double sum = 0;
    for (int i = 0; i < nums.length; i++){
      sum += nums[i];
    }
    return sum / nums.length;
  }

  public int maximumUsingStreams(int[] nums) {
    return nums.length == 0 ? 0 : Arrays.stream(nums).max().orElse(0);
  }

  public int minimumUsingStreams(int[] nums) {
    return nums.length == 0 ? 0 : Arrays.stream(nums).min().orElse(0);
  }

  public int sumUsingStreams(int[] nums) {
    return nums.length == 0 ? 0 : Arrays.stream(nums).sum();
  }

  public double averageUsingStreams(int[] nums){
    return nums.length == 0 ? 0 : Arrays.stream(nums).average().orElse(0.0);
  }

  public static void main(String[] args) {
    System.out.println("This class can house your driver program and / or your functions.");
  }
}
