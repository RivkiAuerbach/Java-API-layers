package com.example.webapiweb.repositories;

import com.example.webapiweb.entities.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository2 {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<product> getProductByPrice(int minPrice ){
        String productPrice = "select * from product where price>'"+minPrice+"'";
        List<Map<String, Object>> rowsInDB = jdbcTemplate.queryForList(productPrice);
        List<product> products = new ArrayList<>();
        for (Map<String,Object > productRow: rowsInDB) {
            product p = new product((int)productRow.get("id"), (String)productRow.get("name"),(int)productRow.get("price"));
            products.add(p);
        }

        System.out.println(products);
        return products;
    }

}
