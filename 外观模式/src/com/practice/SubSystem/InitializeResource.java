package com.practice.SubSystem;

/*
 * ��ʼ����Դ������ϵͳ
 */

public class InitializeResource {
	public void Initial() throws InterruptedException{
		System.out.println("���ڳ�ʼ����Դ������");
		Thread.sleep(2000);
		InitialOff();
	}
	
	public void InitialOff() {
		System.out.println("��ʼ����ɣ�");
	}
}
