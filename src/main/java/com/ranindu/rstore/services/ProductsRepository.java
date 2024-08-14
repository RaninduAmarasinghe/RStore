package com.ranindu.rstore.services;

import com.ranindu.rstore.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
