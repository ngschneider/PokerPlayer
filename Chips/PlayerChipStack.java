package Chips;

import Chips.Bet;

public class PlayerChipStack extends Chips{

    private int startingStack = -1;

    public PlayerChipStack(int startingStack){
        super(startingStack);
        this.startingStack = startingStack;
    }

    public Bet makeBet(int amount){
        return new Bet(getChips(amount));
    }

}
