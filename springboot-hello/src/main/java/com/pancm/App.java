package com.pancm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;


/**
 * 
* Title: App
* Description:
* springBoot 主程序 
* Version:1.0.0  
* @author pancm
* @date 2018年1月5日
 */
@SpringBootApplication
public class App   {
    
	public static void main(String[] args) {
		// 启动嵌入式的 Tomcat 并初始化 Spring 环境及其	ΩΩΩΩ	// 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件各 Spring 组件
		ApplicationContext context = SpringApplication.run(App.class, args);
		System.out.println("程序正在运行...");
	}


	@Bean
	public ViewResolver myViewResolver() {
		return null;
	}

	private static class MyViewResolver implements ViewResolver {
		@Override
		public View resolveViewName(String s, Locale locale) throws Exception {
			return null;
		}
	}
}
