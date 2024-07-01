package com.example.memberservicenacosprovider10006.controller;


import com.example.memberservicenacosprovider10006.annotation.Systemlog;
import com.example.memberservicenacosprovider10006.domain.ResponseResult;
import com.example.memberservicenacosprovider10006.domain.entity.Member;
import com.example.memberservicenacosprovider10006.service.MemberService;
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
@Slf4j
@RestController
@RequestMapping("/member/provider")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/getAllMember")
    @ApiOperation("Get all member Controller")
    @Systemlog(businessName = "getAllMember")
    public ResponseResult<Object> memberQuery() {
        return memberService.memberQuery();
    }

    @ApiOperation("Add a new member Controller")
    @PostMapping("/saveMember")
    @Systemlog(businessName = "saveMember")
    public ResponseResult<Object> saveMember(@RequestBody Member member) {
        return memberService.saveMember(member);
    }

    // example-object?name=John&age=30
    @ApiOperation("Get member By Id.")
    @GetMapping("/get/{id}")
    @Systemlog(businessName = "getMemberById")
    public ResponseResult<Object> getMemberById(@PathVariable(value = "id") Long id) {
        return memberService.getMemberById(id);
    }

}

















