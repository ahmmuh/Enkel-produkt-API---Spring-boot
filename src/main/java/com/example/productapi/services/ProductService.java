package com.example.productapi.services;

import com.example.productapi.ProductRepo;
import com.example.productapi.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }

    public Product getProduct(Long id){
       return productRepo.getById(id);
    }

    public Product addProduct(Product product){
        productRepo.save(product);
        return product;
    }


    public Product updateProduct(Product product){
        productRepo.save(product);
        return product;
    }
    public Product deleteProduct(Long id){
        productRepo.deleteById(id);
        return null;
    }
}
