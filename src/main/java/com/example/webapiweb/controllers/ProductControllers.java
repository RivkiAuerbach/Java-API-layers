package com.example.webapiweb.controllers;

import com.example.webapiweb.entities.product;
import com.example.webapiweb.entities.tempdb;
import com.example.webapiweb.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductControllers {

    @Autowired
    productService product;

    @GetMapping
    public List<product> getProduct(){
        return product.getProduct();
    }
    @GetMapping("/{id}")
    public product getProductById(@PathVariable int id){
        return product.getProductById(id);
    }

//    @GetMapping("/{price}")
//    public List<product> getProductByPrice(@PathVariable int price){
//          return product.getProductByPrice(price);
//    }

    @PostMapping
    public void addProduct(@RequestBody product p){
        product.addProduct(p);
    }

    @DeleteMapping
    public void deleteProduct(@PathVariable int id){
        product.deleteProduct(id);
    }
    @PutMapping
    public void putProduct(@PathVariable int id,@RequestBody product p){
        product.putProduct(id,p);
    }


}

