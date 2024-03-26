package com.landingpage.crudmongoback.CRUD.controller;

import com.landingpage.crudmongoback.CRUD.entity.Product;
import com.landingpage.crudmongoback.CRUD.service.ProductService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ObjectId save(@RequestBody Product product){
        return productService.save(product);
    }

    @GetMapping
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ObjectId _id){
        productService.delete(_id);
    }
}