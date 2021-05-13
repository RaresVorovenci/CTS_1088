package ro.ase.csie.cts.g1088.dp.Strategy;

public class Jucator {
   
	int totalOreJucate;
    String nume;
    int clasaJucator;

    InterfataStrategieMarketing strategieMk=null;

    public Jucator(int totalOreJucate, String nume, int clasaJucator) {
        this.totalOreJucate = totalOreJucate;
        this.nume = nume;
        this.clasaJucator = clasaJucator;
    }

    public void acordaPuncteBonus(){
      if(this.strategieMk!=null){
          this.strategieMk.aplicaStrategieBonus(this);
      }
      else
          throw new UnsupportedOperationException();
    }

    public int getTotalOreJucate() {
        return totalOreJucate;
    }

    public String getNume() {
        return nume;
    }



    public int getClasaJucator() {
        return clasaJucator;
    }



    public void setStrategieMk(InterfataStrategieMarketing strategieMk) {
        this.strategieMk = strategieMk;
    }
	
}
