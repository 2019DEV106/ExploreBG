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
		bowlingGame.roll(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		assertThat(bowlingGame.score(), is(0));
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void scoreGutterGameWithExhaustedRolls() {
		bowlingGame.roll(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		assertThat(bowlingGame.score(), is(0));
	}

	@Test
	public void scoreGameOfOnes() {
		bowlingGame.roll(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
		assertThat(bowlingGame.score(), is(20));
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void scoreGameOfOnesWithExhaustedRolls() {
		bowlingGame.roll(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
		assertThat(bowlingGame.score(), is(20));
	}

	@Test
	public void scoreSpareFollowedByThree() {
		bowlingGame.roll(5, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		assertThat(bowlingGame.score(), is(16));
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void scoreSpareFollowedByThreeWithExhaustedRolls() {
		bowlingGame.roll(5, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		assertThat(bowlingGame.score(), is(16));
	}

	@Test
	public void scoreStrikeFollowedByThreeThenThree() {
		bowlingGame.roll(10, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		assertThat(bowlingGame.score(), is(22));
	}

	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void scoreStrikeFollowedByThreeThenThreeWithExhaustedRolls() {
		bowlingGame.roll(10, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		assertThat(bowlingGame.score(), is(22));
	}
	
	@Test
	public void scorePerfectGame() {
		bowlingGame.roll(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
		assertThat(bowlingGame.score(), is(300));
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void scorePerfectGameWithExhaustedRolls() {
		bowlingGame.roll(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
		assertThat(bowlingGame.score(), is(300));
	}

}
