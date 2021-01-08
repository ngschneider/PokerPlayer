import java.util.ArrayList;

public class seats {

    private ArrayList<Player> playerList = new ArrayList<Player>();
    private int MAX_SEATS = -1;

    public seats(int maxSeats){
        this.MAX_SEATS = maxSeats;
    }

    public boolean addPlayer(String name,int startingStack){
        maintainSeatMax();
        Player newPlayer = new Player(name);
        newPlayer.setStack(startingStack);
        this.playerList.add(newPlayer);

    }

    public boolean deletePlayer(String name){
        int index = 0;
        for (Player player : this.playerList) {
                if(player.getPlayerName().equals(name)){
                    this.playerList.remove(index);
                    return true;
                }
                index++;
        }
        return false;
    }
    private void maintainSeatMax(){

        if( (this.MAX_SEATS != -1 ) && (this.playerList.size() >= this.MAX_SEATS) ) 
            throw new Error("MAXIMUM CARD LIMIT REACHED");
    }


}