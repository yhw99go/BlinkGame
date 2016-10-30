package Game;

import java.util.Random;
/**
 * Created by KH on 2016-10-29.
 */

public class Game {
    private int level;
    private int score;
    private int highScore;
    private int length;

    public Game(int highScore){
        level = 0;
        score = 0;
        this.highScore = highScore;
    }

    public int getLevel()
    {
        if (score < 5)
            level = 0;
        else if (score < 15)
            level = 1;
        else if (score < 30)
            level = 2;
        else
            level = 3;
        return level;
    }

    public int getHighScore(){
        return highScore;
    }

    public int getAdjacentMove(int current){
        int next = 0;
        return next;
    }

    public int getNextMove(int current){
        Random rand = new Random();
        if(current == 0)
            return rand.nextInt(Constants.BOARD_SIZE + 1);
        int next = 0;
        switch (level)
        {
            case 0:
                next = getAdjacentMove(current);
                break;
            default:
                break;



        }
        return next;
    }

}
