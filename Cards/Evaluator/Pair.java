package Cards.Evaluator;

 import Cards.*;

/*
    Determines if any 2 cards are a pair.
*/

public class Pair {

    private Card cd1;
    private Card cd2;
    private boolean isPair = false;
    private int pairNum = -1;

    public Pair(Card cd1, Card cd2 ){
        this.cd1 = cd1;
        this.cd2 = cd2;
        this.isPair();
    }

    /*
        Checks to see if a hand (2 cards) is a pair
    */
    public boolean isPair(){
        if(this.cd1.getCardNumber() == this.cd2.getCardNumber()){
            this.isPair = true;
            this.pairNum = this.cd1.getCardNumber();
            return true;        
        }
        return false;
    }
    /*
        Compare 2 Pair objects
        1 - p1 == p2
        2 - p1  > p2
        3 - p1  < p2
    */
    public int compare(Pair p1, Pair p2){
        if(!p1.isPair || !p2.isPair) throw new Error("Cards are not a pair!");
        if(p1.getPairNum() > p2.getPairNum()) return 2;
        if(p1.getPairNum() < p2.getPairNum()) return 3;
        return 1;
    }

    public int getPairNum(){
        if(!this.isPair) throw new Error("Cards are not a pair!");
        return this.pairNum;
    }

    public boolean getPair(){
        return this.isPair;
    }

}