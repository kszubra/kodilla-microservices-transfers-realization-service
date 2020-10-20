package com.kodilla.microservices.transfersrealizationservice.service;

import com.kodilla.microservices.commons.TransferMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Slf4j
@Service
public class TransferListener {

    @KafkaListener(topics = "bank-transfers")
    public void consume(@Payload TransferMessage transferMessage) throws IOException {
        log.info("Consumed transferMessage: from {} to: {} for: {} PLN",
                transferMessage.getTransfer().getSenderAccount(),
                transferMessage.getTransfer().getRecipientAccount(),
                transferMessage.getTransfer().getAmount()
        );

        //TODO Create transaction server and send request to transaction server
        log.info("Simulating transaction creation");
    }

}
