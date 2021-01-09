package Actions;

import Chips.Bet;
public class Call extends Action{
    private Bet betAmount;

    public Call(Bet bet){
        super("Call");
    }
    public int getBetAmount(){
        return  this.betAmount.getCount();
    }
    public String callToString(){
        return this.toString() + " for " + this.getBetAmount();
    }
}
