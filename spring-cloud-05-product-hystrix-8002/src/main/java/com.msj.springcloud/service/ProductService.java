package com.msj.springcloud.service;


import com.msj.springcloud.entities.Product;

import java.util.List;

/**
 * @Auther: msj
 */
public interface ProductService {

    boolean add(Product product);

    Product get(Long id);

    List<Product> list();

}
