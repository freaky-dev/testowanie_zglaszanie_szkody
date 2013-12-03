
package com.damageReport.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "personReportingDamageData", namespace = "http://ws.damageReport.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personReportingDamageData", namespace = "http://ws.damageReport.com/", propOrder = {
    "firstName",
    "lastName",
    "phoneNumber",
    "email",
    "province",
    "zipCode",
    "city",
    "street",
    "boulding",
    "house"
})
public class PersonReportingDamageData {

    @XmlElement(name = "firstName", namespace = "")
    private String firstName;
    @XmlElement(name = "lastName", namespace = "")
    private String lastName;
    @XmlElement(name = "phoneNumber", namespace = "")
    private String phoneNumber;
    @XmlElement(name = "email", namespace = "")
    private String email;
    @XmlElement(name = "province", namespace = "")
    private String province;
    @XmlElement(name = "zipCode", namespace = "")
    private String zipCode;
    @XmlElement(name = "city", namespace = "")
    private String city;
    @XmlElement(name = "street", namespace = "")
    private String street;
    @XmlElement(name = "boulding", namespace = "")
    private String boulding;
    @XmlElement(name = "house", namespace = "")
    private String house;

    /**
     * 
     * @return
     *     returns String
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * 
     * @param firstName
     *     the value for the firstName property
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * 
     * @param lastName
     *     the value for the lastName property
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * 
     * @param phoneNumber
     *     the value for the phoneNumber property
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * 
     * @param email
     *     the value for the email property
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * 
     * @param province
     *     the value for the province property
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getZipCode() {
        return this.zipCode;
    }

    /**
     * 
     * @param zipCode
     *     the value for the zipCode property
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getCity() {
        return this.city;
    }

    /**
     * 
     * @param city
     *     the value for the city property
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getStreet() {
        return this.street;
    }

    /**
     * 
     * @param street
     *     the value for the street property
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getBoulding() {
        return this.boulding;
    }

    /**
     * 
     * @param boulding
     *     the value for the boulding property
     */
    public void setBoulding(String boulding) {
        this.boulding = boulding;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getHouse() {
        return this.house;
    }

    /**
     * 
     * @param house
     *     the value for the house property
     */
    public void setHouse(String house) {
        this.house = house;
    }

}
