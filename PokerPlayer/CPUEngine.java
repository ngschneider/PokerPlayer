package PokerPlayer;

import Actions.*;

import java.util.ArrayList;

/*
    For now just has 25% to call, check,or fold.
    Will get more advanced later
*/

public class CPUEngine {
    private ArrayList<Action> actions;
    public CPUEngine(ArrayList<Action> actions){
        this.actions = actions;

    }

    public Action action(){
        int random = this.random(0, this.actions.size() - 1);

        return this.actions.get(random);

       
    }
    
    private int random(int max,int min){
        return (int) ( Math.random() * (max - min) + min);
    }
}
