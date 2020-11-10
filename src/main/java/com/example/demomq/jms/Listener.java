package com.example.demomq.jms;

import com.example.demomq.ODQueueContractConfirm;
import com.example.demomq.QueueDto;
import com.google.gson.Gson;
import org.apache.logging.log4j.EventLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

@Component
public class Listener {
    @Autowired
    private Producer producer;

    @JmsListener(destination = "outbound.queue")
    public void receiveQueueContractConfirm(QueueDto q) {
        System.out.println(q + " queue");
    }
}
