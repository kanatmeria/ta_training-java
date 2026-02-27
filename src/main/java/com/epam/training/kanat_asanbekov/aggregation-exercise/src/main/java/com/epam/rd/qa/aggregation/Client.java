package com.epam.rd.qa.aggregation;

import java.math.BigDecimal;

public class Client {
    private final Deposit[] deposits;

    public Client() {
        deposits = new Deposit[10];
        // TODO Replace throw with ionException();
    }

    public boolean addDeposit(Deposit deposit) {
        // TODO Replace throw with your code
        for (int i = 0; i < deposits.length; i++){
            if(deposits[i] == null){
                deposits[i] = deposit;
                return true;
            }
        }
        return false;
    }

    public BigDecimal totalIncome() {
        BigDecimal total = BigDecimal.ZERO;

        for(Deposit d : deposits){
            if(d != null){
                total = total.add(d.income());
            }
        }
        return total;
        // TODO Replace throw with your code
    }

    public BigDecimal maxIncome() {
        // TODO Replace throw with your code
        BigDecimal max = BigDecimal.ZERO;
        for(Deposit d : deposits){
            if(d != null){
                BigDecimal income = d.income();
                if(income.compareTo(max) > 0 ){
                    max = income;
                }
            }
        }
        return max;

    }

    public BigDecimal getIncomeByNumber(int number) {
        // TODO Replace throw with your code
        if (number < 0 || number >= deposits.length || deposits[number] == null) {

            return BigDecimal.ZERO;
        }
        return deposits[number].income();
    }


}
