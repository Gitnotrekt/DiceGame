package hsd.inflab.dice;

public class ChaosDice extends Dice {

    public int roll() {
        int startingNum = 1;
        int minSides = 4;
        int maxSides = 20;
        int actualSides = getRandomNumber(minSides, maxSides);
        return(getRandomNumber(startingNum, actualSides));
    }
}