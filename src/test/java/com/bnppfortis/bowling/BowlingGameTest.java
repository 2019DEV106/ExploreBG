package com.bnppfortis.bowling;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

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
		bowlingGame.roll(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
		assertThat(bowlingGame.score(), is(0));

	}

	@Test
	public void scoreGameOfOnes() {
		bowlingGame.roll(1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1);
		assertThat(bowlingGame.score(), is(20));

	}
	
	@Test
	public void scoreSpareFollowedByThree() {
		bowlingGame.roll(5,5, 3,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
		assertThat(bowlingGame.score(), is(16));
	}

	@Test
	public void scoreStrikeFollowedByThreeThenThree() {
		bowlingGame.roll(10, 3,3, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
		assertThat(bowlingGame.score(), is(22));
	}

}
