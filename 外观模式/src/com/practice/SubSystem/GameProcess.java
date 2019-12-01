package com.practice.SubSystem;

/*
 * 游戏进程子系统(开始/结束)
 */

public class GameProcess {
	public void gameStart() throws InterruptedException {
		System.out.println("游戏开始！");
		for(int i=10;i>0;i--) {
			System.out.println("游戏中--"+i);
			Thread.sleep(1000);
		}
	}
	
	public void GameOver() {
		System.out.println("游戏结束");
	}
}
