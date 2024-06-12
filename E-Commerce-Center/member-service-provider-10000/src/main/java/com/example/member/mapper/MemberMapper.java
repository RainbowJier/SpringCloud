package com.example.member.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.member.domain.entity.Member;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author RainbowJier
 * @since 2024-06-11
 */
@Mapper
public interface MemberMapper extends BaseMapper<Member> {

}
