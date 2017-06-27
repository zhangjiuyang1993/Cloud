package com.bjtu.cloud.interceptor;

import com.bjtu.cloud.user.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Interceptor implements HandlerInterceptor {

    //preHandle在处理器映射器之前进行执行
    //return false:拦截
    //return true :放行
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            request.getRequestDispatcher("/WEB-INF/jsp/admin/login.jsp").forward(request, response);
            return false;
        } else
            return true;
    }


    //还没有调用Controller，还没返回modelAndView执行
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
            throws Exception {

    }

    //返回modelAndView之后执行
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {

    }

}
