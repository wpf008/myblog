package com.wpf.blog.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author:wpf
 * @Description
 * @Date:Cteated in 4:46 PM 1/18/2018
 * @Modified by
 */
@Controller
public class UserController {

    @ApiOperation(value="测试接口", notes="测试接口详细描述")
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Model model){
        System.out.println("sssssssssss");
        return "/index";
    }

}
