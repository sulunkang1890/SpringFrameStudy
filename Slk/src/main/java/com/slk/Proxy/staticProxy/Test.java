package com.slk.Proxy.staticProxy;

public class Test {

	public static void main(String[] args) {
		Service target=new LogService(new IndexService());
		Service kmslog=new KmsService(target);
		kmslog.query();
	}
}
