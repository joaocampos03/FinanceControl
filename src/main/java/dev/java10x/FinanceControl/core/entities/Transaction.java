package dev.java10x.FinanceControl.core.entities;

import dev.java10x.FinanceControl.core.enums.TransactionType;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public record Transaction(
        Long id,
        BigDecimal amount,
        TransactionType type,
        String category,
        String description,
        LocalDateTime date
) {}
