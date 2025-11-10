package hsd.inflab.dice;

public class Main {
    public static void main(String[] args) {
        Shaker shaker = new Shaker();
        //shaker.addDice();

        shaker.addDice(new RegularDice());

        shaker.addDice(new MultisidedDice(16));

        shaker.addDice(new LoadedDice());

        shaker.addDice(new ChaosDice());
        //MultisidedDice  multidice = new RegularDice();  //example
// TODO: ERKLÄRUNGEN FÜR DIE VERSCHIEDENEN WÜRFEL:
//        RegularDice dice1 = new Dice(); Geht nicht, weil RegularDice eine Unterklasse
//        ChaosDice dice2 = new RegularDice();
//        MultisidedDice dice3 = new RegularDice();
        Dice dice4 = new ChaosDice();
//        Shaker dice5 = new LoadedDice();
        LoadedDice dice6 = new LoadedDice();
        shaker.addDice(dice4);
        shaker.addDice(dice6);

        while(true) {
            shaker.throwDice();
        }
    }
}
