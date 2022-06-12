package com.zhoujc.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhoujc.common.PageResult;
import com.zhoujc.common.Result;
import com.zhoujc.domain.Community;
import com.zhoujc.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import static org.apache.ibatis.ognl.DynamicSubscript.all;

/**
 * 小区管理控制层
 * @Author zhoujc
 * @Date 2022/2/26
 */
@RestController
@RequestMapping("/community")
public class CommunityController {

    @Autowired
    private CommunityService communityService;

    @RequestMapping("/find")
    public Result find(){
        return new Result(true,200,"请求成功zhoujc",all);
    }

    @GetMapping("{currentPage}/{pageSize}")
    public PageResult search(@PathVariable int currentPage, @PathVariable int pageSize) {
        IPage<Community> page = communityService.search(currentPage, pageSize);
        //如果当前页码值大于总页码值，那么重新执行查询操作，使用最大页码值作为当前页码值。
        if(currentPage > page.getPages()){
            page = communityService.search((int)page.getPages(),pageSize);
        }
        return new PageResult(true,2000,"查询小区列表成功",page, 10L);
    }


//    @RequestMapping("/search")
//    public PageResult search(@RequestBody Map searchMap){
//        Page<Community> page = communityService.search(searchMap);
//        System.out.println("hello");
//        return new PageResult(true,2000,"查询小区列表成功",page, 10L);
//    }

}
