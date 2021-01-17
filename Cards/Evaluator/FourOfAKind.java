package Cards.Evaluator;

import Cards.Card;
/*
    Determines if a CONFIRMED Three Of A Kind and 
    any card is a Four Of A Kind
*/
public class FourOfAKind {
    private ThreeOfAKind t;
    private Card cd;
    private boolean isFourOfAKind = false;

    public FourOfAKind(ThreeOfAKind t,Card c){
       if(!t.isThreeOfAKind()) throw new Error("First paramater must be a valid Three of a Kind!!!");
       this.t = t;
       this.cd = c;
       this.isFourOfAKind();
    }

    public boolean isFourOfAKind(){
        if(this.t.getThreeOfAKindNum() == this.cd.getCardNumber()) {
            this.isFourOfAKind = true;    
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

    public int compare(FourOfAKind t1, FourOfAKind t2){
        if(!t1.isFourOfAKind || !t2.isFourOfAKind) throw new Error("Cards are not a Four of a Kind!");
        if(t1.getFourOfAKindNum() > t2.getFourOfAKindNum()) return 2;
        if(t1.getFourOfAKindNum() < t2.getFourOfAKindNum()) return 3;
        return 1;
    }

    public int getFourOfAKindNum(){ 
       if(!isFourOfAKind()) throw new Error("Cards are not a Four of a kind!");
       return t.getThreeOfAKindNum();
    }

}
