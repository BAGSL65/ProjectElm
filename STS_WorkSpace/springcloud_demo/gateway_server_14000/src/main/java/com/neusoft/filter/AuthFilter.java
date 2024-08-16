package com.neusoft.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class AuthFilter implements GlobalFilter{
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		//获取请求参数中的令牌
		String token = exchange.getRequest().getQueryParams().getFirst("token");
		if(token==null) {
			//响应HTTP状态码(401) 代表无权限访问
			exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
			//请求结束
			return exchange.getResponse().setComplete();
		}
		//继续执行过滤器链中的下个资源
		return chain.filter(exchange);
	}
}
