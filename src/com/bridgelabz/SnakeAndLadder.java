package com.bridgelabz;
import java.util.Random;
public class SnakeAndLadder {
    public static final int START_POSITION=0;
    public static int position=0;
    public static void main(String[] args) {
        System.out.println("Game started with single player at position " + START_POSITION);
        Random random = new Random();
        int dice = 1 + random.nextInt(6);
        int options = random.nextInt(3);
        switch (options){
            case 0:{
                position = position;
                System.out.println("No Play and position : " + position);
                break;
            }
            case 1:{
                position = position + dice;
                System.out.println("Ladder and position : " + position);
                break;
            }
            default:{
                position = position - dice;
                System.out.println("Snake and position : " + position);
                break;
            }
        }

    }


}