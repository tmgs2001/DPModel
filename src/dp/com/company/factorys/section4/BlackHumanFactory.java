package com.company.factorys.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class BlackHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new BlackHuman();
	}
}
