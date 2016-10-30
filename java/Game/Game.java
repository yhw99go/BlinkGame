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
        Random rand = new Random();
        int list[3] = {-1,0,1};
        int next = 0;
        int x = (current-1)/3;
        int y=  (current-1)%3;

;
        while (next==0 || next>9 || next<1 || next ==current){
            int random = rand.nextInt(3);
            int random2 = rand.nextInt(3);
            x = x + list[random];
            y = y + list[random2];
            next = x*3 + y+1;

        }








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
