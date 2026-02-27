package com.epam.rd.qa.inheritance;

import java.math.BigDecimal;

public class SalesPerson extends Employee{
    private int percent;

    public SalesPerson(String name, BigDecimal salary, int percent) {
        super(name, salary);
        if(percent < 0)
            throw new IllegalArgumentException();

        this.percent = percent;

//        throw new UnsupportedOperationException();
    }

    @Override
    public void setBonus(BigDecimal bonus) {

        if(bonus == null || bonus.compareTo(BigDecimal.ZERO) <= 0 )
            throw new IllegalArgumentException();
        if(percent > 200){
            bonus = bonus.multiply(BigDecimal.valueOf(3));
        }else if(percent > 100) {
            bonus = bonus.multiply(BigDecimal.valueOf(2));
        }

        super.setBonus(bonus);
    }
}
