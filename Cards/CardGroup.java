package Cards;

import java.util.ArrayList;

public class CardGroup {
    protected int MAX_CARDS = -1;
    protected int MIN_CARDS = -1;
    private int iterator = 0;
    protected ArrayList<Card> cardGroup = new ArrayList<Card>();

    public CardGroup(){
        
    }

    public int getNumberOfCards(){
        return this.cardGroup.size();
    }

    public void addCard(Card cd){
        this.maintainCardMax();
        this.cardGroup.add(cd);
    }

    public void updateCardGroup( ArrayList<Card> cds ) {
        this.cardGroup = cds;
        this.maintainCardMax();
        this.maintainCardMin();
    }
    public Card getSingleCard(){
        if(this.iterator == this.cardGroup.size()) this.iterator = 0;
        Card card = this.cardGroup.get(this.iterator);
        this.iterator += 1;
        return card;
        
    }
    public ArrayList<Card> getCards(){
        this.maintainCardMax();
        this.maintainCardMin();
        return this.cardGroup;
   }
   
    private void maintainCardMax(){

        if( (this.MAX_CARDS != -1 ) && (this.getNumberOfCards() > this.MAX_CARDS) ) throw new Error("MAXIMUM CARD LIMIT REACHED");
    }
    private void maintainCardMin(){

        if( (this.MIN_CARDS != -1) && (this.getNumberOfCards() < this.MIN_CARDS) ) throw new Error("MINIMUM CARD LIMIT NOT REACHED");
    }

    public void setMaxAndMin(int max, int min){
        this.MAX_CARDS = max;
        this.MIN_CARDS = min;
    }

    public String toString(){
        String str = "";
        for (Card card : this.cardGroup) {
            str += card.toString() + ", ";
        }
        return str;
    }
}