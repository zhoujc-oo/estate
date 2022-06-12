package com.zhoujc.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhoujc.domain.Community;
import org.apache.catalina.User;

import java.util.List;
import java.util.Map;

/**
 * 设置接口
 * @Author zhoujc
 * @Date 2022/2/26
 */
public interface CommunityService {

     boolean findAll(Community community);

//     Page<Community> search(Map searchMap);

     IPage<Community> search(int currentPage, int pageSize);
}
