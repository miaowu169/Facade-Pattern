package com.practice.SubSystem;
/*
 * ���汾������ϵͳ
 */

public class CheckUpdate {
	public void CheckOn() throws InterruptedException {
		System.out.println("����Ϊ�����汾���¡���");
		Thread.sleep(2000);
		CheckOff();
	}
	
	public void CheckOff() {
		System.out.println("���Ϊ���°汾");
	}
}
