package Cards;

public class Board extends CardGroup{

    final private int MAX_CARDS = 0;
    final private int MIN_CARDS = 5;

    private Flop flop = null;
    private Turn turn = null;
    private River river = null;

    public Board(){
        super();
        this.setMaxAndMin(this.MAX_CARDS, this.MIN_CARDS);
    }

    public void dealBoard(Flop flop){
        this.flop = flop;
        this.updateCardGroup(flop.getCards());

    }

    public void dealBoard(Turn turn){
        this.turn = turn;
        this.addCard(turn.getCards().get(0));

    }

    public void dealBoard(River river){
        this.river = river;
        this.addCard(river.getCards().get(0));
    }
    
    public Flop getFlop(){
        return this.flop;
    }

    public Turn getTurn(){
        return this.turn;
    }

    public River getRiver(){
        return this.river;
    }

}
