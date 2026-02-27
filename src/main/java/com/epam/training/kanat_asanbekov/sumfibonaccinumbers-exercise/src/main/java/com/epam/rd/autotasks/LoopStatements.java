package com.epam.rd.autotasks;


class LoopStatements {
    public static int sumOfFibonacciNumbers(int n) {
        if (n <= 0) return 0;

        if (n == 1) return 0;
        if (n == 2) return 1;

        int sum = 1;
        int prev = 0;
        int curr = 1;

        for (int i = 3; i <= n; i++) {
            int next = prev + curr;
            sum += next;
            prev = curr;
            curr = next;
        }

        return sum;
    }

}
