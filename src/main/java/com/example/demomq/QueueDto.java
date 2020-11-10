package com.example.demomq;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@ToString
@Builder
@Data
public class QueueDto implements Serializable {
    public QueueDto(String name, String age) {
        this.name = name+"ppp";
        this.age = age+"1";
    }

    private String name;
    private String age;
}
