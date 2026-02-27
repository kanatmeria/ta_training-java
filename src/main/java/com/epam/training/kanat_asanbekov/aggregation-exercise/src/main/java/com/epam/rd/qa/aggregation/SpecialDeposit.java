package com.epam.rd.qa.aggregation;

import java.math.BigDecimal;
import java.math.RoundingMode;
public class SpecialDeposit extends Deposit {

    public SpecialDeposit(BigDecimal amount, int period) {
        super(amount, period);
    }

    @Override
    public BigDecimal income() {
        BigDecimal sum = amount;

        for (int month = 1; month <= period; month++) {
            BigDecimal percent = BigDecimal.valueOf(month)
                    .divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_EVEN);

            sum = sum.add(
                    sum.multiply(percent)
                            .setScale(2, RoundingMode.HALF_EVEN)
            );
        }

        return sum.subtract(amount)
                .setScale(2, RoundingMode.HALF_EVEN);
    }
}
