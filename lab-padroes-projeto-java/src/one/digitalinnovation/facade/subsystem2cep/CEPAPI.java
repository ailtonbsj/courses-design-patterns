package one.digitalinnovation.facade.subsystem2cep;

public class CEPAPI {
	private static CEPAPI instance = new CEPAPI();
	
	private CEPAPI() {
		super();
	}
	
	public static CEPAPI getInstance() {
		return instance;
	}
	
	public String getCity(String cep) {
		return "Icó";
	}
	
	public String getUF(String cep) {
		return "CE";
	}
}
