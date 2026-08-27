package dev.java10x.FinanceControl.infra.presentation;

import dev.java10x.FinanceControl.core.entities.Account;
import dev.java10x.FinanceControl.core.usecases.CreateAccountCase;
import dev.java10x.FinanceControl.infra.dtos.AccountDto;
import dev.java10x.FinanceControl.infra.mapper.AccountDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/")
public class AccountController {

    private final CreateAccountCase createAccountCase;
    private final AccountDtoMapper accountDtoMapper;

    @PostMapping("criarconta")
    public AccountDto criarConta(@RequestBody AccountDto accountDto) {
        Account newAccount = createAccountCase.execute(accountDtoMapper.toEntity(accountDto));
        return accountDtoMapper.toDto(newAccount);
    }

    @GetMapping
    public String listarContas() {
        return "lista de contas";
    }

}
