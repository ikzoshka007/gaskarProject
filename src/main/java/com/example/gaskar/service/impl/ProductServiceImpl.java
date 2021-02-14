package com.example.gaskar.service.impl;

import com.example.gaskar.core.abstraction.CrudServiceAbstract;
import com.example.gaskar.model.Product;
import com.example.gaskar.repository.ProductRepository;
import com.example.gaskar.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl extends CrudServiceAbstract<Product> implements ProductService {

  private final ProductRepository productRepository;

  @Override
  public JpaRepository<Product, Long> getRepository() {

    return productRepository;
  }
}
