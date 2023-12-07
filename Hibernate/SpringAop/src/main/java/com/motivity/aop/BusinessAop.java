package com.motivity.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BusinessAop {
	@Before("execution(* com.motivity.service.BussinessLogic.logicOne())")
	public void beforeLogicOne() {
		System.out.println("before logicOne method");
	}

	@After("execution(* com.motivity.service.BussinessLogic.logicOne())")
	public void afterLogicOne() {
		System.out.println("After logicOne method");
	}

	@Before("execution(* com.motivity.service.BussinessLogic.logicTwo())")
	public void beforeLogicTwo() {
		System.out.println("before logicTwo method");
	}

	@Before("execution(* com.motivity.service.BussinessLogic.logicThree())")
	public void beforeLogicThree() {
		System.out.println("before logicThree method");
	}

	@Before("execution(* com.motivity.service.BussinessLogic.logicFour())")
	public void beforeLogicFour() {
		System.out.println("before logicFour method");
	}

	@Before("execution(* com.motivity.service.BussinessLogic.logicFive())")
	public void beforeLogicFive() {
		System.out.println("before logicFive method");
	}
}
