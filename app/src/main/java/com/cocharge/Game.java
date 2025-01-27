package com.cocharge;

import java.util.Random;

public class Game {
    public enum Result {
        WIN, LOSE, DRAW
    }

    private int playerAWins = 0;
    private int playerBWins = 0;
    private int draws = 0;

    public Result evaluateGame(Move playerA, Move playerB) {
        if (playerA == playerB) return Result.DRAW;
        if ((playerA == Move.ROCK && playerB == Move.SCISSORS) ||
            (playerA == Move.PAPER && playerB == Move.ROCK) ||
            (playerA == Move.SCISSORS && playerB == Move.PAPER)) {
            return Result.WIN;
        }
        return Result.LOSE;
    }

    public void playRound(Move playerA, Move playerB) {
        Result result = evaluateGame(playerA, playerB);
        switch (result) {
            case WIN -> playerAWins++;
            case LOSE -> playerBWins++;
            case DRAW -> draws++;
        }
    }

    public void playGame(int rounds) {
        Random random = new Random();
        for (int i = 0; i < rounds; i++) {
            Move randomMove = Move.values()[random.nextInt(Move.values().length)];
            playRound(Move.ROCK, randomMove);
        }
    }

    public void printResults(int rounds) {
        System.out.printf("Player A wins %d of %d games%n", playerAWins, rounds);
        System.out.printf("Player B wins %d of %d games%n", playerBWins, rounds);
        System.out.printf("Draws: %d of %d games%n", draws, rounds);
    }

    public int getPlayerAWins() {
        return playerAWins;
    }

    public int getPlayerBWins() {
        return playerBWins;
    }

    public int getDraws() {
        return draws;
    }
}
