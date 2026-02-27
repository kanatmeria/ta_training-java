package com.epam.rd.qa.inheritance;

import net.bytebuddy.build.Plugin;

import java.math.BigDecimal;

public class Employee {
    private String name;

    private BigDecimal salary;

    private BigDecimal bonus = BigDecimal.ZERO;

    public Employee(String name, BigDecimal salary) {
        if(name== null || name.isBlank())
            throw new IllegalArgumentException();
        if(salary == null || salary.compareTo(BigDecimal.ZERO) <= 0)
            throw new IllegalArgumentException();

        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public BigDecimal getSalary() {
        return salary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        if(bonus == null || bonus.compareTo(BigDecimal.ZERO) <= 0)
            throw new IllegalArgumentException();

        this.bonus = bonus;
    }

//    public Employee(String name, BigDecimal salary) {
//        throw new UnsupportedOperationException();
//    }
//    public void setBonus(BigDecimal bonus) {
//        throw new UnsupportedOperationException();
//    }

    public BigDecimal toPay() {
        return salary.add(bonus);
//        throw new UnsupportedOperationException();
    }
}
