package com.example.member.controller;


import com.example.member.domain.entity.Member;
import com.example.member.domain.entity.ResponseResult;
import com.example.member.domain.po.MemberPo;
import com.example.member.service.MemberService;
import com.example.member.utils.BeanCopyUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author RainbowJier
 * @since 2024-06-11
 */
@Api(tags = "Member Controller")
@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @ApiOperation("Get all member Controller")
    @GetMapping("/get")
    public ResponseResult memberQuery() {
        return memberService.memberQuery();
    }

    @ApiOperation("Add a new member Controller")
    @PostMapping("/save")
    public ResponseResult saveMember(@RequestBody MemberPo memberPo) {
        Member member = BeanCopyUtils.copyBean(memberPo, Member.class);
        return memberService.saveMember(member);
    }
}

















