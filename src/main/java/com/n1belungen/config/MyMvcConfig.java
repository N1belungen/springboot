package com.n1belungen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *  自定义Mvc配置
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");

        registry.addViewController("/main.html").setViewName("dashboard");
    }

    //自定义 国际化地区解析器配置到 Spring容器 中
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }

    /**
     * addPathPatterns -- 需要拦截的路径
     * 拦截所有页面
     * excludePathPatterns -- 需要放行的路径
     * 放行登录页面 登录请求 静态资源
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/index.html" , "/" , "/login" , "" ,"/css/**" , "/js/**" , "/img/**");
    }
}
