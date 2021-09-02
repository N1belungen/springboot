package com.n1belungen.config;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * 自定义 国际化地区解析器
 */

public class MyLocaleResolver implements LocaleResolver {
    @Override
    // 解析请求
    public Locale resolveLocale(HttpServletRequest request) {
        //获取请求中的 参数链接
        String language = request.getParameter("language");

        //获取默认语言 如果没有获取到语言使用 默认语言
        Locale locale = Locale.getDefault();

        //获取到的 语言参数 不为空 使用请求中携带的 语言参数
        if (!StringUtils.isEmpty(language)){
            //zh_CN(语言_地区)
            String[] split = language.split("_");
            locale = new Locale(split[0], split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
