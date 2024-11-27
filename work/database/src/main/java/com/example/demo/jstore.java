package com.example.demo;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class jstore {
    @Id public Integer no;
    public String mid;
    public String product;
    public Integer amount;
    @CreationTimestamp public LocalDateTime pdate;
}
