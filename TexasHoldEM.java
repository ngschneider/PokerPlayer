

public class TexasHoldEM extends Table{
        
    private int cardRound = 0;
    private int betRound = 0;
    private int playerTurn = 0;
    private Players playersIn;

    public TexasHoldEM(){
        super(9);
    }

    /*
        Restarts the players that in the new round
        shuffles new deck
    */
    public void newRound(){
        this.playersIn = this.seats;
        this.deck.generateDeck();
        this.deck.shuffleDeck();

    }
    /*
        Tracks the player that is up to act.
    */
    public int nextAction(){
        if(this.playerTurn > this.playersIn.size()){
            Player currentPlayer = this.playersIn(this.playerTurn);
             this.playerTurn++;
             return this.playerTurn - 1;
        }
        this.playerTurn = 0;
        return nextAction();

    }

    /*
        Deal hand to all the players that are in
    */

    public boolean dealHands(){
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < this.playersIn.size(); j++){
                this.dealToPlayer();
            }
        }

    }

    /*
        Deal a single card to single player
    */

    public boolean dealToPlayer(){
        int currentPlayer = nextAction();
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
                this.dealBoard(flop);
                return true;
                break;
            case 1 : 
                Turn turn = new Turn();
                turn.addCard(deck.deal());
                this.cardRound++;
                this.dealBoard(turn);
                return true;
                break;
            case 2 : 
                River river = new River();
                river.addCard(deck.deal());
                this.cardRound++;
                this.dealBoard(river);
                return true;
                break;
            default : 
                return false;  
        }
    }


}