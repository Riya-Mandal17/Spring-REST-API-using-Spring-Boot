package com.riya.webApp.service;

import com.riya.webApp.model.Product;
import com.riya.webApp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;
//    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101,"Chocolate",500),
//            new Product(102,"Chips",500)));
    public List<Product> getProduct(){
        return repo.findAll();
    }

    public Product getProId(int proId){
        return repo.findById(proId).orElse(new Product());

    }

    public void addPro(Product pro){
        repo.save(pro);
    }

    public void upatePro(Product pro) {
        repo.save(pro);
    }

    public void deleteProduct(int proId) {
        repo.deleteById(proId);

    }
}
