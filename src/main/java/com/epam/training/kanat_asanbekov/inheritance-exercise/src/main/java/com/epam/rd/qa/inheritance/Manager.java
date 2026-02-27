package com.epam.rd.qa.inheritance;

import java.math.BigDecimal;
public class Manager extends Employee {
    private int clientAmount;

    public Manager(String name, BigDecimal salary, int clientAmount) {
        super(name, salary);
        if (clientAmount < 0)
            throw new IllegalArgumentException();
        this.clientAmount = clientAmount;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if (bonus == null || bonus.compareTo(BigDecimal.ZERO) <= 0)
            throw new IllegalArgumentException();

        if (clientAmount > 150) {
            bonus = bonus.add(BigDecimal.valueOf(1000));
        } else if (clientAmount > 100) {
            bonus = bonus.add(BigDecimal.valueOf(500));
        }

        super.setBonus(bonus);
    }
}
