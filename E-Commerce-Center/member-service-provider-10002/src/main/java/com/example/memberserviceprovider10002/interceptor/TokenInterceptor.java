package com.example.memberserviceprovider10002.interceptor;

import com.example.memberserviceprovider10002.utils.JwtUtil;
import io.jsonwebtoken.Claims;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Component
public class TokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // Get token.
        String token = request.getHeader("token");

        // Check if token exists.
        if (!StringUtils.hasText(token)) {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
            return false;
        }

        // Parse token.
        String userId;
        try {
            Claims claims = JwtUtil.parseJWT(token);
            // String userId = claims.getSubject();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}