package com.example.memberservicenacosprovider10006.service;

import com.example.memberservicenacosprovider10006.domain.ResponseResult;
import com.example.memberservicenacosprovider10006.domain.entity.Member;
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
    ResponseResult<Object> memberQuery();

    ResponseResult<Object> saveMember(Member member);

    ResponseResult<Object> getMemberById(Long id);
}
