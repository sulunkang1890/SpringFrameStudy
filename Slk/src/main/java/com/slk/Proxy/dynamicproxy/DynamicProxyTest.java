package com.slk.Proxy.dynamicproxy;

public class DynamicProxyTest {
	public static void main(String[] args) {

		IProxyService target=new ProxySevice();
		SlkTestProxy slkTestProxy=new SlkTestProxy(target);
		IProxyService proxy=(IProxyService)slkTestProxy.getProxy();
		proxy.queryMessage();
	}
}
