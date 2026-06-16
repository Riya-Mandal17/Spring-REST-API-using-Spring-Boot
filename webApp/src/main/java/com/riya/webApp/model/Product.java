package com.riya.webApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Product {
    private int proId;
    private String proName;
    private int price;

    public Product(){

    }

}
