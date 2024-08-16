package com.neusoft.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.po.CommonResult;
import com.neusoft.po.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/getUserById/{userId}")
	public CommonResult<User> getUserById(@PathVariable("userId") Integer userId){
		//返回数据
		return new CommonResult<User>(200,"success(11001)",new User(userId,"李四","321"));
	}
}
