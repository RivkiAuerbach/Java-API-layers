package com.example.webapiweb.entities;

import java.util.ArrayList;
import java.util.List;

public class tempdb {
    public static List<product> productsList=new ArrayList<product>();
    static{
        productsList.add(new product(3,"milk",12.5));
        productsList.add(new product(10,"sugar",50.5));
        productsList.add(new product(12,"oil",30.0));
        productsList.add(new product(4,"meet",78));
    }
}

