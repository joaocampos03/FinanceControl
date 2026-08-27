package dev.java10x.FinanceControl.core.gateway;

import dev.java10x.FinanceControl.core.entities.Account;

public interface AccountGateway {

    Account createAccount(Account account);
}
