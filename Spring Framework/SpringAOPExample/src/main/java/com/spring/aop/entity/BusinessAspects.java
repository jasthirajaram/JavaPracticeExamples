package com.spring.aop.entity;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class BusinessAspects {
	// @Pointcut
	public void k() {
	}// pointcut name

	@Before("execution(* com.spring.aop.entity.BusinessLogic.logicOne())")
	public void beforeAdvice() {
		System.out.println("before logic one method");
	}
	  @After("logicTwo()") public void afterAdvice() {
	  System.out.println("after logic two method"); }
	  
	  @Around("logicThree()") public void aroundAdvice() {
	  System.out.println("Before and after logic three method"); }
	  
	  @After("logicFour") public void afterAdvice4() {
	  System.out.println("after logicThree method returned"); }
	  
	  @Around("logicFive()") public void aroundAdvice5() {
	 System.out.println("before and afte logicThree method"); 
	}
}
