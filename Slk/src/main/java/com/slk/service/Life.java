package com.slk.service;

import org.springframework.context.Lifecycle;
import org.springframework.stereotype.Component;

/**
 * IOC 容器的生命周期
 */
@Component
public class Life implements Lifecycle {
	private boolean flag=false;
	//显示调用
	@Override
	public void start() {
		System.out.println("start");
		flag=true;
	}

	@Override
	public void stop() {
		System.out.println("stop");
		flag=false;
	}

	@Override
	public boolean isRunning() {
		/**
		 * 告诉显示的调用者 容器已经启动了 容器启动前也是会先判断 这个容器是否已经启动了
		 */

		System.out.println("================");
		return true;

	}
}
