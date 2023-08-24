package com.learn.java.dynamicprogramming;

import org.apache.hadoop.security.SaslOutputStream;

public class ApplicationTest {

    public static void main(String[] args) {
//        new ApplicationTest().displayFibonacciSeries();
//        new ApplicationTest().displayFrogJumpEnergy();
        new ApplicationTest().printWithoutSemicolon();
    }

    private void printWithoutSemicolon() {
        if (System.out.printf("Hello World") == null) {
        }
    }

    public void displayFibonacciSeries() {

        System.out.println("--------------------");
        System.out.println(new FibonacciSeries().getValue(1, FibonacciSeries.arr));


        System.out.println(new FibonacciSeries().getValue(1, FibonacciSeries.arr));
        System.out.println(new FibonacciSeries().getValue(2, FibonacciSeries.arr));
        System.out.println(new FibonacciSeries().getValue(3, FibonacciSeries.arr));
        System.out.println(new FibonacciSeries().getValue(4, FibonacciSeries.arr));
        System.out.println("--------------------");
        System.out.println(new FibonacciSeries().fibonacciDpMemoization(0));
        System.out.println(new FibonacciSeries().fibonacciDpMemoization(1));
        System.out.println(new FibonacciSeries().fibonacciDpMemoization(2));
        System.out.println(new FibonacciSeries().fibonacciDpMemoization(3));
        System.out.println(new FibonacciSeries().fibonacciDpMemoization(4));
        System.out.println("--------------------");
        System.out.println(new FibonacciSeries().fibonacciDpTabulation(0));
        System.out.println(new FibonacciSeries().fibonacciDpTabulation(1));
        System.out.println(new FibonacciSeries().fibonacciDpTabulation(2));
        System.out.println(new FibonacciSeries().fibonacciDpTabulation(3));
        System.out.println(new FibonacciSeries().fibonacciDpTabulation(4));
    }

    public void displayFrogJumpEnergy() {
        System.out.println(new FrogJump().getEnergy(5-1));
        System.out.println(new FrogJump().getEnergyTabulation(5));
    }
}

