package com.msj.springcloud.mapper;

import com.msj.springcloud.entities.Product;

import java.util.List;

/**
 * @Auther: msj
 */
//@Mapper //或者在启动类上标识 @MapperScan
public interface ProductMapper {

    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}
