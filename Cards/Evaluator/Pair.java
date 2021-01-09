import java.util.ArrayList;

import Cards.Card;

/*
    
*/

public class Pair {

    private Hand hand;
    private boolean isPair = false;

    public Pair(Hand hand){
        this.hand = hand;
        this.isPair();
    }

    /*
        Checks to see if a hand (2 cards) is a pair
    */
    public boolean isPair(){
        ArrayList<Card> cds = this.hand.getCards();
        if(cds.get(0).getCardNumber() == cds.get(1).getCardNumber()){
            this.isPair = true;
            return true;        
        }
        return false;
    }
    public void compare(Pair p1, Pair p2){
        if(!p1.isPair || !p2.isPair) throw new error("Cards are not a pair!");


}