package com.practice.SubSystem;
/*
 * 检查版本更新子系统
 */

public class CheckUpdate {
	public void CheckOn() throws InterruptedException {
		System.out.println("正在为您检测版本更新……");
		Thread.sleep(2000);
		CheckOff();
	}
	
	public void CheckOff() {
		System.out.println("检测为最新版本");
	}
}
