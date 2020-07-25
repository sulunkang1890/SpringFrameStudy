package com.slk.Proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SlkTestProxy implements InvocationHandler {

	private Object target;
	public SlkTestProxy(Object target) {
		super();
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("在方法之前打印----------before----------");

		//执行目标对象方法
		Object result = method.invoke(target, args);

		System.out.println("在方法之后打印----------after----------");
		return null;
}
	public  Object  getProxy( ) {
		return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
				target.getClass().getInterfaces(), this);
	}


}
