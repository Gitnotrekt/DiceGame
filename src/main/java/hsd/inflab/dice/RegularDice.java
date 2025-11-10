package hsd.inflab.dice;

public class RegularDice extends Dice {
    public int roll() {
        int startingNum = 1;
        int maxSides = 6;
        return getRandomNumber(startingNum, maxSides);
    }
}