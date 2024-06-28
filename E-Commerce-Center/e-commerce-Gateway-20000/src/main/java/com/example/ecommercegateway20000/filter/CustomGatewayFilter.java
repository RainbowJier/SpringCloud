package com.example.ecommercegateway20000.filter;

/**
 * @Description 👀✔🐱‍🐉❌
 * @Author RainbowJier
 * @Date 2024/6/28
 */
//@Configuration
//public class CustomGatewayFilter implements GlobalFilter, Ordered {
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        System.out.println("==========CustomGateWayFilter===========");
//
//        // 请求地址：http://localhost:20000/member/provider/get/1?user=rainbow&pwd=123456
//        // 获取 "user" 的值
//        String uname = exchange.getRequest().getQueryParams().getFirst("user");
//        String pwd = exchange.getRequest().getQueryParams().getFirst("pwd");
//
//        if (!("rainbow".equals(uname) && "123456".equals(pwd))) {
//            System.out.println("=========非法用户=============");
//            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
//            return exchange.getResponse().setComplete();
//        }
//
//        //验证通过，放行
//        return chain.filter(exchange);
//    }
//
//    @Override
//    public int getOrder() {
//        return 0;
//    }
//}
