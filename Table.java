import Cards.Deck;
import Cards.Flop;
import Cards.River;
import Cards.Turn;

public class Table {

    protected Board board = new Board();
    protected Deck deck = new Deck();
    protected Seats seats;

    public Table(int seats){
        this.seats = new Seats(seats);
    }

    public addPlayer(String Name, int startingStack){
        this.seats.addPlayer();
    }

}