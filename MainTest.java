import Cards.Deck;
import Cards.Hand;

public class MainTest{
    public static void main(String []args){
        Deck deck = new Deck();
        Hand hand = new Hand();
        deck.generateDeck();
        System.out.println(deck.toString());
        deck.shuffleDeck();
        hand.addCard(deck.deal());
        hand.addCard(deck.deal());
        System.out.println(hand.toString());
        System.out.println(deck.toString());

        //System.out.println(deck.getNumberOfCards());
        //System.out.println(deck.toString());
        //System.out.println(deck.deal().toString());



    }
}