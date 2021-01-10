
/*
    Determines if a Card Group of 5 is a staight.
*/

public class Straight{

    private CardGroup cardGroup;
    private boolean isStraight = false;
    private int highestNum = -1;

    public Straight(CardGroup cg){
        this.cardGroup = cg;
        this.cardGroup.setMaxAndMin(5,5);
    }

    public boolean isStaight(){return true;}


    public int compare(Straight st1,Straight st2){return 1;}

}