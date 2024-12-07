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
    assertEquals(0, calculator.minimumUsingForLoop(new int[]{-1000, 5, 247, 200000, -75}));
  }

  @Test
  void testMinimumRegularWithForLoop() {
    assertEquals(0, calculator.minimumUsingForLoop(new int[]{1, 2, 3, 4, 5}));
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
  void testMaximumUsingStreamsWithLargeNumbersUsingStreams() {
    assertEquals(Integer.MAX_VALUE, calculator.maximumUsingStreams(new int[]{0, 10, Integer.MAX_VALUE, 100, 7}));
  }

  @Test
  void testMaximumUsingStreamsWithEmptyUsingStreams() {
    assertEquals(0, calculator.maximumUsingStreams(new int[]{}));
  }

  @Test
  void testMinimumUsingStreamsWithEmptyUsingStreams() {
    assertEquals(0, calculator.minimumUsingStreams(new int[]{}));
  }

  @Test
  void testSumUsingStreamsWithLargeNumbersUsingStreams() {
    assertEquals(3000000, calculator.sumUsingStreams(new int[]{1000000, 1000000, 1000000}));
  }

  @Test
  void testAverageUsingStreamsWithLargeNumbersUsingStreams() {
    assertEquals(1000000.0, calculator.averageUsingStreams(new int[]{1000000, 1000000, 1000000}));
  }

  @Test
  void testSumUsingStreamsWithZerosUsingStreams() {
    assertEquals(0, calculator.sumUsingStreams(new int[]{0, 0, 0}));
  }

  @Test
  void testAverageUsingStreamsWithZerosUsingStreams() {
    assertEquals(0.0, calculator.averageUsingStreams(new int[]{0, 0, 0}));
  }

  @Test
  void testSumUsingStreamsWithRegularNumbersUsingStreams() {
    assertEquals(152, calculator.sumUsingStreams(new int[]{0, 10, 35, 100, 7}));
  }

  @Test
  void testAverageUsingStreamsWithRegularNumbersUsingStreams() {
    assertEquals(30.4, calculator.averageUsingStreams(new int[]{0, 10, 35, 100, 7}));
  }
}
