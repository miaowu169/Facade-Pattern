package com.practice.SubSystem;
/*
 * У�鰲װ����ϵͳ
 */

public class VerifyPackage {
	public void VerifyOn() throws InterruptedException {
		System.out.println("����Ϊ��У�鰲װ������");
		Thread.sleep(1000);
		VerifyOff();
	}
	
	public void VerifyOff() {
		System.out.println("У����ɣ�");
	}
}
