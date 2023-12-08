package com.sp5;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class InternetAdvice implements MethodBeforeAdvice,AfterReturningAdvice,MethodInterceptor
{

	CustomerOwener custowener;

	public CustomerOwener getCustowener() {
		return custowener;
	}

	public void setCustowener(CustomerOwener custowener) {
		this.custowener = custowener;
	}

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Now Start before method...");
		custowener.login();
		
	}

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("Now Start After method...");
       custowener.logout();
		
	}

	@Override
	public Object invoke(MethodInvocation m1) throws Throwable {
		System.out.println("Now Start Performing...");
		m1.proceed();
		System.out.println("Now Stop Performing...");

		return null;
	}
	

	
}
