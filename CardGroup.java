import java.util.ArrayList;

public class CardGroup {
    protected int MAX_CARDS = -1;
    protected int MIN_CARDS = -1;
    protected ArrayList<Card> cardGroup = new ArrayList<Card>();

    public CardGroup(){
        
    }

    public int getNumberOfCards(){
        return this.cardGroup.size();
    }

    public void addHandCard(Card cd){
        this.maintainCardMax();
        this.cardGroup.add(cd);
    }
   public ArrayList<Card> getCards(){
        this.maintainCardMax();
        this.maintainCardMin();
        return this.getCards();
   }
   
    private void maintainCardMax(){

        if( (this.MAX_CARDS != -1 ) && (this.getNumberOfCards() > this.MAX_CARDS) ) throw new Error("MAXIMUM CARD LIMIT REACHED");
    }
    private void maintainCardMin(){

        if( (this.MIN_CARDS != -1) && (this.getNumberOfCards() < this.MIN_CARDS) ) throw new Error("MINIMUM CARD LIMIT NOT REACHED");
    }

    protected void setMaxAndMin(int max, int min){
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