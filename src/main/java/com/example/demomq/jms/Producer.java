package com.example.demomq.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {
    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessage(String queueName, Object message) {
        final String textMessage = "Chào nhé " + message;
        System.out.println("Gửi tin nhắn " + textMessage + " đến queue - " + queueName);
        jmsTemplate.convertAndSend(queueName, message);
    }
}
