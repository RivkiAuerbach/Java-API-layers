package com.example.webapiweb.service;

import com.example.webapiweb.entities.product;
import com.example.webapiweb.entities.tempdb;
import com.example.webapiweb.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import com.example.webapiweb.repositories.ProductRepository2;
import java.util.List;
@Service
public class productService {

@Autowired
    ProductRepository productRepository;
@Autowired
ProductRepository2 productRepository2;
    public List<product> getProduct(){
        return (List<product>) productRepository.findAll();
    }

    public product getProductById( int id){
        return productRepository.findById(id).get();
    }


public List<product> GetPrice( int min)
{
    return  (List<product>)productRepository2.getProductByPrice(min);
}
    public void addProduct(product p){
        productRepository.save(p);
    }

    public void deleteProduct( int id){

        productRepository.deleteById(id);    }

    public void putProduct( int id,product p){
        productRepository.deleteById(id);
        productRepository.save(p);
    }

}
