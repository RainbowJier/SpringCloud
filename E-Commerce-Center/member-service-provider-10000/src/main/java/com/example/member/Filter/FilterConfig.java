package com.example.member.Filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import org.springframework.core.annotation.Order;

import java.io.IOException;

@WebFilter(urlPatterns = "/api/*", filterName = "loginFilter")
@Order(1) // Execution Order.
public class FilterConfig implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("Before request");

        // pass
        chain.doFilter(request, response);
        System.out.println("After request");
    }

    @Override
    public void destroy() {
        // Destroy
    }

}