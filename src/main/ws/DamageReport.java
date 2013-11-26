package main.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;


//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL)
public interface DamageReport {

		
	@WebMethod int informacje_o_zgloszeniu(String damagedPropertType, String damageType, String policyNumber);
	
	@WebMethod void informacje_o_szkodzie(String damageDate, String damageLocalization, String damageCause, String damageDescription, boolean wasReportedInThirdParty );
	
	@WebMethod void dane_osoby_zglaszajacej_szkode(String firstName, String lastName, String phoneNumber, String email, String province, String zipCode, String city, String street, String boulding, String house);
	
	@WebMethod void dane_wlasciciela_pojazdu_poszkodowanego(int numberOfOwners, String pesel);

	@WebMethod void dane_pojazdu_poszkodowanego(String registrationNumber, String carBrand, String carModel, String carYearOfProduction, String carVINNumber, String firstRegistrationDate, String technicalExaminationDateFrom, String technicalExaminationDateTo);
	
	@WebMethod void potwierdzenie();
	
	
	
}
