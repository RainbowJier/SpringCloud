package com.example.member;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.member.entity.Member;
import com.example.member.mapper.MemberMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MemberApplicationTests {

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
