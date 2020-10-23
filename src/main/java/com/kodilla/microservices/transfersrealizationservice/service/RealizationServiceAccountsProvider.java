package com.kodilla.microservices.transfersrealizationservice.service;

import com.kodilla.microservices.commons.AccountsUpdate;

public interface RealizationServiceAccountsProvider {
    void updateAccounts(AccountsUpdate update);
}
