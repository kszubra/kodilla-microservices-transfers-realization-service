package com.kodilla.microservices.transfersrealizationservice.service;

import com.kodilla.microservices.commons.AccountsUpdate;
import com.kodilla.microservices.transfersrealizationservice.connector.AccountsConnector;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SimpleAccountsProvider implements RealizationServiceAccountsProvider {

    private final AccountsConnector connector;

    @Override
    public void updateAccounts(AccountsUpdate update) {
        connector.updateAccounts(update);
    }
}
