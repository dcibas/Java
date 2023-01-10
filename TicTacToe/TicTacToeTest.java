package Mano;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TicTacToeTest {

	TicTacToe ticTacToe;
	
	@BeforeEach
	void setUp() throws Exception {
		ticTacToe = new TicTacToe();
	}

	@Test
	void testTicTacToeVertical() {
		String[][] board = {{"X", "2", "3"}, {"X","5","6"},{"X","8","9"}};
		assertEquals("X", ticTacToe.checkWinner(board));
	}
		
	@Test
	void testTicTacToeHorizontal() {
		String[][] board = {{"O", "O", "O"}, {"4","5","6"},{"7","8","9"}};
		assertEquals("O", ticTacToe.checkWinner(board));
	}
	
	@Test
	void testTicTacToeCross() {
		String[][] board = {{"X", "2", "3"}, {"4","X","6"},{"7","8","X"}};
		assertEquals("X", ticTacToe.checkWinner(board));
	}
	
	@Test
	void testTicTacToeStartingBoard() {
		String[][] board = {{"1", "2", "3"}, {"4","5","6"},{"7","8","9"}};
		assertEquals(null, ticTacToe.checkWinner(board));
	}
	
}
