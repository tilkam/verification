
package com.example.verificationInera.data.clinicalprocess.healthcond.description._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for HealthcareProfessionalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HealthcareProfessionalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authorTime" type="{urn:riv:clinicalprocess:healthcond:description:2}TimeStampType"/&gt;
 *         &lt;element name="healthcareProfessionalHSAId" type="{urn:riv:clinicalprocess:healthcond:description:2}HSAIdType" minOccurs="0"/&gt;
 *         &lt;element name="healthcareProfessionalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="healthcareProfessionalRoleCode" type="{urn:riv:clinicalprocess:healthcond:description:2}CVType" minOccurs="0"/&gt;
 *         &lt;element name="healthcareProfessionalOrgUnit" type="{urn:riv:clinicalprocess:healthcond:description:2}OrgUnitType" minOccurs="0"/&gt;
 *         &lt;element name="healthcareProfessionalCareUnitHSAId" type="{urn:riv:clinicalprocess:healthcond:description:2}HSAIdType" minOccurs="0"/&gt;
 *         &lt;element name="healthcareProfessionalCareGiverHSAId" type="{urn:riv:clinicalprocess:healthcond:description:2}HSAIdType" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthcareProfessionalType", propOrder = {
    "authorTime",
    "healthcareProfessionalHSAId",
    "healthcareProfessionalName",
    "healthcareProfessionalRoleCode",
    "healthcareProfessionalOrgUnit",
    "healthcareProfessionalCareUnitHSAId",
    "healthcareProfessionalCareGiverHSAId",
    "any"
})
public class HealthcareProfessionalType {

    @XmlElement(required = true)
    protected String authorTime;
    protected String healthcareProfessionalHSAId;
    protected String healthcareProfessionalName;
    protected CVType healthcareProfessionalRoleCode;
    protected OrgUnitType healthcareProfessionalOrgUnit;
    protected String healthcareProfessionalCareUnitHSAId;
    protected String healthcareProfessionalCareGiverHSAId;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the authorTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorTime() {
        return authorTime;
    }

    /**
     * Sets the value of the authorTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorTime(String value) {
        this.authorTime = value;
    }

    /**
     * Gets the value of the healthcareProfessionalHSAId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthcareProfessionalHSAId() {
        return healthcareProfessionalHSAId;
    }

    /**
     * Sets the value of the healthcareProfessionalHSAId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthcareProfessionalHSAId(String value) {
        this.healthcareProfessionalHSAId = value;
    }

    /**
     * Gets the value of the healthcareProfessionalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthcareProfessionalName() {
        return healthcareProfessionalName;
    }

    /**
     * Sets the value of the healthcareProfessionalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthcareProfessionalName(String value) {
        this.healthcareProfessionalName = value;
    }

    /**
     * Gets the value of the healthcareProfessionalRoleCode property.
     * 
     * @return
     *     possible object is
     *     {@link CVType }
     *     
     */
    public CVType getHealthcareProfessionalRoleCode() {
        return healthcareProfessionalRoleCode;
    }

    /**
     * Sets the value of the healthcareProfessionalRoleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVType }
     *     
     */
    public void setHealthcareProfessionalRoleCode(CVType value) {
        this.healthcareProfessionalRoleCode = value;
    }

    /**
     * Gets the value of the healthcareProfessionalOrgUnit property.
     * 
     * @return
     *     possible object is
     *     {@link OrgUnitType }
     *     
     */
    public OrgUnitType getHealthcareProfessionalOrgUnit() {
        return healthcareProfessionalOrgUnit;
    }

    /**
     * Sets the value of the healthcareProfessionalOrgUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgUnitType }
     *     
     */
    public void setHealthcareProfessionalOrgUnit(OrgUnitType value) {
        this.healthcareProfessionalOrgUnit = value;
    }

    /**
     * Gets the value of the healthcareProfessionalCareUnitHSAId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthcareProfessionalCareUnitHSAId() {
        return healthcareProfessionalCareUnitHSAId;
    }

    /**
     * Sets the value of the healthcareProfessionalCareUnitHSAId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthcareProfessionalCareUnitHSAId(String value) {
        this.healthcareProfessionalCareUnitHSAId = value;
    }

    /**
     * Gets the value of the healthcareProfessionalCareGiverHSAId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthcareProfessionalCareGiverHSAId() {
        return healthcareProfessionalCareGiverHSAId;
    }

    /**
     * Sets the value of the healthcareProfessionalCareGiverHSAId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthcareProfessionalCareGiverHSAId(String value) {
        this.healthcareProfessionalCareGiverHSAId = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
