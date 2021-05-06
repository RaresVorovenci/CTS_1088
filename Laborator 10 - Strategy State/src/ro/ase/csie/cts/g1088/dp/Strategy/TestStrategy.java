package ro.ase.csie.cts.g1088.dp.Strategy;

public class TestStrategy {
    public static void main(String[] args) {
        Jucator jucator= new Jucator(100,"Gigel",7);
        jucator.setStrategieMk(new StrategieJucatorNou());

        jucator.acordaPuncteBonus();

        jucator.setStrategieMk(new StrategieZiuaCopilului());

        jucator.acordaPuncteBonus();
    }
}