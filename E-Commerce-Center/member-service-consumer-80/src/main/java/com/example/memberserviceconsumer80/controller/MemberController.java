package com.example.memberserviceconsumer80.controller;


import com.example.memberserviceconsumer80.annotation.Systemlog;
import com.example.memberserviceconsumer80.domain.ResponseResult;
import com.example.memberserviceconsumer80.domain.entity.Member;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author RainbowJier
 * @since 2024-06-11
 */
@Api(tags = "Member Controller")
@RestController
@RequestMapping("/member/consumer")
@Slf4j
public class MemberController {

    //public static final String MEMBER_SERVICE_PROVIDER_URL = "http://localhost:10000";
    //
    public static final String MEMBER_SERVICE_PROVIDER_URL = "http://MEMBER-SERVICE-PROVIDER";

    @Autowired
    private RestTemplate restTemplate;

    // DiscoveryClient
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/discoveryClient")
    public ResponseResult getEurekaServerInfo() {
        // 通过discoveryClient获取所有服务的名称列表
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            // 获取所有服务实例的列表，以便进一步处理或选择特定的服务实例
            List<ServiceInstance> instances = discoveryClient.getInstances(service);
            for (ServiceInstance instance : instances) {
                // 获取服务实例的URI、主机名、端口号等详细信息
                String instanceId = instance.getInstanceId();
                String uri = instance.getUri().toString();
                String host = instance.getHost();
                int port = instance.getPort();
                // ...
            }
        }

        return ResponseResult.ok(services);
    }

    @ApiOperation("Get all member Controller")
    @GetMapping("/getAllMember")
    @Systemlog(businessName = "getAllMember")
    public ResponseResult memberQuery() {
        ResponseResult responseResult = restTemplate.getForObject(MEMBER_SERVICE_PROVIDER_URL + "/member/provider/getAllMember", ResponseResult.class);

        return responseResult;
    }

    @ApiOperation("Add a new member Controller")
    @PostMapping("/saveMember")
    @Systemlog(businessName = "saveMember")
    public ResponseResult saveMember(@RequestBody Member member) {
        ResponseResult responseResult = restTemplate.postForEntity(MEMBER_SERVICE_PROVIDER_URL + "/member/provider/saveMember", member, ResponseResult.class).getBody();
        return responseResult;
    }


    @ApiOperation("Get member By Id.")
    @GetMapping("/get/{id}")
    @Systemlog(businessName = "Get Member By Id")
    public ResponseResult getMemberById(@PathVariable(value = "id") Long id) {
        ResponseResult responseResult = restTemplate.getForObject(MEMBER_SERVICE_PROVIDER_URL + "/member/provider/get/" + id, ResponseResult.class);
        return responseResult;
    }
}

















