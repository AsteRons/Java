package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class MyDemoLoggingAspect {

	
	// this is where we add all of our related adviced for logging
	
	
	// let's start with an @Before advice
	
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	private void forDaoPackage()
	{	}
	
	
	// create pointcut for getter methods
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
	private void getter()
	{	}
	
	
	// create pointcut for setter methods
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.set*(..))")
	private void setter()
	{	}
	
	
	// create point: include package ... exclude getter/setter
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	private void forDaoPackageNotGetterSetter()
	{
		
	}
	

	@Before("forDaoPackageNotGetterSetter()")
	public void beforeAddAccountAdvice() {
		
		System.out.println("\n ====> Executing @Before advice an addAccount()");
	}

	
	@Before("forDaoPackageNotGetterSetter()")
	private void performApiAnalytics()
	{
		System.out.println("\n====> Performing API analytics");
	}


}
