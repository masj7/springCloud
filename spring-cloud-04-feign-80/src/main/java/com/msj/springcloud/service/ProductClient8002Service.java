package com.msj.springcloud.service;

import com.msj.springcloud.entities.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Auther: msj
 */
//@FeignClient(value = "microservice-product",fallback = ProductClientServiceFallBack.class) //指定调用的微服务名称,客户端服务熔断
@FeignClient(value = "microservice-product-8002") //指定调用的微服务名称
public interface ProductClient8002Service {

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    boolean add(@RequestBody Product product);

    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    Product get(@PathVariable("id") Long id);

    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    List<Product> list();

}
