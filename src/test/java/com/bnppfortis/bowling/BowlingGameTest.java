package com.bnppfortis.bowling;

import org.junit.Test;

public class BowlingGameTest {

	 
	@Test
	public void rollBallAndZeroPinsDown() {
		BowlingGame bowlingGame= new BowlingGame();
		bowlingGame.roll(0);
	}

}
