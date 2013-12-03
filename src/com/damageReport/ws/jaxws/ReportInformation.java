
package com.damageReport.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "reportInformation", namespace = "http://ws.damageReport.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reportInformation", namespace = "http://ws.damageReport.com/", propOrder = {
    "damagedPropertType",
    "damageType",
    "policyNumber"
})
public class ReportInformation {

    @XmlElement(name = "damagedPropertType", namespace = "")
    private String damagedPropertType;
    @XmlElement(name = "damageType", namespace = "")
    private String damageType;
    @XmlElement(name = "policyNumber", namespace = "")
    private String policyNumber;

    /**
     * 
     * @return
     *     returns String
     */
    public String getDamagedPropertType() {
        return this.damagedPropertType;
    }

    /**
     * 
     * @param damagedPropertType
     *     the value for the damagedPropertType property
     */
    public void setDamagedPropertType(String damagedPropertType) {
        this.damagedPropertType = damagedPropertType;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getDamageType() {
        return this.damageType;
    }

    /**
     * 
     * @param damageType
     *     the value for the damageType property
     */
    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getPolicyNumber() {
        return this.policyNumber;
    }

    /**
     * 
     * @param policyNumber
     *     the value for the policyNumber property
     */
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

}
