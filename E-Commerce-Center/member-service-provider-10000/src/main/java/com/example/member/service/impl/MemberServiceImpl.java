package com.example.member.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.member.domain.entity.Member;
import com.example.member.domain.entity.ResponseResult;
import com.example.member.domain.vo.MemberVo;
import com.example.member.mapper.MemberMapper;
import com.example.member.service.MemberService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author RainbowJier
 * @since 2024-06-11
 */
@Service
public class MemberServiceImpl implements MemberService {
    private static final Logger logger = LogManager.getLogger(MemberServiceImpl.class);
    @Autowired
    private MemberMapper memberMapper;

    @Override
    public ResponseResult memberQuery() {
        try {
            QueryWrapper<Member> wrapper = new QueryWrapper<>();
            List<Member> members = memberMapper.selectList(wrapper);
            // Copy members to memberVos list.
            List<MemberVo> memberVos = BeanUtil.copyToList(members, MemberVo.class);
            // Encapsulate response result.
            ResponseResult<List> result = new ResponseResult<>(200, "SUCCESSFULLY", memberVos);
            return result;
        } catch (Exception e) {
            logger.error("Query member error");
            return new ResponseResult<>(500, "ERROR", null);
        }
    }

    @Override
    @Transactional
    public ResponseResult saveMember(Member member) {

        LambdaQueryWrapper<Member> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Member::getName, member.getName());

        // Check if the member have already existed.
        boolean exists = memberMapper.exists(wrapper);
        if (exists) {
            return new ResponseResult<>(400, "Member are already existed.", null);
        }

        try {
            int insert = memberMapper.insert(member);
            if (insert <= 0) { // 这里修改为<=0，以处理插入失败的情况
                throw new Exception("Failed to save member.");
            }
        } catch (Exception se) { // 自定义异常，用于业务逻辑错误
            logger.error("Failed to save member: {}", se.getMessage());
            return new ResponseResult<>(500, "Internal Server Error: " + se.getMessage(), null);
        }

        // Return the result.
        return new ResponseResult<>(200, "Save Successfully.", member);
    }

}

