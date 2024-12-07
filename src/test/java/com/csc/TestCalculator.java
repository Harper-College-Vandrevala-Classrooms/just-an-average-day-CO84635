package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculator {

  Calculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new Calculator();
  }

  @Test
  void itWorks() {
    assertEquals(true, true);
  }

  @Test
  void testMaximumWithLargeAndSmallWithForLoop() {
    assertEquals(200000, calculator.maximumUsingForLoop(new int[]{-1000, 5, 247, 200000, -75}));
  }

  @Test
  void testMaximumRegularWithForLoop() {
    assertEquals(5, calculator.maximumUsingForLoop(new int[]{1, 2, 3, 4, 5}));
  }

  @Test
  void testMaximumZeroWithForLoop() {
    assertEquals(0, calculator.maximumUsingForLoop(new int[]{0, 0, 0, 0, 0}));
  }

  @Test
  void testMaximumWithMaxWithForLoop() {
    assertEquals(Integer.MAX_VALUE, calculator.maximumUsingForLoop(new int[]{0, 10, Integer.MAX_VALUE, 100, 7}));
  }

  @Test
  void testMaximumWithNegativeNumbersWithForLoop() {
    assertEquals(-1, calculator.maximumUsingForLoop(new int[]{-30, -10, -700, -100, -1, -Integer.MAX_VALUE}));
  }

  @Test
  void testMaximumWithEmptyArrayWithForLoop() {
    assertEquals(0, calculator.maximumUsingForLoop(new int[]{}));
  }

  @Test
  void testMinimumWithLargeAndSmallWithForLoop() {
    assertEquals(-1000, calculator.minimumUsingForLoop(new int[]{-1000, 5, 247, 200000, -75}));
  }

  @Test
  void testMinimumRegularWithForLoop() {
    assertEquals(1, calculator.minimumUsingForLoop(new int[]{1, 2, 3, 4, 5}));
  }

  @Test
  void testMinimumWithMaxWithForLoop() {
    assertEquals(0, calculator.minimumUsingForLoop(new int[]{0, 10, Integer.MAX_VALUE, 100, 7}));
  }

  @Test
  void testMinimumZeroWithForLoop() {
    assertEquals(0, calculator.minimumUsingForLoop(new int[]{0, 0, 0, 0, 0}));
  }

  @Test
  void testMinimumWithNegativeNumbersWithForLoop() {
    assertEquals(-Integer.MAX_VALUE, calculator.minimumUsingForLoop(new int[]{-30, -10, -700, -100, -1, -Integer.MAX_VALUE}));
  }

  @Test
  void testMinimumWithEmptyArrayWithForLoop() {
    assertEquals(0, calculator.minimumUsingForLoop(new int[]{}));
  }

  @Test
  void testSumWithLargeNumbersForLoop() {
    assertEquals(3000000, calculator.sumUsingForLoop(new int[]{1000000, 1000000, 1000000}));
  }

  @Test
  void testSumWithZerosForLoop() {
    assertEquals(0, calculator.sumUsingForLoop(new int[]{0, 0, 0}));
  }

  @Test
  void testSumWithRegularNumbersForLoop() {
    assertEquals(152, calculator.sumUsingForLoop(new int[]{0, 10, 35, 100, 7}));
  }

  @Test
  void testSumWithEmptyArrayForLoop() {
    assertEquals(0, calculator.sumUsingForLoop(new int[]{}));
  }

  @Test
  void testSumWithNegativeNumbersForLoop() {
      assertEquals(-60, calculator.sumUsingForLoop(new int[]{-10, -20, -30}));
  }

  @Test
  void testAverageWithNegativeNumbersForLoop() {
      assertEquals(-20.0, calculator.averageUsingForLoop(new int[]{-10, -20, -30}));
  }

  @Test
  void testAverageWithLargeNumbersForLoop() {
    assertEquals(1000000.0, calculator.averageUsingForLoop(new int[]{1000000, 1000000, 1000000}));
  }

  @Test
  void testAverageWithZerosForLoop() {
    assertEquals(0.0, calculator.averageUsingForLoop(new int[]{0, 0, 0}));
  }

  @Test
  void testAverageWithRegularNumbersForLoop() {
    assertEquals(30.4, calculator.averageUsingForLoop(new int[]{0, 10, 35, 100, 7}));
  }

  @Test
  void testAverageWithEmptyArrayForLoop() {
    assertEquals(0, calculator.averageUsingForLoop(new int[]{}));
  }

    @Test
  void testMaximumWithLargeAndSmallUsingStreams() {
      assertEquals(200000, calculator.maximumUsingStreams(new int[]{-1000, 5, 247, 200000, -75}));
  }

  @Test
  void testMaximumWithRegularNumbersUsingStreams() {
      assertEquals(5, calculator.maximumUsingStreams(new int[]{1, 2, 3, 4, 5}));
  }

  @Test
  void testMaximumWithZerosUsingStreams() {
      assertEquals(0, calculator.maximumUsingStreams(new int[]{0, 0, 0, 0, 0}));
  }

  @Test
  void testMaximumWithMaxValueUsingStreams() {
      assertEquals(Integer.MAX_VALUE, calculator.maximumUsingStreams(new int[]{0, 10, Integer.MAX_VALUE, 100, 7}));
  }

  @Test
  void testMaximumWithNegativeNumbersUsingStreams() {
      assertEquals(-1, calculator.maximumUsingStreams(new int[]{-30, -10, -700, -100, -1, -Integer.MAX_VALUE}));
  }

  @Test
  void testMaximumWithEmptyArrayUsingStreams() {
      assertEquals(0, calculator.maximumUsingStreams(new int[]{}));
  }

  @Test
  void testMinimumWithLargeAndSmallUsingStreams() {
      assertEquals(-1000, calculator.minimumUsingStreams(new int[]{-1000, 5, 247, 200000, -75}));
  }

  @Test
  void testMinimumWithRegularNumbersUsingStreams() {
      assertEquals(1, calculator.minimumUsingStreams(new int[]{1, 2, 3, 4, 5}));
  }

  @Test
  void testMinimumWithMaxValueUsingStreams() {
      assertEquals(0, calculator.minimumUsingStreams(new int[]{0, 10, Integer.MAX_VALUE, 100, 7}));
  }

  @Test
  void testMinimumWithZerosUsingStreams() {
      assertEquals(0, calculator.minimumUsingStreams(new int[]{0, 0, 0, 0, 0}));
  }

  @Test
  void testMinimumWithNegativeNumbersUsingStreams() {
      assertEquals(-Integer.MAX_VALUE, calculator.minimumUsingStreams(new int[]{-30, -10, -700, -100, -1, -Integer.MAX_VALUE}));
  }

  @Test
  void testMinimumWithEmptyArrayUsingStreams() {
      assertEquals(0, calculator.minimumUsingStreams(new int[]{}));
  }

  @Test
  void testSumWithLargeNumbersUsingStreams() {
      assertEquals(3000000, calculator.sumUsingStreams(new int[]{1000000, 1000000, 1000000}));
  }

  @Test
  void testSumWithZerosUsingStreams() {
      assertEquals(0, calculator.sumUsingStreams(new int[]{0, 0, 0}));
  }

  @Test
  void testSumWithRegularNumbersUsingStreams() {
      assertEquals(152, calculator.sumUsingStreams(new int[]{0, 10, 35, 100, 7}));
  }

  @Test
  void testSumWithEmptyArrayUsingStreams() {
      assertEquals(0, calculator.sumUsingStreams(new int[]{}));
  }

  @Test
  void testSumWithNegativeNumbersUsingStreams() {
      assertEquals(-60, calculator.sumUsingStreams(new int[]{-10, -20, -30}));
  }

  @Test
  void testAverageWithLargeNumbersUsingStreams() {
      assertEquals(1000000.0, calculator.averageUsingStreams(new int[]{1000000, 1000000, 1000000}));
  }

  @Test
  void testAverageWithZerosUsingStreams() {
      assertEquals(0.0, calculator.averageUsingStreams(new int[]{0, 0, 0}));
  }

  @Test
  void testAverageWithRegularNumbersUsingStreams() {
      assertEquals(30.4, calculator.averageUsingStreams(new int[]{0, 10, 35, 100, 7}));
  }

  @Test
  void testAverageWithEmptyArrayUsingStreams() {
      assertEquals(0.0, calculator.averageUsingStreams(new int[]{}));
  }

  @Test
  void testAverageWithNegativeNumbersUsingStreams() {
      assertEquals(-20.0, calculator.averageUsingStreams(new int[]{-10, -20, -30}));
  }

}
