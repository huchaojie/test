package com.yc.sm;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yc.sm.bean.Dept;
import com.yc.sm.biz.impl.DeptBizImpl;

public class MyTest {
	@Test
	public void test1(){
		ApplicationContext context=new ClassPathXmlApplicationContext("com/yc/sm/config/spring-bean.xml");
		DeptBizImpl deptBiz=(DeptBizImpl) context.getBean("deptBizImpl");
		int result=deptBiz.add(new Dept(60,"市场部","2606"));
		System.out.println( result );
	}
}
