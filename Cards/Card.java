package Cards;

/*
    Object Represents a playing card
*/
public class Card {
    private int cardNumber = -1;
    private int suit = -1;
    
    public Card(int cardNumber, int suit){
        this.cardNumber = cardNumber;
        this.suit = suit;
    }

    public int getCardNumber(){
        return this.cardNumber;
    }

    public int getSuit(){
        return this.suit;
    }

    private String getSuite(){
        switch(this.suit){
            case -1 : 
                return "[Suit not initiated]";
            case 1 : 
                return "Heart";
            case 2 : 
                return "Diamond";
            case 3 : 
                return "Spade";
            case 4 : 
                return "Clubs";
            default : 
                return "[INVALID SUIT NUMBER]";
        }
    }
    
    private String getFaceCard(){
        switch(this.cardNumber){
            case -1 : 
                return "[Card number not initated]";
            case 11 : 
                return "Jack";
            case 12 : 
                return "Queen";
            case 13 : 
                return "King";
            case 14 : 
                return "Ace";
            default : 
                return "" + this.cardNumber;
        }

    }

    public String toString(){
        return "[" + this.getFaceCard() + ", " + this.getSuite() + "]";
    }
}