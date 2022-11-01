package com.example.wanchengdemo.filter;

import cn.hutool.core.text.AntPathMatcher;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "LoginCheckFilter", urlPatterns = "/*")
@Slf4j
public class LoginCheckFilter implements Filter {
    //路径匹配器,支持通配，
    public static final AntPathMatcher PATH_MATCHER = new AntPathMatcher();

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        log.info("拦截到请求： {}", request.getRequestURI());

        // 1.获取url
        String requestURI = request.getRequestURI();
        // 2.判断是否须要拦截

          //.无须拦截路径
        String[] urls = new String[]{
                "/user/login"
        };

        boolean check = check(urls, requestURI);
            //无须处理放行，
        if (check){
            filterChain.doFilter(request,response);
            return;
        }
        // 3.判断登录状态,从redis中比对token,




        // 4.返回登录结果

        filterChain.doFilter(request,response);
    }


    //检查本次请求是否须要放行
    public boolean check(String[] urls, String requestURI){
        for (String url : urls) {
            boolean match = PATH_MATCHER.match(url, requestURI);
            if (match == true){
                return true;
            }

        }
        return false;
    }
}
