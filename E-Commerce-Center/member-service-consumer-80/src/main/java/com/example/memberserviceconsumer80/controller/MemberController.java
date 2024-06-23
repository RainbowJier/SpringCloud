package com.example.memberserviceconsumer80.controller;


import com.example.memberserviceconsumer80.annotation.Systemlog;
import com.example.memberserviceconsumer80.domain.ResponseResult;
import com.example.memberserviceconsumer80.domain.entity.Member;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author RainbowJier
 * @since 2024-06-11
 */
@Api(tags = "Member Controller")
@RestController
@RequestMapping("/member/consumer")
@Slf4j
public class MemberController {

    public static final String MEMBER_SERVICE_PROVIDER_URL = "http://localhost:10000";

    @Autowired
    private RestTemplate restTemplate;

    @ApiOperation("Get all member Controller")
    @GetMapping("/getAllMember")
    @Systemlog(businessName = "getAllMember")
    public ResponseResult memberQuery() {
        ResponseResult responseResult = restTemplate.getForObject(MEMBER_SERVICE_PROVIDER_URL + "/member/getAllMember", ResponseResult.class);

        return responseResult;
    }

    @ApiOperation("Add a new member Controller")
    @PostMapping("/saveMember")
    @Systemlog(businessName = "saveMember")
    public ResponseResult saveMember(@RequestBody Member member) {
        ResponseResult responseResult = restTemplate.postForEntity(MEMBER_SERVICE_PROVIDER_URL + "/member/saveMember", member, ResponseResult.class).getBody();
        return responseResult;
    }
    

    @ApiOperation("Get member By Id.")
    @GetMapping("/get/{id}")
    @Systemlog(businessName = "Get Member By Id")
    public ResponseResult getMemberById(@PathVariable(value = "id") Long id) {
        ResponseResult responseResult = restTemplate.getForObject(MEMBER_SERVICE_PROVIDER_URL + "/member/get/" + id, ResponseResult.class);
        return responseResult;
    }
}

















