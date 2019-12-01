package com.practice.SubSystem;

/*
 * 初始化资源管理子系统
 */

public class InitializeResource {
	public void Initial() throws InterruptedException{
		System.out.println("正在初始化资源管理……");
		Thread.sleep(2000);
		InitialOff();
	}
	
	public void InitialOff() {
		System.out.println("初始化完成！");
	}
}
