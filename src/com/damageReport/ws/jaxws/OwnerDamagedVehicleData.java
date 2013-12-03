
package com.damageReport.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ownerDamagedVehicleData", namespace = "http://ws.damageReport.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ownerDamagedVehicleData", namespace = "http://ws.damageReport.com/", propOrder = {
    "numberOfOwners",
    "pesel"
})
public class OwnerDamagedVehicleData {

    @XmlElement(name = "numberOfOwners", namespace = "")
    private int numberOfOwners;
    @XmlElement(name = "pesel", namespace = "")
    private String pesel;

    /**
     * 
     * @return
     *     returns int
     */
    public int getNumberOfOwners() {
        return this.numberOfOwners;
    }

    /**
     * 
     * @param numberOfOwners
     *     the value for the numberOfOwners property
     */
    public void setNumberOfOwners(int numberOfOwners) {
        this.numberOfOwners = numberOfOwners;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getPesel() {
        return this.pesel;
    }

    /**
     * 
     * @param pesel
     *     the value for the pesel property
     */
    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

}
