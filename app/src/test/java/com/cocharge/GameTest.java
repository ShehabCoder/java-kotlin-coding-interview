package com.cocharge;



import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class GameTest {

    @Test
    void testEvaluateGame() {
        Game game = new Game();

        assertEquals(Game.Result.WIN, game.evaluateGame(Move.ROCK, Move.SCISSORS));
        assertEquals(Game.Result.LOSE, game.evaluateGame(Move.ROCK, Move.PAPER));
        assertEquals(Game.Result.DRAW, game.evaluateGame(Move.ROCK, Move.ROCK));
    }

    @Test
    void testGameResults() {
        Game game = new Game();
        game.playRound(Move.ROCK, Move.SCISSORS); // Player A wins
        game.playRound(Move.ROCK, Move.ROCK);    // Draw
        game.playRound(Move.ROCK, Move.PAPER);   // Player B wins

        assertEquals(1, game.getPlayerAWins());
        assertEquals(1, game.getPlayerBWins());
        assertEquals(1, game.getDraws());
    }
}
