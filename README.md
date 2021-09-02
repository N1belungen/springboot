# springboot
基于springboot的员工管理系统



### 前言

该项目前端基于BootStrap + Thymeleaf，后端主要采用SpringBoot + Mybatis + MySQL 。

项目功能：

- 添加员工信息
- 修改员工信息
- 删除员工信息

### 前端主要依赖

- thymeleaf
- bootstrap

### 后端主要依赖

- springboot
- mybatis
- mysql数据库

### 项目结构介绍

```
│  pom.xml
│  springboot-demo.iml
├─src
   ├─main
   │  ├─java
   │  │  └─com
   │  │      └─n1belungen
   │  │          │  SpringbootDemoApplication.java
   │  │          │
   │  │          ├─config
   │  │          │      DruidConfig.java
   │  │          │      LoginHandlerInterceptor.java
   │  │          │      MyLocaleResolver.java
   │  │          │      MyMvcConfig.java
   │  │          │
   │  │          ├─controller
   │  │          │      AdminController.java 
   │  │          │      EmployeeController.java
   │  │          │
   │  │          ├─entity
   │  │          │      Admin.java
   │  │          │      Department.java
   │  │          │      Employee.java
   │  │          │
   │  │          ├─mapper
   │  │          │      AdminMapper.java
   │  │          │      DepartmentMapper.java
   │  │          │      EmployeeMapper.java
   │  │          │
   │  │          └─service
   │  │                  AdminService.java
   │  │                  AdminServiceImpl.java
   │  │                  DepartmentService.java    
   │  │                  DepartmentServiceImpl.java
   │  │                  EmployeeService.java
   │  │                  EmployeeServiceImpl.java
   │  │
   │  └─resources
   │      │  application.properties
   │      │  application.yaml
   │      │
   │      ├─i18n
   │      │      login.properties
   │      │      login_en_US.properties
   │      │      login_zh_CN.properties
   │      │
   │      ├─mybatis
   │      │  └─mapper
   │      │          AdminMapper.xml 
   │      │          DepartmentMapper.xml
   │      │          EmployeeMapper.xml
   │      │
   │      ├─public
   │      ├─resources
   │      ├─static
   │      │  ├─css
   │      │  │      bootstrap.min.css
   │      │  │      dashboard.css
   │      │  │      signin.css
   │      │  │
   │      │  ├─img
   │      │  │      bootstrap-solid.svg
   │      │  │      favicon.ico
   │      │  │
   │      │  └─js
   │      │          bootstrap.min.js
   │      │          Chart.min.js
   │      │          feather.min.js
   │      │          jquery-3.2.1.slim.min.js
   │      │          popper.min.js
   │      │
   │      └─templates						   // 前端页面目录
   │          │  dashboard.html				// 主页面
   │          │  index.html					// 登录页面
   │          │
   │          ├─commons						   // 公共页面目录
   │          │      commons.html			// 公共页面
   │          │
   │          ├─employee					   // 员工页面目录
   │          │      addEmployee.html		// 增加员工页面
   │          │      editEmployee.html   	// 修改员工页面
   │          │      list.html				// 员工信息页面
   │          │
   │          └─error						   // 错误页面
   │                  404.html				// 404页面
   │
   └─test
       └─java
           └─com
               └─n1belungen
                       SpringbootDemoApplicationTests.java
```

### 数据库结构介绍

admin
