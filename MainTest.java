import Cards.Deck;

public class MainTest{
    public static void main(String []args){
        Deck deck = new Deck();
        deck.generateDeck();
        System.out.println(deck.toString());
        deck.shuffleDeck();
        deck.deal();
        deck.deal();
        deck.deal();

        System.out.println(deck.toString());

        //System.out.println(deck.getNumberOfCards());
        //System.out.println(deck.toString());
        //System.out.println(deck.deal().toString());



    }
}