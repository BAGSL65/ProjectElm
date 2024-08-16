package com.neusoft.feign;

import org.springframework.stereotype.Component;

import com.neusoft.po.CommonResult;
import com.neusoft.po.User;

@Component
public class UserFeignClientCallBack implements UserFeignClient{
	
	//熔断降级方法
	@Override
	public CommonResult<User> getUserById(Integer userId) {
		//403：表示请求被服务器拒绝
		return new CommonResult(403,"feign触发了熔断降级方法",null) ;
	}
}
