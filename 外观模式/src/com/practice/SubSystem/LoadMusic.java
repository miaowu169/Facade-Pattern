package com.practice.SubSystem;
/*
 * 加载音乐子系统
 */
public class LoadMusic {
	public void LoadingMusic() throws InterruptedException{
		System.out.println("正在加载背景音乐……");
		Thread.sleep(1000);
		LoadingMusicOver();
	}
	
	public void LoadingMusicOver() {
		System.out.println("背景音乐加载完成");
	}
}
