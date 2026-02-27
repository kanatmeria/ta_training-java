package com.epam.rd.qa.aggregation;

import java.math.BigDecimal;
import java.math.RoundingMode;
public class LongDeposit extends Deposit {

    public LongDeposit(BigDecimal amount, int period) {
        super(amount, period);
    }

    @Override
    public BigDecimal income() {
        BigDecimal sum = amount;
        BigDecimal factor = BigDecimal.valueOf(1.15);

        for (int month = 7; month <= period; month++) {
            sum = sum.multiply(factor)
                    .setScale(2, RoundingMode.HALF_EVEN);
        }

        return sum.subtract(amount)
                .setScale(2, RoundingMode.HALF_EVEN);
    }
}
