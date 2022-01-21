package com.bridgelabz;
import java.util.Random;
public class SnakeAndLadder {
    public static final int START_POSITION=0;
    public static int POSITION =0;
    public static int DICE_COUNT=0;
    public static void main(String[] args) {
        System.out.println("Game started with single player at position " + START_POSITION);
        while (POSITION < 100) {
            Random random = new Random();
            int dice = 1 + random.nextInt(6);
            int options = random.nextInt(3);
            switch (options) {
                case 0: {
                    POSITION = POSITION;  //no play
                    break;
                }
                case 1: {
                    POSITION = POSITION + dice;   //ladder
                    if (POSITION > 100)
                        POSITION = POSITION - dice;
                    if (POSITION == 100)
                        System.out.println("Player Wins");
                    break;
                }
                default: {
                    POSITION = POSITION - dice;    //snake
                    if (POSITION < 0)
                        POSITION =0;
                    break;
                }
            }
            DICE_COUNT = DICE_COUNT + 1;
        }
        System.out.println("Number of dice roll : " + DICE_COUNT);
        System.out.println(POSITION);
    }


}