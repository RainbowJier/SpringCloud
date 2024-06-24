package com.example.memberserviceprovider10002.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.memberserviceprovider10002.domain.ResponseResult;
import com.example.memberserviceprovider10002.domain.entity.Member;
import com.example.memberserviceprovider10002.domain.vo.MemberVo;
import com.example.memberserviceprovider10002.mapper.MemberMapper;
import com.example.memberserviceprovider10002.service.MemberService;
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
            return ResponseResult.ok("member-service-provider-10002", memberVos);
        } catch (Exception e) {
            return new ResponseResult<>(500, "ERROR", null);
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult saveMember(Member member) {
        try {
            LambdaQueryWrapper<Member> wrapper = new LambdaQueryWrapper<>();
            wrapper.eq(Member::getName, member.getName());

            // Check if the member have already existed.
            boolean exists = memberMapper.exists(wrapper);
            if (exists) {
                return new ResponseResult<>(400, "Member are already existed.", null);
            }

            //Insert member
            int insert = memberMapper.insert(member);
            if (insert <= 0) { // 这里修改为<=0，以处理插入失败的情况
                throw new Exception("Failed to save member.");
            }
        } catch (Exception se) { // 自定义异常，用于业务逻辑错误
            return new ResponseResult<>(500, "Internal Server Error: " + se.getMessage(), null);
        }

        // Return the result.
        return new ResponseResult<>(200, "Save Successfully.", member);
    }

    @Override
    public ResponseResult getMemberById(Long id) {
        try {
            Member member = memberMapper.selectById(id);
            if (member == null) {
                return ResponseResult.error("Member not found.");
            }

            // Encapsulate response result.
            MemberVo memberVo = BeanUtil.copyProperties(member, MemberVo.class);

            return ResponseResult.ok(memberVo);
        } catch (Exception e) {
            return ResponseResult.error("Insert Error");
        }
    }

}

