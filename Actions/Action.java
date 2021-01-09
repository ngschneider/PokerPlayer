package Actions;


public class Action {

    private String action = "[UNDEFINED]";

    public Action(String action){
        this.action = action;
    }

    public String getAction(){
        return this.action;
    }

    public String toString(){
        return "" + this.action;
    }


}