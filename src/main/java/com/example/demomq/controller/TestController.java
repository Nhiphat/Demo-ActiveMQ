package com.example.demomq.controller;

import com.example.demomq.ODQueueContractConfirm;
import com.example.demomq.QueueDto;
import com.example.demomq.jms.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {
    @Autowired
    Producer producer;
    @GetMapping(value = "/test")
    public void sendQ(){
        QueueDto queueDto = QueueDto.builder().age("24").name("phat").build();
        ODQueueContractConfirm odQueueContractConfirm = new ODQueueContractConfirm();
        odQueueContractConfirm.setCtrNo("1");
        odQueueContractConfirm.setRemark("remark");
        odQueueContractConfirm.setRetry(1);
        odQueueContractConfirm.setUpdateDt(new Date());

        producer.sendMessage("outbound.queue", queueDto);
    }

}
