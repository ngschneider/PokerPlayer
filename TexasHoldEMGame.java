public class TexasHoldEMGame{
    public static void main(String []args){
        TexasHoldEM texas = new TexasHoldEM();
        texas.addPlayer("Nolan", 1000);
        texas.addPlayer("Curtis", 1000);
        texas.addPlayer("Grant", 10020);
        texas.newRound();
        texas.dealHands();
        System.out.println(texas.toString());
       


    }
    

}