
package com.damageReport.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "damageInformation", namespace = "http://ws.damageReport.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "damageInformation", namespace = "http://ws.damageReport.com/", propOrder = {
    "damageDate",
    "damageLocalization",
    "damageCause",
    "damageDescription",
    "wasReportedInThirdParty"
})
public class DamageInformation {

    @XmlElement(name = "damageDate", namespace = "")
    private String damageDate;
    @XmlElement(name = "damageLocalization", namespace = "")
    private String damageLocalization;
    @XmlElement(name = "damageCause", namespace = "")
    private String damageCause;
    @XmlElement(name = "damageDescription", namespace = "")
    private String damageDescription;
    @XmlElement(name = "wasReportedInThirdParty", namespace = "")
    private boolean wasReportedInThirdParty;

    /**
     * 
     * @return
     *     returns String
     */
    public String getDamageDate() {
        return this.damageDate;
    }

    /**
     * 
     * @param damageDate
     *     the value for the damageDate property
     */
    public void setDamageDate(String damageDate) {
        this.damageDate = damageDate;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getDamageLocalization() {
        return this.damageLocalization;
    }

    /**
     * 
     * @param damageLocalization
     *     the value for the damageLocalization property
     */
    public void setDamageLocalization(String damageLocalization) {
        this.damageLocalization = damageLocalization;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getDamageCause() {
        return this.damageCause;
    }

    /**
     * 
     * @param damageCause
     *     the value for the damageCause property
     */
    public void setDamageCause(String damageCause) {
        this.damageCause = damageCause;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getDamageDescription() {
        return this.damageDescription;
    }

    /**
     * 
     * @param damageDescription
     *     the value for the damageDescription property
     */
    public void setDamageDescription(String damageDescription) {
        this.damageDescription = damageDescription;
    }

    /**
     * 
     * @return
     *     returns boolean
     */
    public boolean isWasReportedInThirdParty() {
        return this.wasReportedInThirdParty;
    }

    /**
     * 
     * @param wasReportedInThirdParty
     *     the value for the wasReportedInThirdParty property
     */
    public void setWasReportedInThirdParty(boolean wasReportedInThirdParty) {
        this.wasReportedInThirdParty = wasReportedInThirdParty;
    }

}
