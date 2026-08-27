package dev.java10x.FinanceControl.infra.mapper;

import dev.java10x.FinanceControl.core.entities.Account;
import dev.java10x.FinanceControl.infra.persistence.AccountEntity;
import org.springframework.stereotype.Component;

@Component
public class AccountEntityMapper {

    public AccountEntity toEntity(Account account) {
        return new AccountEntity(
                account.id(),
                account.name(),
                account.type(),
                account.institution(),
                account.balance(),
                account.createdAt()
        );
    }

    public Account toDomain(AccountEntity accountEntity) {
        return new Account(
                accountEntity.getId(),
                accountEntity.getName(),
                accountEntity.getType(),
                accountEntity.getInstitution(),
                accountEntity.getBalance(),
                accountEntity.getCreatedAt()
        );
    }
}
