package com.practice.SubSystem;
/*
 * ���ض�����ϵͳ
 */
public class OverloadGif {
	public void OverloadGifOn() throws InterruptedException{
		System.out.println("���ڼ��ؽ��涯������");
		Thread.sleep(1000);
		OverloadGifOff();
	}
	
	public void OverloadGifOff() {
		System.out.println("���涯��������ɣ�");
	}
}
