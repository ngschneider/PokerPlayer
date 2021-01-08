import java.util.ArrayList;

public class Deck extends CardGroup {
    private final int MAX_CARDS = 52;
    private final int MIN_CARDS = 0;
    
    public Deck(){
        super();
        this.setMaxAndMin(this.MAX_CARDS, this.MIN_CARDS);
    }

    public void shuffleDeck(){

        ArrayList<Card> currentDeck = this.getCards();
        ArrayList<Card> shuffledDeck = new ArrayList<Card>();

        for(int i = this.getNumberOfCards(); i >= 1; i--){
            shuffledDeck.add(currentDeck.remove(random(0,i)));
        }
        this.updateCardGroup(shuffledDeck);

    }
    public Card deal(){
        ArrayList<Card> currentDeck = this.getCards();
        Card dealtCard = currentDeck.remove(0);
        this.updateCardGroup(currentDeck);
        return dealtCard;
    }
    
    public void generateDeck(){
        for(int i = 2; i <= 14; i++){
            for(int j = 1; j <= 4; j++){
                this.addCard(new Card(i,j));
            }
        }
    }
    private int random(int max,int min){
        return (int) ( Math.random() * (max - min) + min);
    }

}