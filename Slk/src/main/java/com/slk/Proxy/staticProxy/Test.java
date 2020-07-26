package com.slk.Proxy.staticProxy;

public class Test {
	//有点像装饰器模式
	public static void main(String[] args) {
		Service target=new LogService(new IndexService());
		Service kmslog=new KmsService(target);
		kmslog.query();
	}
}
