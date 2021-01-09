package PokerPlayer;

import Actions.*;

import java.util.ArrayList;

/*
    For now just has 25% to call, check, raise, or fold.
    Will get more advanced later
*/

public class CPUEngine {
    private ArrayList<Action> actions;
    public CPUEngine(){

    }
    public int start(){
        return this.getAction();
    }
    public int getAction(){
        int random = this.random(0, 4);

        return (random);
    }
    
    private int random(int max,int min){
        return (int) ( Math.random() * (max - min) + min);
    }
}
