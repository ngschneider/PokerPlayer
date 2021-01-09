
import Cards.Hand;
import Cards.Card;
import Chips.PlayerChipStack;
import Actions.*;


public class Player{

    private PlayerChipStack stack = null;
    private Hand hand = new Hand();
    private String playerName = "UNDEFINED";
    private boolean preventStackDuplication = true;
    private int playerType = 0; // 0 for CPU, 1 for irl player


    public Player(String name){
        this.playerName = name;
    }

    public Player(String name, int type){
        this.playerName = name;
        this.playerType = type;
    }
    
    public Action decide(int callAmount){

        if(this.playerType == 1){

            PlayerEngine play = new PlayerEngine();
            int act = play.start();

            switch(act){
                case 0 : 
                    return new Fold();
                case 1 : 
                    return new Call(this.stack.makeBet(callAmount));
                case 2 :
                    int raised = play.getRaise();
                    return new Raise(new Call(this.stack.makeBet(callAmount)),
                    this.stack.makeBet(raised));
                case 3 : 
                    return new Check();
                default :
                    return null;
            }

        }else{

            CPUEngine cpu = new CPUEngine();
            int act = cpu.start();
            switch(act){
                case 0 : 
                    return new Fold();
                case 1 : 
                    return new Call(this.stack.makeBet(callAmount));
                case 2 :
                    int raised = (int) (callAmount * 1.25);
                    return new Raise(new Call(this.stack.makeBet(callAmount)),
                    this.stack.makeBet(raised));
                case 3 : 
                    return new Check();
                default :
                    return null;
            }
        }
    }

    public void setStack(int chips){
        if(this.preventStackDuplication){
            this.preventStackDuplication = false;
            this.stack = new PlayerChipStack(chips);
        }

    }

    public void setHand(Card cd){
        this.hand.addCard(cd);
    }

    public String getPlayerName(){
        return this.playerName;
    }

    public int getStack(){
        return this.stack.getCount();
    }

    public String toString(){
        return "" + this.getPlayerName() 
        + "=> " + this.stack.toString() 
            +  this.hand.toString();
    }

}