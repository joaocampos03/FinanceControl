package dev.java10x.FinanceControl.infra.dtos;

import dev.java10x.FinanceControl.core.enums.AccountType;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public record AccountDto(
        Long id,
        String name,
        AccountType type,
        String institution,
        BigDecimal balance,
        LocalDateTime createdAt
) {}
