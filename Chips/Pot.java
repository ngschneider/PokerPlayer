package Chips;

public class Pot extends Chips{

    public Pot(){
        super(0);
    }

    public void addBet(Bet bet){
        this.addChips(bet);
    }

    public Pot distributePot(){
        return null;
    }

    
}
