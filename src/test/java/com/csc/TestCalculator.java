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
  void testMaximumWithForLoop() {
    assertEquals(100, calculator.maximumUsingForLoop(new int[]{0, 10, 35, 100, 7}));
  }

  @Test
  void testMinimumWithForLoop() {
    assertEquals(0, calculator.minimumUsingForLoop(new int[]{0, 10, 35, 100, 7}));
  }

  @Test
  void testSumWithForLoop() {
    assertEquals(152, calculator.sumUsingForLoop(new int[]{0, 10, 35, 100, 7}));
  }

  @Test
  void testAverageWithForLoop() {
    assertEquals(30.4, calculator.averageUsingForLoop(new int[]{0, 10, 35, 100, 7}));
  }

  @Test
  void testMaximumUsingStreams(){
    assertEquals(100, calculator.maximumUsingStreams(new int[]{0, 10, 35, 100, 7}));
  }

  @Test
  void testMinimumUsingStreams(){
    assertEquals(0, calculator.minimumUsingStreams(new int[]{0, 10, 35, 100, 7}));
  }

  @Test
  void testSumUsingStreams(){
    assertEquals(152, calculator.sumUsingStreams(new int[]{0, 10, 35, 100, 7}));
  }

  @Test
  void testAverageUsingStreams(){
    assertEquals(30.4, calculator.averageUsingSteams(new int[]{0, 10, 35, 100, 7}));
  }
}
