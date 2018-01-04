#二、springboot开发web应用
##1、静态资源访问
###默认配置
- /static
- /public
- /resources
- /META-INF/resources
##2、渲染页面
###模板引擎
模板默认配置路径`src/main/resources/templates`
####1、thymeleaf
1.1添加依赖
```xml
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
```
1.2编写控制器
```java
@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.didispace.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";  
    }

}
```
1.3编写模板文件index.html
```thymeleafexpressions
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8" />
    <title></title>
</head>
<body>
<h1 th:text="${host}">Hello World</h1>
</body>
</html>
```
####2、thymeleaf参数配置
```properties
# Enable template caching.
spring.thymeleaf.cache=true 
# Check that the templates location exists.
spring.thymeleaf.check-template-location=true 
# Content-Type value.
spring.thymeleaf.content-type=text/html 
# Enable MVC Thymeleaf view resolution.
spring.thymeleaf.enabled=true 
# Template encoding.
spring.thymeleaf.encoding=UTF-8
# Comma-separated list of view names that should be excluded from resolution.
spring.thymeleaf.excluded-view-names= 
#Template mode to be applied to templates. See also StandardTemplateModeHandlers.
spring.thymeleaf.mode=HTML5
# Prefix that gets prepended to view names when building a URL.
spring.thymeleaf.prefix=classpath:/templates/ 
# Suffix that gets appended to view names when building a URL.
spring.thymeleaf.suffix=.html
spring.thymeleaf.template-resolver-order= 
# Order of the template resolver in the chain. spring.thymeleaf.view-names=
# Comma-separated list of view names that can be resolved.
```


