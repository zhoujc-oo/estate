package com.zhoujc.dao;


import com.zhoujc.domain.Community;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;



/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
@Repository
public interface CommunityMapper extends BaseMapper<Community> {
}
