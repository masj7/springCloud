package com.msj.springcloud.controller;

import com.msj.springcloud.entities.Product;
import com.msj.springcloud.service.ProductClient8001Service;
import com.msj.springcloud.service.ProductClient8003Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: msj
 */
@RequestMapping("three")
@RestController
public class ProductController_Feign_8003 {

    @Autowired
    ProductClient8003Service service;

    @RequestMapping(value = "/consumer/product/add")
    public boolean add(Product product) {
        return service.add(product);
    }

    @RequestMapping(value = "/consumer/product/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @RequestMapping(value = "/consumer/product/list")
    public List<Product> list() {
        return service.list();
    }



}
