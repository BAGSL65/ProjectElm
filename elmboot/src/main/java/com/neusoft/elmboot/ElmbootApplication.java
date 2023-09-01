package com.neusoft.elmboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElmbootApplication {
/*
 * 这里最初启动时报错提示：无法找到主类com.neusoft.elmboot
 * 后来发现是一连串的环境配置问题：maven,jdk等
 * 更改了系统变量 maven的setting.xml文件等
 * 以及mvn clean compile install spring-boot:run
 * 在cmd内执行后可以运行了
 */
	public static void main(String[] args) {
		SpringApplication.run(ElmbootApplication.class, args);
	}

}
