package com.kodilla.microservices.transfersrealizationservice.connector;

import com.kodilla.microservices.commons.AccountsUpdate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "accounts", fallback = AccountsConnectorFallback.class)
public interface AccountsConnector {

    @PutMapping("/v1/accounts/account-update")
    void updateAccounts(@RequestBody AccountsUpdate update);
}

@Slf4j
@Component
class AccountsConnectorFallback implements AccountsConnector {
    @Override
    public void updateAccounts(AccountsUpdate update){
        log.warn("Fallback: no connection to accounts server");
    }
}
