package com.learn.java.dynamicprogramming;

public class FrogJump {
    int[] frogEnergy = {30, 10, 60, 10, 60, 50};
    final int max = 10000;
    int[] fib = new int[max];

    public int getEnergy(int n) {
        if (n == 0) return 0;
        int left = getEnergy(n - 1) + Math.abs(frogEnergy[n] - frogEnergy[n - 1]);
        int right = n > 1 ? getEnergy(n - 2) + Math.abs(frogEnergy[n] - frogEnergy[n - 2]) : Integer.MAX_VALUE;
        return Integer.min(left, right);
    }

    public int getEnergyMemoization(int n) {
        if (n == 0) return 0;
        if (fib[n] != 0) return fib[n];
        int left = getEnergy(n - 1) + Math.abs(frogEnergy[n] - frogEnergy[n - 1]);
        int right = n > 1 ? getEnergy(n - 2) + Math.abs(frogEnergy[n] - frogEnergy[n - 2]) : Integer.MAX_VALUE;
        fib[n] = Integer.min(left, right);
        return fib[n];
    }

    public int getEnergyTabulation(int n) {
        int prev = 0;
        int prev2 = 0;
        int curr = 0;
        for (int i = 1; i < n; i++) {
            int fs = prev + Math.abs(frogEnergy[i] - frogEnergy[i - 1]);
            int ss = Integer.MAX_VALUE;
            if(i>1) ss = prev2+ Math.abs(frogEnergy[i] - frogEnergy[i - 2]);
            curr =  Integer.min(fs, ss);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}
