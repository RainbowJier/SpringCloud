package com.example.member.service;

import com.example.member.domain.ResponseResult;
import com.example.member.domain.entity.Member;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author RainbowJier
 * @since 2024-06-11
 */

@Service
public interface MemberService {
    ResponseResult memberQuery();

    ResponseResult saveMember(Member member);

    ResponseResult getMemberById(Long id);
}
