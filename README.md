# 说明

本demo模拟了两个初始化耗时比较长(sleep 20秒)，分别测试不使用异步bean加载和使用异步bean加载下应用的启动时长

# 1. 正常启动(不使用异步bean加载)

启动时长为41s

![](./docs/no-async-bean.png)

# 2. 异步bean加载

1. 引入异步bean加载的starter包

```xml
<dependency>
    <groupId>io.github.linyimin0812</groupId>
    <artifactId>spring-async-bean-starter</artifactId>
    <version>2.0.7</version>
</dependency>
```

2. application.properties文件中配置异步加载的bean

```properties
server.port=7002
spring-startup-analyzer.boost.spring.async.bean-priority-load-enable=true
spring-startup-analyzer.boost.spring.async.bean-names=testBean,testComponent,testBeanXml
```

启动时长为20s

![](./docs/async-bean.png)
