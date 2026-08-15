package dev.java10x.FinanceControl.core.usecases;

import dev.java10x.FinanceControl.core.entities.Account;

import java.util.List;

public interface ListAccountCase {

    public List<Account> execute(Account account);
}
