

## 1、**Spring Cloud 项目搭建**

| 微服务技术维度      | 技术实现                                                     |
| ------------------- | ------------------------------------------------------------ |
| 服务开发            | Spring Boot                                                  |
| 服务注册与发现      | Eureka                                                       |
| 服务调用            | Feign                                                        |
| 负载均衡            | Feign（Feign 集成了 Ribbon 实现了客户端负载均衡调用）        |
| 服务熔断            | Hystrix、（Feign 是自带断路器的，也就是针对 消费者（客户端）进行服务熔断） |
| 服务监控            | Hystrix-dashboard                                            |
| 服务路由（API网关） | Zuul                                                         |
| 服务配置中心管理    | Spring Cloud Confifig                                        |
| 事件消息总线        | Spring Cloud Bus                                             |
| 消息队列            | RabbitMQ                                                     |
| 全链路追踪          | Zipkin，Brave等                                              |
| 服务部署            | Docker、OpenStack等                                          |
| 数据流处理          | Spring Cloud Stream（Redis,Rabbit,Kafka等发送接收消息）      |

**父工程**：

​	spring-cloud-01-parent

**公共组件服务**：

​	spring-cloud-02-api

**注册与发现**：

​	spring-cloud-03-eureka-6001

​	spring-cloud-03-eureka-6002

**服务调用、负载均衡**：

​	spring-cloud-04-feign-80

**（各个服务上）服务熔断、config**：

​	spring-cloud-05-product-hystrix-8001

​	spring-cloud-05-product-hystrix-8002

​	spring-cloud-05-product-hystrix-8003

​	spring-cloud-05-product-hystrix-8004（与8001同服务名称，实现负载均衡）

**服务监控**：

​	spring-cloud-06-hystrix-dashboard-9001

**服务路由（api网关）**：

​	spring-cloud-07-zuul-7001

**服务配置中心管理**：

​	spring-cloud-08-config-server-5001

​	spring-cloud-08-config-file