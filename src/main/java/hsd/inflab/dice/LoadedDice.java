package hsd.inflab.dice;

public class LoadedDice extends Dice {
    public int roll() {
        int startingNum = 1;
        int maxSides = 6;
        if (getRandomNumber(0, 1) == 1) {
            return maxSides; 
        } else {
            return(getRandomNumber(startingNum, (maxSides - 1)));
        }
    }
}