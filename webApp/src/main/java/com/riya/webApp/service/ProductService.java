package com.riya.webApp.service;

import com.riya.webApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = Arrays.asList(new Product(101,"Chocolate",500),new Product(102,"Chips",500));
    public List<Product> getProduct(){
        return products;
    }

    public Product getProId(int proId){
        return products.stream()
                .filter(pro -> pro.getProId() == proId)
                .findFirst().get();

    }

}
