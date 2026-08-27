package dev.java10x.FinanceControl.core.usecases;

import dev.java10x.FinanceControl.core.entities.Account;
import dev.java10x.FinanceControl.core.gateway.AccountGateway;

public class CreateAccountCaseImpl implements CreateAccountCase {

    private final AccountGateway accountGateway;

    public CreateAccountCaseImpl(AccountGateway accountGateway) {
        this.accountGateway = accountGateway;
    }

    @Override
    public Account execute(Account account) {
        return null;
    }
}
