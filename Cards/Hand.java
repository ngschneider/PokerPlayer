package Cards;

public class Hand extends CardGroup{

    final private int MAX_CARDS = 2;
    final private int MIN_CARDS = 1;

    public Hand(){
        super();  
        this.setMaxAndMin(this.MAX_CARDS, this.MIN_CARDS);
    }

    public void clearHand(){
        
    }

}