package com.practice.SubSystem;
/*
 * ����������ϵͳ
 */
public class LoadMusic {
	public void LoadingMusic() throws InterruptedException{
		System.out.println("���ڼ��ر������֡���");
		Thread.sleep(1000);
		LoadingMusicOver();
	}
	
	public void LoadingMusicOver() {
		System.out.println("�������ּ������");
	}
}
