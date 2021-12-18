package com.example.productapi.controllers;

import com.example.productapi.models.Product;
import com.example.productapi.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @PostMapping("/product/add")

    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        Product newProduct = productService.addProduct(product);
        return new ResponseEntity<>(newProduct,HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAllProducts(){
        List<Product> products = productService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Long id){
        Product product = productService.getProduct(id);
        return new ResponseEntity<>(product,HttpStatus.OK);
    }

    @PutMapping("/product/{id}")
    public ResponseEntity<?> updateProduct(@RequestBody Product product){
        Product updatedproduct = productService.updateProduct(product);
        return new ResponseEntity<>(updatedproduct,HttpStatus.OK);
    }

    @DeleteMapping("/product/{id}")

    public ResponseEntity<?> deleteProduct(@PathVariable("id") Long id){
        Product deletedProduct = productService.deleteProduct(id);
        return new ResponseEntity<>(deletedProduct,HttpStatus.OK);
    }

}
