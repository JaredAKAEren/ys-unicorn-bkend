package com.origami.unicorn.controller;

import com.origami.unicorn.entity.User;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
// import io.swagger.v3.oas.annotations.tags.Tag;

@Api(tags = "测试")
@RestController
@RequestMapping("/user")
public class UserController {
    @ApiOperation("测试接口-1")
    @PostMapping("/show1")
    public String show1(@ApiParam(value = "姓名", required = true, example = "王小美") @RequestParam String name) {
        return "hello," + name + ",welcome to springboot swagger3!";
    }

    @ApiOperation("测试接口-2")
    @PostMapping("/show2")
    public String show2(@ApiParam(value = "用户对象", required = true) @RequestBody User user) {
        return "hello," + user.getName() + ",welcome to springboot swagger3!";
    }
}
