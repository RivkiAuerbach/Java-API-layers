package com.example.webapiweb.repositories;

import com.example.webapiweb.entities.product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<product, Integer> {
}
