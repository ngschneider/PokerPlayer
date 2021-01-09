package Actions;

public class Raise extends Action{

    private int currentBet = -1;
    private int bet = -1;
    public Raise(int currentBet, int bet){
        super("Raise");
        this.currentBet = currentBet;
        this.bet = bet; 
    }
    public int getRaise(){
        return this.currentBet - this.bet;
    }

    public int getBet(){
        return this.bet;
    }

    public String raiseToString(){
        return "Raised to " +  this.getBet() + " from " + this.currentBet;
    }
}
