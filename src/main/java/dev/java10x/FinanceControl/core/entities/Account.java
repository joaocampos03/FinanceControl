package dev.java10x.FinanceControl.core.entities;

import dev.java10x.FinanceControl.core.enums.AccountType;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public record Account(
        String name,
        AccountType type,
        String institution,
        BigDecimal balance,
        LocalDateTime createdAt
) {}
