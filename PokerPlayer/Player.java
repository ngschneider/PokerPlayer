package PokerPlayer;

import Cards.Hand;
import Cards.Card;
import Chips.PlayerChipStack;

public class Player{

    private PlayerChipStack stack = null;
    private Hand hand = new Hand();
    private String playerName = "UNDEFINED";
    private boolean preventStackDuplication = true;


    public Player(String name){
        this.playerName = name;
    }

    public void setStack(int chips){
        if(this.preventStackDuplication){
            this.preventStackDuplication = false;
            this.stack = new PlayerChipStack(chips);
        }

    }

    public void setHand(Card cd){
        this.hand.addCard(cd);
    }

    public String getPlayerName(){
        return this.playerName;
    }

    public int getStack(){
        return this.stack.getCount();
    }

    public String toString(){
        return "" + this.getPlayerName() 
        + "=> " + this.stack.toString() 
            +  this.hand.toString();
    }


}