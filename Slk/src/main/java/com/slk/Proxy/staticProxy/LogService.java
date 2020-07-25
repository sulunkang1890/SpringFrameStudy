package com.slk.Proxy.staticProxy;

public class LogService implements Service {
	Service target;

	public LogService(Service service) {

		this.target = service;
	}
	@Override
	public void query() {
		target.query();
		System.out.println("log service");
	}
}
