package com.bridgelabz;
import java.util.Random;
public class SnakeAndLadder {
    public static final int START_POSITION=0;
    public static int position=0;
    public static void main(String[] args) {
        System.out.println("Game started with single player at position " + START_POSITION);
        while (position < 100) {
            Random random = new Random();
            int dice = 1 + random.nextInt(6);
            int options = random.nextInt(3);
            switch (options) {
                case 0: {
                    position = position;  //no play
                    break;
                }
                case 1: {
                    position = position + dice;   //ladder
                    if (position > 100)
                        position = position - dice;
                    if (position == 100)
                        System.out.println("Player Wins");
                    break;
                }
                default: {
                    position = position - dice;    //snake
                    if (position < 0)
                        position=0;
                    break;
                }
            }

        }
        System.out.println(position);
    }


}