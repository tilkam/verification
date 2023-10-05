
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
 * <p>Java class for OrgUnitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrgUnitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orgUnitHSAId" type="{urn:riv:clinicalprocess:healthcond:description:2}HSAIdType"/&gt;
 *         &lt;element name="orgUnitName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orgUnitTelecom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgUnitEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgUnitAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgUnitLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "OrgUnitType", propOrder = {
    "orgUnitHSAId",
    "orgUnitName",
    "orgUnitTelecom",
    "orgUnitEmail",
    "orgUnitAddress",
    "orgUnitLocation",
    "any"
})
public class OrgUnitType {

    @XmlElement(required = true)
    protected String orgUnitHSAId;
    @XmlElement(required = true)
    protected String orgUnitName;
    protected String orgUnitTelecom;
    protected String orgUnitEmail;
    protected String orgUnitAddress;
    protected String orgUnitLocation;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the orgUnitHSAId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgUnitHSAId() {
        return orgUnitHSAId;
    }

    /**
     * Sets the value of the orgUnitHSAId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgUnitHSAId(String value) {
        this.orgUnitHSAId = value;
    }

    /**
     * Gets the value of the orgUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgUnitName() {
        return orgUnitName;
    }

    /**
     * Sets the value of the orgUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgUnitName(String value) {
        this.orgUnitName = value;
    }

    /**
     * Gets the value of the orgUnitTelecom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgUnitTelecom() {
        return orgUnitTelecom;
    }

    /**
     * Sets the value of the orgUnitTelecom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgUnitTelecom(String value) {
        this.orgUnitTelecom = value;
    }

    /**
     * Gets the value of the orgUnitEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgUnitEmail() {
        return orgUnitEmail;
    }

    /**
     * Sets the value of the orgUnitEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgUnitEmail(String value) {
        this.orgUnitEmail = value;
    }

    /**
     * Gets the value of the orgUnitAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgUnitAddress() {
        return orgUnitAddress;
    }

    /**
     * Sets the value of the orgUnitAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgUnitAddress(String value) {
        this.orgUnitAddress = value;
    }

    /**
     * Gets the value of the orgUnitLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgUnitLocation() {
        return orgUnitLocation;
    }

    /**
     * Sets the value of the orgUnitLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgUnitLocation(String value) {
        this.orgUnitLocation = value;
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
