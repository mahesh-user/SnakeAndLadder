package com.bridgelabz;
import java.util.Random;
public class SnakeAndLadder {
    public static final int START_POSITION=0;
    public static final int PLAYER1 = 0;
    public static final int PLAYER2 = 1;
    public static int position =0;
    public static int dice_Count =0;
    public static int player1_pos = 0;
    public static int player2_pos = 0;
    public static void main(String[] args) {
        int player = 0;
        System.out.println("Game started with single player at position " + START_POSITION);
        while (position < 100) {
            if (player == PLAYER1){
                position = player1_pos;
            }
            else{
                position = player2_pos;
            }
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
                    if (position == 100) {
                        if (player == PLAYER1)
                            System.out.println("Player1 Wins");
                        else
                            System.out.println("Player2 Wins");
                    }
                    break;
                }
                default: {
                    position = position - dice;    //snake
                    if (position < 0)
                        position =0;
                    break;
                }
            }
            dice_Count = dice_Count + 1;
            if (player == PLAYER1){
                player1_pos = position;
                player = PLAYER2;
            }
            else{
                player2_pos = position;
                player = PLAYER1;
            }
            if (options == 1){
                player = 0;
            }
            else
                player = 1;

        }
        System.out.println("Number of dice roll : " + dice_Count);
        System.out.println(position);
    }


}