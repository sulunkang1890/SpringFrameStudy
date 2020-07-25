package com.slk.Proxy.staticProxy;

public class KmsService implements Service {
	Service target;

	public KmsService(Service service) {
		this.target = service;
	}
	@Override
	public void query() {
		target.query();
		System.out.println("kms Sercvice");
	}
}
