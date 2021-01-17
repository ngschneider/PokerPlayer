package Cards.Evaluator;

import Cards.*;


/*
    Determines if a Card Group of 5 is a staight.
*/

public class Straight{

    private CardGroup cardGroup;
    private boolean isStraight = false;
    private int highestNum = -1;

    public Straight(CardGroup cg){
        this.cardGroup = cg;
        this.cardGroup.setMaxAndMin(5,5);
    }

    public boolean isStaight(){
        int lowest = 99999999;
        int highest = -1;
        int total = 0;
       for(Card cd : this.cardGroup.getCards()){
            if(cd.getCardNumber() > highest) highest = cd.getCardNumber();
            if(cd.getCardNumber() < lowest) lowest = cd.getCardNumber();
            total += cd.getCardNumber();
       }

       this.highestNum= highest;

       if(Math.abs(total - (lowest * 5)) == 10){
           this.isStraight = true;
           return true;
       }else{
           return false;
       }
    }

    public int compare(Straight st2){
        if(!this.getStraight() || !st2.getStraight()) throw new Error("Comparing a non-straight");
        if(this.getHighestNum() > st2.getHighestNum()) return 0;
        if(this.getHighestNum() < st2.getHighestNum()) return 1;
        return 2;
    }

    public int getHighestNum(){
        return this.highestNum;
    }
    public boolean getStraight(){
        return this.isStraight;
    }

}
