package dev.java10x.FinanceControl.infra.gateway;

import dev.java10x.FinanceControl.core.entities.Account;
import dev.java10x.FinanceControl.core.gateway.AccountGateway;
import dev.java10x.FinanceControl.infra.mapper.AccountEntityMapper;
import dev.java10x.FinanceControl.infra.persistence.AccountEntity;
import dev.java10x.FinanceControl.infra.persistence.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AccountRepositoryGateway implements AccountGateway {

    private final AccountRepository accountRepository;
    private final AccountEntityMapper accountEntityMapper;

    @Override
    public Account createAccount(Account account) {
        AccountEntity accountEntity = accountEntityMapper.toEntity(account);
        AccountEntity newAccount =  accountRepository.save(accountEntity);
        return accountEntityMapper.toDomain(newAccount);
    }
}
