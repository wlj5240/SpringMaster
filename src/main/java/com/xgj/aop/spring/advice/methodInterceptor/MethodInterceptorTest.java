package com.xgj.aop.spring.advice.methodInterceptor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MethodInterceptorTest {

	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"classpath:com/xgj/aop/spring/advice/methodInterceptor/conf-advice.xml");

		Waiter waiter = ctx.getBean("waiter", Waiter.class);
		waiter.greetTo("Xiao");
		waiter.serverTo("GongJiang");
	}

}
