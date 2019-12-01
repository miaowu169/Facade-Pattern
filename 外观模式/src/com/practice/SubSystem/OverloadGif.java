package com.practice.SubSystem;
/*
 * 加载动画子系统
 */
public class OverloadGif {
	public void OverloadGifOn() throws InterruptedException{
		System.out.println("正在加载界面动画……");
		Thread.sleep(1000);
		OverloadGifOff();
	}
	
	public void OverloadGifOff() {
		System.out.println("界面动画加载完成！");
	}
}
