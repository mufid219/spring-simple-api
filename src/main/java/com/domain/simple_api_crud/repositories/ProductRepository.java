package com.domain.simple_api_crud.repositories;

import com.domain.simple_api_crud.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

