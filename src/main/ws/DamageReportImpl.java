package main.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService(endpointInterface = "main.ws.DamageReport")
public class DamageReportImpl implements DamageReport{

	@Override
	public int informacje_o_zgloszeniu(String damagedPropertType, String damageType,
			String policyNumber) {
		
		return 0;
	}

	@Override
	public void informacje_o_szkodzie(String damageDate, String damageLocalization,
			String damageCause, String damageDescription,
			boolean wasReportedInThirdParty) {

		
	}

	@Override
	public void dane_osoby_zglaszajacej_szkode(String firstName, String lastName,
			String phoneNumber, String email, String province, String zipCode,
			String city, String street, String boulding, String house) {
		
	}

	@Override
	public void dane_wlasciciela_pojazdu_poszkodowanego(int numberOfOwners,
			String pesel) {
		
	}

	@Override
	public void dane_pojazdu_poszkodowanego(String registrationNumber,
			String carBrand, String carModel, String carYearOfProduction,
			String carVINNumber, String firstRegistrationDate,
			String technicalExaminationDateFrom,
			String technicalExaminationDateTo) {
		
	}

	@Override
	public void potwierdzenie() {


	}



}
