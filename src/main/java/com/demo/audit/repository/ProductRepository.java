package com.demo.audit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.audit.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
