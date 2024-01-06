package com.d2holygrailbe.d2holygrail.entity;

import jakarta.persistence.Id;

import java.time.LocalDateTime;

@jakarta.persistence.Entity
public class Item1 {

    @Id
    private LocalDateTime time;

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String value;

}
