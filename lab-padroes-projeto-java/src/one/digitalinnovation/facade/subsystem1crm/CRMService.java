package one.digitalinnovation.facade.subsystem1crm;

public class CRMService {
	private CRMService() {
		super();
	}
	
	public static void recordClient(String name, String cep, String city, String uf) {
		System.out.println("Client saved in CRM System.");
		System.out.println("[" + name + ", " + cep + ", " + city + ", " + uf + "]");
	}
}
