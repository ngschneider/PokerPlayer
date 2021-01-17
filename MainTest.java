import Cards.*;
import Cards.Evaluator.*;
import Cards.Evaluator.ThreeOfAKind;

public class MainTest{
    public static void main(String []args){
       // Deck deck = new Deck();
       // Hand hand = new Hand();
       // deck.generateDeck();
      //  System.out.println(deck.toString());
       // deck.shuffleDeck();
       // hand.addCard(deck.deal());
      //  hand.addCard(deck.deal());
       // System.out.println(hand.toString());
       // System.out.println(deck.toString());
        //System.out.println(deck.getNumberOfCards());
        //System.out.println(deck.toString());
        //System.out.println(deck.deal().toString());









        //**********EVALUATOR TEST*****************


        Card cd1 = new Card(2,1);Card cd2 = new Card(3,1);
        Card cd3 = new Card(4,1);Card cd4 = new Card(5,1);
        Card cd5 = new Card(6,1); Card cd6 = new Card(7,2);
        Card cd7 = new Card(8,2);Card cd8 = new Card(9,2);
        Card cd9 = new Card(10,2); Card cd10 = new Card(11,2);
        Card cd11 = new Card(2,2); Card cd12 = new Card(2,3); 
         Card cd13 = new Card(2,4); Card cd21 = new Card(3,2);

        Board board = new Board();
        Flop flop = new Flop();
        Turn turn = new Turn();
        River river = new River();
        
        flop.addCard(cd1);
        flop.addCard(cd2);
        flop.addCard(cd3);
        turn.addCard(cd4);
        river.addCard(cd5);

        board.dealBoard(flop);
        board.dealBoard(turn);
        board.dealBoard(river);

        Hand hd = new Hand();
        hd.addCard(cd12);
        hd.addCard(cd6);

        CardEvaluator eval = new CardEvaluator(board);
        eval.evaluateHand(hd);



        







    }
}