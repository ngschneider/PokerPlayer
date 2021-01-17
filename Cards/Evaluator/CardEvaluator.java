import Cards.Board;
import Cards.Card;
import Cards.Hand;
import Cards.Evaluator.*;

/*

Evaluate a hand object and a board object.

*/

public class CardEvaluator{

    Board board;

    public CardEvaluator(Board board){
        this.board = board;
    }

    public void evaluateHand(Hand hd){
        this.testPair(hd);
    }

    public void compareHands(Hand hd1, Hand hd2){

    }
    private void testPair(Hand hd){
        for(Card cd1 : hd.getCards()){
            for(Card cd2 : this.board.getCards()){
                if(new Pair(cd1,cd2).isPair()){
                    System.out.println("Pair found!"); 
                }
            }
        }
    }
}