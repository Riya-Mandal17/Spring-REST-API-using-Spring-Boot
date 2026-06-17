package com.riya.webApp.service;

import com.riya.webApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101,"Chocolate",500),
            new Product(102,"Chips",500)));
    public List<Product> getProduct(){
        return products;
    }

    public Product getProId(int proId){
        return products.stream()
                .filter(pro -> pro.getProId() == proId)
                .findFirst().get();

    }

    public void addPro(Product pro){
        products.add(pro);
    }

    public void upatePro(Product pro) {
        int index = 0;
        for(int i =0;i<products.size() ;i++)
            if(products.get(i).getProId() == pro.getProId())
                index = i;

        products.set(index, pro);
    }
}
