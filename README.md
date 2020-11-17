需求背景
Springboot集成：Swagger集成用法，本篇介绍Swagger2

问题痛点
手写api文档的几个痛点：

当接口文档需要更新时，需要再次发送一次给前端，文档更新交流不是非常及时，比如showdoc
不能直接在线测试接口，通常需要使用其他工具，比如postman
接口文档太多，不好管理
Swagger就是用来解决这个问题（Swagger也不是说就最好，比如不好的点就是代码侵入性比较强）


http://localhost:9090/swagger-ui.html