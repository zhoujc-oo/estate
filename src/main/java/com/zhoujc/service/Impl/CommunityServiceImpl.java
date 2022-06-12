package com.zhoujc.service.Impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhoujc.dao.CommunityMapper;
import com.zhoujc.domain.Community;
import com.zhoujc.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
@Service
public class CommunityServiceImpl implements CommunityService {

    @Autowired
    private CommunityMapper communityMapper;

    public boolean findAll(Community community) {
        return communityMapper.insert(community) > 0;
    }

    @Override
    public IPage<Community> search(int currentPage, int pageSize) {
        IPage page = new Page(currentPage, pageSize);
        communityMapper.selectPage(page, null);
        return page;
    }


//    @Override
//    public Page<Community> search(int currentPage, int pageSize, Community community) {
//            LambdaQueryWrapper<Community> lqw = new LambdaQueryWrapper<User>();
//            lqw.like(Strings.isNotEmpty(user.getName()),User :: getName,user.getName());
//            lqw.like(Strings.isNotEmpty(user.getUrl()),User :: getUrl,user.getUrl());
//            lqw.like(Strings.isNotEmpty(user.getAlexa()),User :: getAlexa,user.getAlexa());
//            Page page = new Page(currentPage,pageSize);
//            userDao.selectPage(page,lqw);
//            return page;
//        }
//    }
//        Example example = new Example(Community.class);
//        int pageNum = 1;
//        int pageSize = 2;
//        if (searchMap != null) {
//            Example.Criteria criteria = example.createCriteria();
//            if (StringUtil.isNotEmpty((String) searchMap.get("startTime"))) {
//                criteria.andGreaterThanOrEqualTo("createTime", searchMap.get("startTime"));
//            }
//            if (StringUtil.isNotEmpty((String) searchMap.get("endTime"))) {
//                criteria.andLessThanOrEqualTo("createTime", searchMap.get("endTime"));
//            }
//            if (StringUtil.isNotEmpty((String) searchMap.get("name"))) {
//                criteria.andLike("name", "%"+(String) searchMap.get("name") + "%");
//            }
//            if (StringUtil.isNotEmpty((String) searchMap.get("pageNum"))) {
//                pageNum = Integer.parseInt((String) searchMap.get("pageNum"));
//            }
//            if (StringUtil.isNotEmpty((String) searchMap.get("pageSize"))) {
//                pageSize = Integer.parseInt((String) searchMap.get("pageSize"));
//            }
//        }
//        /**
//         * 使用PageHelper插件完成分页
//         */
//        PageHelper.startPage(pageNum, pageSize);
//        Page<Community> communities = (Page<Community>) communityMapper.selectByExample(example);
//        return communities;
//    }
}
