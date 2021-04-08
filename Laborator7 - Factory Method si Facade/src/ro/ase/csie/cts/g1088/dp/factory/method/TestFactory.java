package ro.ase.csie.cts.g1088.dp.factory.method;

public class TestFactory {

	public static void main(String[] args) {

		boolean isModJoc4Kids = true;

		if (isModJoc4Kids) {
			// dezvoltare daor cu caracter 4Kids
		} else {
			// dezvoltare daor cu caractere normale

		}

		FactoryAbstractCaractere facCaractere = null;
		facCaractere = (isModJoc4Kids) ? new FactoryMod4Kids() : new FactoryModNormal();

		CaracterJoc superman = facCaractere.getCaracterJoc(TipCaracter.MARVEL, "Superman");

	}

}
