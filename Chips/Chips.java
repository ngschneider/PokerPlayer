package Chips;

public class Chips {

    private int chipCount = 0;

    public Chips(int chips){
        this.chipCount = chips;
    }

    public void addChips(Chips chips){
        this.chipCount += chips.getChipCount(chips);
    }

    public Chips getChips(int chipAmount){
        this.chipCount -= chipAmount;
        return new Chips(chipAmount);
    }

    private int getChipCount(Chips chip){
        return this.chipCount;
    }

}
