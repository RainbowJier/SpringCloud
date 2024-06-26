package com.example.memberopenfeignconsumer80.service;

import com.example.memberopenfeignconsumer80.annotation.Systemlog;
import com.example.memberopenfeignconsumer80.domain.ResponseResult;
import com.example.memberopenfeignconsumer80.domain.entity.Member;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Description 👀✔🐱‍🐉❌
 * @Author RainbowJier
 * @Date 2024/6/26
 */

@Component
// value 是 provider 注册在 Eureka 的服务名。
// 使用OpenFeign来调用名为 MEMBER-SERVICE-PROVIDER 的远程服务。
@FeignClient(value = "MEMBER-SERVICE-PROVIDER")
public interface MemberFeignService {

    /**
     * 1. 远程调用的 url 为 http://MEMBER-SERVICE-PROVIDER/member/consumer/get/{id}
     * 2. MEMBER-SERVICE-PROVIDER 是注册中心服务 member-service-provider:10000/10002
     * 3. 会根据 OpenFeign 的负载均衡算法来决定是调用 10000 还是10002
     */

    @GetMapping("/member/provider/getAllMember")
    ResponseResult memberQuery();

    @PostMapping("/member/provider/saveMember")
    ResponseResult saveMember(@RequestBody Member member);


    @GetMapping("/member/provider/get/{id}")
    ResponseResult getMemberById(@PathVariable(value = "id") Long id);
}
