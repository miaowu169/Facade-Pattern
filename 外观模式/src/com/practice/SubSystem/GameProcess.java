package com.practice.SubSystem;

/*
 * ��Ϸ������ϵͳ(��ʼ/����)
 */

public class GameProcess {
	public void gameStart() throws InterruptedException {
		System.out.println("��Ϸ��ʼ��");
		for(int i=10;i>0;i--) {
			System.out.println("��Ϸ��--"+i);
			Thread.sleep(1000);
		}
	}
	
	public void GameOver() {
		System.out.println("��Ϸ����");
	}
}
