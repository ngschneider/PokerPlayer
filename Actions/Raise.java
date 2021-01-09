package Actions;

import Chips.*;
public class Raise extends Action{

    private Call currentBet;
    private Bet bet;

    public Raise(Call call, Bet bet){
        super("Raise");
        this.currentBet = call;
        this.bet = bet; 
    }
    public int getRaise(){
        return this.currentBet.getBetAmount() + this.bet.getCount();
    }

    public String raiseToString(){
        return "Raised to " +  this.getRaise();
    }
}
