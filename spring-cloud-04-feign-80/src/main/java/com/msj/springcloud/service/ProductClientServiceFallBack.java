package com.msj.springcloud.service;

import com.msj.springcloud.entities.Product;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: msj
 * 客户端服务熔断,备用方法
 */
//@Component //不要少了
//public class ProductClientServiceFallBack implements ProductClientService {
//    @Override
//    public Product get(Long id) {
//        return new Product(id, "id="+ id + "无数据--feign&hystrix", "无有效数据库");
//    }
//    @Override
//    public List<Product> list() {
//        return null;
//    }
//    @Override
//    public boolean add(Product product) {
//        return false;
//    }
//}
