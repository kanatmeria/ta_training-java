package com.epam.rd.qa.inheritance;

import java.math.BigDecimal;

public class Company {
    private Employee[] employees;

    public Company(Employee[] employees) {
        if (employees == null)
            throw new IllegalArgumentException();
        this.employees = employees;
    }

    public void giveEverybodyBonus(BigDecimal bonus) {
        if (bonus == null || bonus.compareTo(BigDecimal.ZERO) <= 0)
            throw new IllegalArgumentException();

        for (Employee e : employees) {
            e.setBonus(bonus); // ← полиморфизм
        }
    }

    public BigDecimal totalToPay() {
        BigDecimal total = BigDecimal.ZERO;
        for (Employee e : employees) {
            total = total.add(e.toPay());
        }
        return total;
    }

    public String nameMaxSalary() {
        Employee max = employees[0];
        for (Employee e : employees) {
            if (e.toPay().compareTo(max.toPay()) > 0) {
                max = e;
            }
        }
        return max.getName();
    }
}

