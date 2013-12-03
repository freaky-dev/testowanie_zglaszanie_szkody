
package com.damageReport.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "damagedVehicleData", namespace = "http://ws.damageReport.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "damagedVehicleData", namespace = "http://ws.damageReport.com/", propOrder = {
    "registrationNumber",
    "carBrand",
    "carModel",
    "carYearOfProduction",
    "carVINNumber",
    "firstRegistrationDate",
    "technicalExaminationDateFrom",
    "technicalExaminationDateTo"
})
public class DamagedVehicleData {

    @XmlElement(name = "registrationNumber", namespace = "")
    private String registrationNumber;
    @XmlElement(name = "carBrand", namespace = "")
    private String carBrand;
    @XmlElement(name = "carModel", namespace = "")
    private String carModel;
    @XmlElement(name = "carYearOfProduction", namespace = "")
    private String carYearOfProduction;
    @XmlElement(name = "carVINNumber", namespace = "")
    private String carVINNumber;
    @XmlElement(name = "firstRegistrationDate", namespace = "")
    private String firstRegistrationDate;
    @XmlElement(name = "technicalExaminationDateFrom", namespace = "")
    private String technicalExaminationDateFrom;
    @XmlElement(name = "technicalExaminationDateTo", namespace = "")
    private String technicalExaminationDateTo;

    /**
     * 
     * @return
     *     returns String
     */
    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    /**
     * 
     * @param registrationNumber
     *     the value for the registrationNumber property
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getCarBrand() {
        return this.carBrand;
    }

    /**
     * 
     * @param carBrand
     *     the value for the carBrand property
     */
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getCarModel() {
        return this.carModel;
    }

    /**
     * 
     * @param carModel
     *     the value for the carModel property
     */
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getCarYearOfProduction() {
        return this.carYearOfProduction;
    }

    /**
     * 
     * @param carYearOfProduction
     *     the value for the carYearOfProduction property
     */
    public void setCarYearOfProduction(String carYearOfProduction) {
        this.carYearOfProduction = carYearOfProduction;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getCarVINNumber() {
        return this.carVINNumber;
    }

    /**
     * 
     * @param carVINNumber
     *     the value for the carVINNumber property
     */
    public void setCarVINNumber(String carVINNumber) {
        this.carVINNumber = carVINNumber;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getFirstRegistrationDate() {
        return this.firstRegistrationDate;
    }

    /**
     * 
     * @param firstRegistrationDate
     *     the value for the firstRegistrationDate property
     */
    public void setFirstRegistrationDate(String firstRegistrationDate) {
        this.firstRegistrationDate = firstRegistrationDate;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getTechnicalExaminationDateFrom() {
        return this.technicalExaminationDateFrom;
    }

    /**
     * 
     * @param technicalExaminationDateFrom
     *     the value for the technicalExaminationDateFrom property
     */
    public void setTechnicalExaminationDateFrom(String technicalExaminationDateFrom) {
        this.technicalExaminationDateFrom = technicalExaminationDateFrom;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getTechnicalExaminationDateTo() {
        return this.technicalExaminationDateTo;
    }

    /**
     * 
     * @param technicalExaminationDateTo
     *     the value for the technicalExaminationDateTo property
     */
    public void setTechnicalExaminationDateTo(String technicalExaminationDateTo) {
        this.technicalExaminationDateTo = technicalExaminationDateTo;
    }

}
