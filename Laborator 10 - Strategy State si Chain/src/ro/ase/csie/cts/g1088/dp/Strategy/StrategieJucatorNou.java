package ro.ase.csie.cts.g1088.dp.Strategy;

public class StrategieJucatorNou implements InterfataStrategieMarketing{
    @Override
    public void aplicaStrategieBonus(Jucator jucator) {
        if(jucator.getTotalOreJucate()>100){
            jucator.clasaJucator+=1;
        }
    }
}
