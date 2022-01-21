package com.bridgelabz;

import java.util.Random;
public class SnakeAndLadder {
    public static final int START_POSITION=0;
    public static void main(String[] args) {
        System.out.println("Game started with single player at position " + START_POSITION);
        Random random = new Random();
        int dice = 1 + random.nextInt(6);
        System.out.println(dice);

    }