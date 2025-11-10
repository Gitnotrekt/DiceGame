package hsd.inflab.dice;

public class MultisidedDice extends Dice {
    final protected int startingNum = 1;
    final protected int maxSides;

    public MultisidedDice(int sides) {
        if (sides >= 20) {
            this.maxSides = 20;
        } else if (sides <= 4) {
            this.maxSides = 4;
        } else{
            this.maxSides = sides;
        }
    }
    public int roll() {
        return getRandomNumber(this.startingNum, this.maxSides);
    }
}