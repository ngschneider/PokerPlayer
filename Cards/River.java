package Cards;

public class River extends CardGroup{

    private final int MAX_CARDS = 1;
    private final int MIN_CARDS = 1;

    public River(){
        super();
        this.setMaxAndMin(this.MAX_CARDS, this.MIN_CARDS);
    }


}
