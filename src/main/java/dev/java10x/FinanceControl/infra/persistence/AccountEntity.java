package dev.java10x.FinanceControl.infra.persistence;

import dev.java10x.FinanceControl.core.enums.AccountType;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "conta")
public class AccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    private AccountType type;

    @Column(name = "institution")
    private String institution;

    @Column(name = "balance")
    private BigDecimal balance;

    @Column(name = "createdat")
    private LocalDateTime createdAt;
}
