import Cards.Deck;

import Cards.Board;

public class Table {

    protected Board board = new Board();
    protected Deck deck = new Deck();
    protected Seats seats;

    public Table(int seats){
        this.seats = new Seats(seats);
    }

    public void addPlayer(String name, int startingStack){
        this.seats.addPlayer(name,startingStack);
    }

    public String tableToString(){
        return "Board \n" + this.board.toString() + "\n";
    }

}