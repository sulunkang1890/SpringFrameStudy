package com.slk.service;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

//@Component
public class LifeV2 implements SmartLifecycle {
	@Override
	public void start() {
		System.out.println("start============");
	}

	@Override
	public void stop() {

	}

	@Override
	public boolean isRunning() {
		return false;
	}

	@Override
	public boolean isAutoStartup() {
		return true;
	}

	@Override
	public void stop(Runnable callback) {

	}

	@Override
	public int getPhase() {
		return 0; //优先级 如果当前项目实现了多个  越小优先级越高
	}
}
