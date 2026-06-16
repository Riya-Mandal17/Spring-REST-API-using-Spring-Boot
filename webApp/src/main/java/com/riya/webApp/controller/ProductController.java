package com.riya.webApp.controller;

import com.riya.webApp.model.Product;
import com.riya.webApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @RequestMapping("/product")
    public List<Product> getProducts(){
      return service.getProduct();
    }
}
