package com.company.factorya.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class AbstractBlackHuman implements Human {

	@Override
  public void getColor(){
		System.out.println("黑色人种的皮肤颜色是黑色的！");
	}

	@Override
	public void talk() {
		System.out.println("黑人会说话，一般人听不懂。");

	}

}
