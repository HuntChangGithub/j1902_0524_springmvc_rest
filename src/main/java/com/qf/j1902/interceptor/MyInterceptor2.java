package com.qf.j1902.interceptor;


import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jeffrey on 2019/5/24.
 */
public class MyInterceptor2 implements HandlerInterceptor{
//   在进入控制器方法前被触发，若果返回true，则继续执行，否则终止方法访问
    @Override
    public boolean preHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler) throws Exception {
        String requestURI = request.getRequestURI();//获取请求路径
        System.out.println("2您访问的路径："+requestURI);
        return true;
    }

//    执行完方法之后，触发
    @Override
    public void postHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("2方法执行完。。。");
    }
//  视图解析完后出发
    @Override
    public void afterCompletion(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("2after方法执行完。。。");
    }
}
