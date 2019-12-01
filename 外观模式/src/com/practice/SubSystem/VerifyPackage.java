package com.practice.SubSystem;
/*
 * 校验安装包子系统
 */

public class VerifyPackage {
	public void VerifyOn() throws InterruptedException {
		System.out.println("正在为您校验安装包……");
		Thread.sleep(1000);
		VerifyOff();
	}
	
	public void VerifyOff() {
		System.out.println("校验完成！");
	}
}
