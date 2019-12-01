package com.practice.Client;

import com.practice.Facade.GameFacade;
import com.practice.SubSystem.CheckUpdate;
import com.practice.SubSystem.GameProcess;
import com.practice.SubSystem.InitializeResource;
import com.practice.SubSystem.LoadMusic;
import com.practice.SubSystem.OverloadGif;
import com.practice.SubSystem.VerifyPackage;

/*
 * ������
 */

public class FacadeTest {
	public static void main(String [] args) throws InterruptedException {
		//��ʼ�����
		CheckUpdate cu = new CheckUpdate();
		VerifyPackage vp = new VerifyPackage();
		InitializeResource ir = new InitializeResource();
		OverloadGif lg = new OverloadGif();
		LoadMusic lm = new LoadMusic();
		GameProcess gp = new GameProcess();
		
		GameFacade gf = new GameFacade(cu,vp,ir,lg,lm,gp);
		gf.GameOpen("Glory to the king");//����Ϸ
		gf.GameClose();//�ر���Ϸ
	}
}
