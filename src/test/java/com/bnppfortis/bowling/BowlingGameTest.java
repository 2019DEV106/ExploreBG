package com.bnppfortis.bowling;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BowlingGameTest {
	 
	@Test
	public void  scoreGutterGame() {
		BowlingGame bowlingGame= new BowlingGame();
		for (int i = 0; i < 20; i++) {
			bowlingGame.roll(0);
		}
		assertThat(bowlingGame.score(), is(0));
		 
	}
	
	

}
