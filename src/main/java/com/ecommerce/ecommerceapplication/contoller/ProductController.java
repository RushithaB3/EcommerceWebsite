package com.ecommerce.ecommerceapplication.contoller;


import com.ecommerce.ecommerceapplication.model.Product;
import com.ecommerce.ecommerceapplication.repository.ProductRepository;
import com.ecommerce.ecommerceapplication.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController  //Tells Spring that this is a REST Controller
@RequestMapping("/api/products") //All requests here will start with "api/products"
public class ProductController {

    @Autowired //Injects the ProductService
    private ProductRepository productRepository;
    @Autowired
    private ProductService productService;

    //get list of all products
    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    //get single product by its ID
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    //Add a new product
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    //Delete a product by its ID
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

}
