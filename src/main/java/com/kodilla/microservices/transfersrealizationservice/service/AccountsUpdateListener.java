package com.kodilla.microservices.transfersrealizationservice.service;

import com.kodilla.microservices.commons.AccountsUpdateMessage;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Slf4j
@Service
@AllArgsConstructor
public class AccountsUpdateListener {

    private final RealizationServiceAccountsProvider accountsProvider;

    @KafkaListener(topics = "accounts-update")
    public void consume(@Payload AccountsUpdateMessage accountsUpdateMessage) throws IOException {
        log.info("Consumed accounts update message: {}", accountsUpdateMessage.getAccountsUpdate().getValue());

        accountsProvider.updateAccounts(accountsUpdateMessage.getAccountsUpdate());
    }
}
