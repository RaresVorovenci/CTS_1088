package ro.ase.csie.cts.g1088.dp.singleton;

public class ConexiuneBD {

	String ip;
	String denumire;

	//eager
	//private static ConexiuneBD conexiune = new ConexiuneBD("10.0.01.","cts");
	
	private static ConexiuneBD conexiune = null;

	private ConexiuneBD() {

	}

	private ConexiuneBD(String ip, String denumire) {
		System.out.println("Se apeleaza constructorul");
		this.ip = ip;
		this.denumire = denumire;
	}

	//versiune lazy
	public static synchronized ConexiuneBD getConexiune() {
		if (conexiune == null)
			conexiune = new ConexiuneBD("10.0.0.1", "cts");
		return conexiune;
	}

}
