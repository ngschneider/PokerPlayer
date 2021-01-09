package Actions;

public class Call extends Action{
    private int betAmount = -1;

    public Call(int betAmount){
        super("Call");
    }
    public int getBetAmount(){
        return this.betAmount;
    }
    public String callToString(){
        return this.toString() + " for " + this.getBetAmount();
    }
}
