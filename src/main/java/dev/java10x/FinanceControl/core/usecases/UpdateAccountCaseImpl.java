package dev.java10x.FinanceControl.core.usecases;

import dev.java10x.FinanceControl.core.entities.Account;

public class UpdateAccountCaseImpl implements UpdateAccountCase {

    @Override
    public Account execute(Account account) {
        return account;
    }
}
