package dev.java10x.FinanceControl.core.usecases;

import dev.java10x.FinanceControl.core.entities.Account;

public interface GetAccountByIdCase {

    public Account execute(Account account);
}
