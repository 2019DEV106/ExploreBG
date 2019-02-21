package com.bnppfortis.bowling;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {

	private BowlingGame bowlingGame;

	@Before
	public void setUp() {

		bowlingGame = new BowlingGame();

	}

	@Test
	public void scoreGutterGame() {
		roll(20, 0);
		assertThat(bowlingGame.score(), is(0));

	}

	@Test
	public void scoreGameOfOnes() {
		roll(20, 1);
		assertThat(bowlingGame.score(), is(20));

	}

	public void roll(int times, int pinsDown) {
		for (int i = 0; i < times; i++) {
			bowlingGame.roll(pinsDown);
		}
	}

}
