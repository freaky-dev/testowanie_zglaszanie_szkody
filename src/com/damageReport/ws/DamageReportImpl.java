package com.damageReport.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService(endpointInterface = "com.damageReport.ws.DamageReport")
public class DamageReportImpl implements DamageReport{

	@Override
	public int reportInformation(String damagedPropertType, String damageType,
			String policyNumber) {
		
		return 0;
	}

	@Override
	public void damageInformation(String damageDate, String damageLocalization,
			String damageCause, String damageDescription,
			boolean wasReportedInThirdParty) {

		
	}

	@Override
	public void personReportingDamageData(String firstName, String lastName,
			String phoneNumber, String email, String province, String zipCode,
			String city, String street, String boulding, String house) {
		
	}

	@Override
	public void ownerDamagedVehicleData(int numberOfOwners,
			String pesel) {
		
	}

	@Override
	public void damagedVehicleData(String registrationNumber,
			String carBrand, String carModel, String carYearOfProduction,
			String carVINNumber, String firstRegistrationDate,
			String technicalExaminationDateFrom,
			String technicalExaminationDateTo) {
		
	}

	@Override
	public void confirmation() {


	}



}
