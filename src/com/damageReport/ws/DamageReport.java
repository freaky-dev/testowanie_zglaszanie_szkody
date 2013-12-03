package com.damageReport.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.WebParam;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface DamageReport {

	@WebMethod
	int reportInformation(
			@WebParam(name = "damagedPropertType") String damagedPropertType,
			@WebParam(name = "damageType") String damageType,
			@WebParam(name = "policyNumber") String policyNumber);

	@WebMethod
	void damageInformation(
			@WebParam(name = "damageDate") String damageDate,
			@WebParam(name = "damageLocalization") String damageLocalization,
			@WebParam(name = "damageCause") String damageCause,
			@WebParam(name = "damageDescription") String damageDescription,
			@WebParam(name = "wasReportedInThirdParty") boolean wasReportedInThirdParty);

	@WebMethod
	void personReportingDamageData(
			@WebParam(name = "firstName") String firstName,
			@WebParam(name = "lastName") String lastName,
			@WebParam(name = "phoneNumber") String phoneNumber,
			@WebParam(name = "email") String email,
			@WebParam(name = "province") String province,
			@WebParam(name = "zipCode") String zipCode,
			@WebParam(name = "city") String city,
			@WebParam(name = "street") String street,
			@WebParam(name = "boulding") String boulding,
			@WebParam(name = "house") String house);

	@WebMethod
	void ownerDamagedVehicleData(
			@WebParam(name = "numberOfOwners") int numberOfOwners,
			@WebParam(name = "pesel") String pesel);

	@WebMethod
	void damagedVehicleData(
			@WebParam(name = "registrationNumber") String registrationNumber,
			@WebParam(name = "carBrand") String carBrand,
			@WebParam(name = "carModel") String carModel,
			@WebParam(name = "carYearOfProduction") String carYearOfProduction,
			@WebParam(name = "carVINNumber") String carVINNumber,
			@WebParam(name = "firstRegistrationDate") String firstRegistrationDate,
			@WebParam(name = "technicalExaminationDateFrom") String technicalExaminationDateFrom,
			@WebParam(name = "technicalExaminationDateTo") String technicalExaminationDateTo);

	@WebMethod
	void confirmation();

}
