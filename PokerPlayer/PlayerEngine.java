package PokerPlayer;

import Actions.*;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerEngine {

    private ArrayList<Action> actions;

    public PlayerEngine(ArrayList<Action> actions){
        this.actions = actions;
        System.out.println(this.mainMenu());
        this.getSelectedAction();
    }

    public Action getSelectedAction(){
        return this.actions.get(this.getInput());
    }
    public int getInput(){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        return num;

    }

    public String mainMenu(){
        String str = "Your turn.\n";
        int index = 0;
        for(Action act : this.actions){
            str+= index + ". " + act.getAction() + "\n";
            index++;
        }
        return str;
    }
}
