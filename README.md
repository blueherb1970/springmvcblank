# SpringMVCBlank

### 开发环境

- IDEA 2019.3.5  
- JDK 1.8  
- apache-maven-3.6.3  
- Tomcat 8.5.38  

### 说明

空白的 Spring MVC 项目模板。涉及：Maven，Spring MVC，FreeMarker，Slf4j日志（Logback），编码Filter，fastjson，lombok 。

实现简单的发送动态请求，携带 请求参数，接收 json 数据。将 Model 数据显示在 FreeMarker 模板页面中。开发时，在控制台打印日志，生产环境中将日志写入日志文件，且按日写入文件。

一、项目是 Maven 项目  
使用 pom.xml 管理依赖。

二、Spring MVC 拦截请求  

三、FreeMarker 作为页面模板    
不使用 .jsp 文件，而是用 .ftl 文件。

四、Slf4j + Logback 管理日志

五、其它  
1. web.xml 中编码 Filter，防止中文乱码；  
2. fastjson 处理 JSON 数据，主要是向前端返回 json 格式数据；  
3. Lombok 自动生成实体类的 Setter, Getter 等，以及 @Slf4j 注解。  