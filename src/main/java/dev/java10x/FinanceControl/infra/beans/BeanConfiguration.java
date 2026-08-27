package dev.java10x.FinanceControl.infra.beans;

import dev.java10x.FinanceControl.core.gateway.AccountGateway;
import dev.java10x.FinanceControl.core.usecases.CreateAccountCase;
import dev.java10x.FinanceControl.core.usecases.CreateAccountCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreateAccountCase createAccountCase(AccountGateway accountGateway) {
        return new CreateAccountCaseImpl(accountGateway);
    }
}
