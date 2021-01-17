package Cards.Evaluator;

import Cards.CardGroup;
import Cards.Card;

public class Flush {

    private CardGroup cardGroup;
    private boolean isFlush = false;
    private int highestNum = -1;

    public Flush(CardGroup cg){
        this.cardGroup = cg;
    }

    public boolean isFlush(){
        int highest = -1;
        int suit = this.cardGroup.getSingleCard().getSuit();
        for(Card cd : this.cardGroup.getCards()){
            if(cd.getCardNumber() > highest) highest = cd.getCardNumber();
            if(cd.getSuit() != suit) return false;
        }
        this.highestNum = highest;
        this.isFlush = true;
        return true;
    }

    public int compare(Flush f1,Flush f2){
        if(!f1.getFlush() || !f2.getFlush()) throw new Error("Comparing non-flush");
        if(f1.getHighestNum() > f2.getHighestNum()) return 0;
        if(f1.getHighestNum() < f2.getHighestNum()) return 1;
        return 2;
    }

    public boolean getFlush(){
        return this.isFlush;
    }
    public int getHighestNum(){
        return this.highestNum;
    }
    
}
