package com.riya.webApp.controller;

import com.riya.webApp.model.Product;
import com.riya.webApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/product")
    public List<Product> getProducts(){
      return service.getProduct();
    }

//    fatching data by one id
    @GetMapping("/product/{proId}")
    public Product getProId(@PathVariable int proId){
        return  service.getProId(proId);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product prod){
        service.addPro(prod);
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Product pro){
        service.upatePro(pro);
    }
}
