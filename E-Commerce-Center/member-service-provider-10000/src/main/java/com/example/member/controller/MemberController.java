package com.example.member.controller;


import com.example.member.annotation.Systemlog;
import com.example.member.domain.ResponseResult;
import com.example.member.domain.entity.Member;
import com.example.member.service.MemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author RainbowJier
 * @since 2024-06-11
 */
@Api(tags = "Member Controller")
@RestController
@RequestMapping("/member")
@Slf4j
public class MemberController {
    @Autowired
    private MemberService memberService;

    @ApiOperation("Get all member Controller")
    @GetMapping("/getAllMember")
    @Systemlog(businessName = "getAllMember")
    public ResponseResult memberQuery() {
        return memberService.memberQuery();
    }

    @ApiOperation("Add a new member Controller")
    @PostMapping("/saveMember")
    @Systemlog(businessName = "saveMember")
    public ResponseResult saveMember(@RequestBody Member member) {
        return memberService.saveMember(member);
    }

    // example-object?name=John&age=30
    @ApiOperation("Get member By Id.")
    @GetMapping("/get/{id}")
    @Systemlog(businessName = "getMemberById")
    public ResponseResult getMemberById(@PathVariable(value = "id") Long id) {
        return memberService.getMemberById(id);
    }

}

















