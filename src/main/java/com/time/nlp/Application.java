package com.time.nlp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @ClassName: Application
 * @Description: 包扫描管理
 * @author liangzhicheng
 * @date 2018年3月12日 下午2:21:02
 *
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.time.nlp" })
public class Application {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}
