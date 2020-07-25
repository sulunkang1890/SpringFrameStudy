package com.slk.Proxy.dynamicproxy;

public class ProxySevice implements IProxyService {

	@Override
	public void queryMessage() {
		System.out.println("执行代理方法");
	}
}
