package com.example.member.controller;


import com.example.member.domain.ResponseResult;
import com.example.member.domain.entity.Member;
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
    @GetMapping("/getAllMember")
    public ResponseResult memberQuery() {
        return memberService.memberQuery();
    }

    @ApiOperation("Add a new member Controller")
    @PostMapping("/saveMember")
    public ResponseResult saveMember(@RequestBody MemberPo memberPo) {
        Member member = BeanCopyUtils.copyBean(memberPo, Member.class);
        return memberService.saveMember(member);
    }

    // example-object?name=John&age=30
    @ApiOperation("Get member By Id.")
    @GetMapping("/getMemberById")
    public ResponseResult getMemberById(@RequestParam(value = "id") Long id) {
        return memberService.getMemberById(id);
    }

}

















