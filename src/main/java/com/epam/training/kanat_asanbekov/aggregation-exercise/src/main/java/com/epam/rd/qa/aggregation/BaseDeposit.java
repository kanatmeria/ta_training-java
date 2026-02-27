package com.epam.rd.qa.aggregation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BaseDeposit extends Deposit {


    public BaseDeposit(BigDecimal amount, int period) {
        super(amount, period);
    }

    @Override
    public BigDecimal income() {
        BigDecimal sum = amount;
        BigDecimal factor = BigDecimal.valueOf(1.05);

        for (int i = 0; i < period; i++) {
            sum = sum.multiply(factor)
                    .setScale(2, RoundingMode.HALF_EVEN);
        }

        return sum.subtract(amount)
                .setScale(2, RoundingMode.HALF_EVEN);
    }



    // TODO Place your code here
}
