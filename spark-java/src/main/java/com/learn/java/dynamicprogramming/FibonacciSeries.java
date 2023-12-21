package com.learn.java.dynamicprogramming;

public class FibonacciSeries {
    static int[] arr = {-1, -1, -1, -1, -1};
    final int max = 10000;
    int[] fib = new int[max];

    int fibonacciDpMemoization(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;

        if (fib[num] != 0) {
            return fib[num];
        }
        fib[num] = fibonacciDpMemoization(num - 1) + fibonacciDpMemoization(num - 2);
        return fib[num];
    }

    int fibonacciDpTabulation(int num) {
        int prev = 1;
        int prev2 = 0;
        int current = -1;
        if (num <= 1) return prev2;
        if (num == 2) return prev;
        for (int i = 2; i < num; i++) {
            current = prev2 + prev;
            prev2 = prev;
            prev = current;

        }
        return prev;
    }

    public int getValue(int n, int[] arr) {
        if (n <= 1) return n;
        if (arr[n] != -1) return arr[n];
        return arr[n] = getValue(n - 2, arr) + getValue(n - 3, arr);
    }

}
