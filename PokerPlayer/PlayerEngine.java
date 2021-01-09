package PokerPlayer;

import Actions.*;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerEngine {

    private ArrayList<Action> actions;

    public PlayerEngine(){
        
    }

    public int start(){
        System.out.println(this.mainMenu());
        return this.getSelectedAction();
    }

    public int getSelectedAction(){
        int act = (this.getInput());
        return act;
    }
    public int getInput(){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        return num - 1;

    }

    public int getRaise(){
        System.out.println("Enter how much you would like to raise too.\n");
        return this.getInput();
    }

    public String mainMenu(){
        String str = "Your turn.\n";
        str += "1. Fold\n";
        str += "2. Call\n";
        str += "3. Raise\n";
        str += "4. Check\n"; 
        return str;
    }
}
