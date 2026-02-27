package com.epam.rd.autotasks;

import java.rmi.UnexpectedException;

class ConditionStatements {

    public static int task2(int n) {
       //TODO: Delete line below and write your own solution
        int hundreds = n / 100;
        int tens = (n / 10) % 10;
        int ones = n % 10;

        int maxDigit = Math.max(hundreds, Math.max(tens, ones));
        int minDigit = Math.min(hundreds, Math.min(tens, ones));
        int midDigit = hundreds + tens + ones - maxDigit - minDigit;

        return maxDigit * 100 + midDigit * 10 + minDigit;
    }
}
