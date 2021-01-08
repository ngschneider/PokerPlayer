import Cards.Hand;
import Chips.PlayerChipStack;

public class Player{

    private PlayerChipStack stack = null;
    private Hand hand = null;
    private String playerName = "UNDEFINED";
    private int preventStackDuplication = false;


    public Player(String name){
        this.playerName = name;
    }

    public String getPlayerName(){
        return this.playerName;
    }

    public void setStack(int chips){
        if(this.preventStackDuplication){
            this.preventStackDuplication = true;
            this.stack = new PlayerChipStack(chips);
        }

    }

    public setHand(Card cd){
        this.hand.addCard(cd);
    }


}