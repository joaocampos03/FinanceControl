package dev.java10x.FinanceControl.infra.mapper;

import dev.java10x.FinanceControl.core.entities.Account;
import dev.java10x.FinanceControl.infra.dtos.AccountDto;
import org.springframework.stereotype.Component;

@Component
public class AccountDtoMapper {

    public AccountDto toDto(Account account) {
        return new AccountDto(
                account.id(),
                account.name(),
                account.type(),
                account.institution(),
                account.balance(),
                account.createdAt()
        );
    }

    public Account toEntity(AccountDto accountDto) {
        return new Account(
                accountDto.id(),
                accountDto.name(),
                accountDto.type(),
                accountDto.institution(),
                accountDto.balance(),
                accountDto.createdAt()
        );
    }
}
