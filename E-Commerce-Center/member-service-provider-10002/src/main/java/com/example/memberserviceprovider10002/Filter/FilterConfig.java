package com.example.memberserviceprovider10002.Filter;

import org.apache.logging.log4j.core.config.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
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