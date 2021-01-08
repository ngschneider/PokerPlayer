package Cards;


public class Turn extends CardGroup{

    private final int MAX_CARDS = 1;
    private final int MIN_CARDS = 1;

    public Turn(){
        super();
        this.setMaxAndMin(this.MAX_CARDS, this.MIN_CARDS);
    }
    
}
