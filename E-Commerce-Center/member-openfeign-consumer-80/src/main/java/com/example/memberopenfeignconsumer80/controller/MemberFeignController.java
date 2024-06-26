package com.example.memberopenfeignconsumer80.controller;

import com.example.memberopenfeignconsumer80.annotation.Systemlog;
import com.example.memberopenfeignconsumer80.domain.ResponseResult;
import com.example.memberopenfeignconsumer80.domain.entity.Member;
import com.example.memberopenfeignconsumer80.service.MemberFeignService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description 👀✔🐱‍🐉❌
 * @Author RainbowJier
 * @Date 2024/6/26
 */


@Api(tags = "Member OpenFeign Controller")
@RestController
@RequestMapping("/member/consumer/openfeign")
public class MemberFeignController {
    @Autowired
    private MemberFeignService memberFeignService;

    @ApiOperation("Get all member Controller")
    @GetMapping("/getAllMember")
    @Systemlog(businessName = "getAllMember")
    public ResponseResult memberQuery() {
        return memberFeignService.memberQuery();
    }

    @ApiOperation("Get member By Id.")
    @GetMapping("/get/{id}")
    @Systemlog(businessName = "Get Member By Id")
    public ResponseResult getMemberById(@PathVariable("id") Long id){
        return memberFeignService.getMemberById(id);
    }

    @ApiOperation("Add a new member Controller")
    @PostMapping("/saveMember")
    @Systemlog(businessName = "saveMember")
    public ResponseResult saveMember(@RequestBody Member member) {
        return memberFeignService.saveMember(member);
    }
}
