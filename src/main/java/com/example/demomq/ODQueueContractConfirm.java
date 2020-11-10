package com.example.demomq;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@ToString()
public class ODQueueContractConfirm {
    public ODQueueContractConfirm(String ctrNo) {
        this.ctrNo = ctrNo;
        this.retry = 0;
        this.remark = null;
        this.updateDt = new Date();
    }

    private String ctrNo;
    private int retry;
    private String remark;
    private Date updateDt;
}
