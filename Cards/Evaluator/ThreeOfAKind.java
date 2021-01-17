package Cards.Evaluator;

import Cards.Card;
/*
    Determines if a CONFIRMED pair and any card is a three of a kind.
*/
public class ThreeOfAKind{

    private Pair p;
    private Card cd;
    private boolean isThreeOfAKind = false;

    public ThreeOfAKind(Pair p,Card c){
       if(!p.isPair()) throw new Error("First paramater must be a valid pair!!!");
       this.p = p;
       this.cd = c;
       this.isThreeOfAKind();
    }

    public boolean isThreeOfAKind(){
        if(this.p.getPairNum() == this.cd.getCardNumber()) {
            this.isThreeOfAKind = true;    
            return true;
        }
        return false;
    }
      /*
        Compare 2 ThreeOfAKind objects
        1 - t1 == t2
        2 - t1  > t2
        3 - t1  < t2
    */

    public int compare(ThreeOfAKind t2){
        if(!this.isThreeOfAKind || !t2.isThreeOfAKind) throw new Error("Cards are not a Three of a Kind!");
        if(this.getThreeOfAKindNum() > t2.getThreeOfAKindNum()) return 2;
        if(this.getThreeOfAKindNum() < t2.getThreeOfAKindNum()) return 3;
        return 1;
    }

    public int getThreeOfAKindNum(){ 
       if(!isThreeOfAKind()) throw new Error("Cards are not a Three of a kind!");
       return p.getPairNum();
    }

    
}
