package ro.ase.csie.cts.g1088.dp.factory.method;

public class FactoryModNormal extends FactoryAbstractCaractere{

	@Override
	public CaracterJoc getCaracterJoc(TipCaracter tip, String nume) {
		CaracterJoc caracter = null;
		switch(tip) {
		case DISNEY:
			caracter=new CaracterDisney("Donald");
			break;
		case MARVEL :
			caracter = new CaracterMarvel("Superman",300);
			break;
			
		case DC:
			caracter = new CaracterDcComics("Batman");
			break;	
		}
		return caracter;
	}
	
	

}
