package com.example.member;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.member.domain.entity.Member;
import com.example.member.mapper.MemberMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
<<<<<<<< HEAD:E-Commerce-Center/member-service-provider-10000/src/test/java/com/example/member/MemberServiceProvider10000ApplicationTests.java
class MemberServiceProvider10000ApplicationTests {
========
class Member10000ApplicationTests {
>>>>>>>> origin/main:E-Commerce-Center/member-service-provider-10000/src/test/java/com/example/member/Member10000ApplicationTests.java

    @Autowired
    private MemberMapper memberMapper;

    @Test
    void contextLoads() {
        //Create wrapper
        QueryWrapper<Member> wrapper = new QueryWrapper<>();

        List<Member> members = memberMapper.selectList(wrapper);
        members.forEach(System.out::println);

    }
}
