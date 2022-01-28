package one.digitalinnovation.facade;

import one.digitalinnovation.facade.subsystem1crm.CRMService;
import one.digitalinnovation.facade.subsystem2cep.CEPAPI;

public class Facade {
	public Facade() {
		super();
	}
	
	public void migrateClient(String name, String cep) {
		String city = CEPAPI.getInstance().getCity(cep);
		String uf = CEPAPI.getInstance().getUF(cep);
		CRMService.recordClient(name, cep, city, uf);
	}
}
