import PokerPlayer.*;
import Cards.Flop;
import Cards.Turn;
import Cards.River;
import Cards.Board;
import Actions.Action;

import java.util.ArrayList;
public class TexasHoldEM extends Table{
        
    private int cardRound = 0;
    private int betRound = 0;
    private int playerTurn = 0;
    private Position pos = new Position();
    private ArrayList<Action> action = new ArrayList<Action>();
    private ArrayList<Player> playersIn;

    public TexasHoldEM(){
        super(9);
    }

    /*
        Restarts the players that in the new round
        shuffles new deck
        updates new token positions
    */
    public void newRound(){
        this.playersIn = this.seats.getPlayerList();
        this.deck.generateDeck();
        this.deck.shuffleDeck();
        this.pos.newGameRound();
      //  System.out.println(this.deck.toString());

    }


    public void betRound(){

    }

    public void playerBet(){
        int currentBetter = this.pos.nextAction();

    }

    /*
        Deal hand to all the players that are in
    */
    public void dealHands(){
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < this.pos.getTableSize(); j++){
                this.dealToPlayer();
            }
        }

    }

    /*
        Deal a single card to single player
    */
    public void dealToPlayer(){
        int currentPlayer = this.pos.nextAction();
        this.playersIn.get(currentPlayer).setHand(this.deck.deal());
    }

    /*
        Flips the correct amount of cards to the board
    */
    public boolean dealBoard(){
        switch(this.cardRound) {
            case 0 :
                Flop flop = new Flop();
                flop.addCard(this.deck.deal());
                flop.addCard(deck.deal());
                flop.addCard(deck.deal());
                this.cardRound++;
                this.board.dealBoard(flop);
                return true;
            case 1 : 
                Turn turn = new Turn();
                turn.addCard(deck.deal());
                this.cardRound++;
                this.board.dealBoard(turn);
                return true;
            case 2 : 
                River river = new River();
                river.addCard(deck.deal());
                this.cardRound++;
                this.board.dealBoard(river);
                return true;
            default : 
                return false;  
        }
    }

    public String toString(){
        String str = "Players : \n";
        for(Player p : this.playersIn){
            str += p.toString() + "\n";
        }
        str += this.board.toString();
        return str;
    }



}