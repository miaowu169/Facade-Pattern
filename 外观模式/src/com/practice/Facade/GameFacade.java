package com.practice.Facade;

import com.practice.SubSystem.CheckUpdate;
import com.practice.SubSystem.GameProcess;
import com.practice.SubSystem.InitializeResource;
import com.practice.SubSystem.LoadMusic;
import com.practice.SubSystem.OverloadGif;
import com.practice.SubSystem.VerifyPackage;

/*
 * ��۽�ɫ��
 */

public class GameFacade {
	CheckUpdate cu;
	VerifyPackage vp;
	InitializeResource ir;
	OverloadGif og;
	LoadMusic lm;
	GameProcess gp;
	
	public GameFacade(CheckUpdate cu,VerifyPackage vp,InitializeResource ir,OverloadGif og,LoadMusic lm,GameProcess gp) {
		this.cu = cu;
		this.vp = vp;
		this.ir = ir;
		this.og = og;
		this.lm = lm;
		this.gp = gp;
	}
	
	//����Ϸ�����ø���ϵͳ����
	public void GameOpen(String game) throws InterruptedException {
		System.out.println("Get ready to play a game!");
		cu.CheckOn();
		vp.VerifyOn();
		ir.Initial();
		og.OverloadGifOn();
		lm.LoadingMusic();
		gp.gameStart();
	}
	
	//��Ϸ����
	public void GameClose() throws InterruptedException{
		gp.GameOver();
	}
}
