package com.leandro.desafioanotaai.repositories;

import com.leandro.desafioanotaai.domain.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
