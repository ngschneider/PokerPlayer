package PokerPlayer;

public class Position {

    private int dealer = -1;
    private int bigBlind = -1;
    private int smallBlind = -1;
    private int tableSize = 2;
    private int playerTurn = -1;


    public Position(){
        this.dealer = 0;
        this.bigBlind = 1;
        this.smallBlind = 2;
        this.playerTurn = this.bigBlind;
    }
        /*
        Tracks the player that is up to act.
    */
    public int nextAction(){

        if(tableSize < 2) throw new Error("Less than 2 players at the table!");

        if(this.playerTurn  <= tableSize - 1) {
             this.playerTurn++;
             return this.playerTurn - 1;
        }
        this.playerTurn = 0;
        return this.nextAction();

    }
    public void newGameRound(){       
        this.dealer++;
        this.bigBlind++;
        this.smallBlind++;
        
        if(this.dealer > tableSize -1 ){
            this.dealer=0;
        }
        if(this.bigBlind > tableSize -1 ){
            this.bigBlind=0;

        }
        if(this.smallBlind > tableSize -1 ){
            this.smallBlind=0;
        }
    }

        public int getDealer(){
            return this.dealer;

        }
        public int getBigBlind(){
            return this.bigBlind;
        }
        public int getSmallBlind(){
            return this.smallBlind;
        }


    public int getTableSize(){
        return this.tableSize;
    }


    public void updateSizeOfTable(int tableSize){
        this.tableSize = tableSize;
    }
}
