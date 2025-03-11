package com.ecommerce.ecommerceapplication.service;
// service to handel business logic

import com.ecommerce.ecommerceapplication.model.Product;
import com.ecommerce.ecommerceapplication.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Tells spring to treat this as service component
public class ProductService {
    @Autowired //Automatically injects the ProductRepository dependency
    private ProductRepository productRepository;

    //get all products from the database
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    //get single product by its ID
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
   //Add a new product
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
    //Delete a product
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
