
package com.example.verificationInera.data.clinicalprocess.healthcond.description._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for HyperSensitivityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HyperSensitivityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="typeOfHypersensitivity" type="{urn:riv:clinicalprocess:healthcond:description:2}CVType" minOccurs="0"/&gt;
 *         &lt;element name="degreeOfSeverity" type="{urn:riv:clinicalprocess:healthcond:description:2}CVType" minOccurs="0"/&gt;
 *         &lt;element name="degreeOfCertainty" type="{urn:riv:clinicalprocess:healthcond:description:2}CVType" minOccurs="0"/&gt;
 *         &lt;element name="pharmaceuticalHypersensitivity" type="{urn:riv:clinicalprocess:healthcond:description:2}PharmaceuticalHypersensitivityType" minOccurs="0"/&gt;
 *         &lt;element name="otherHypersensitivity" type="{urn:riv:clinicalprocess:healthcond:description:2}OtherHypersensitivityType" minOccurs="0"/&gt;
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
@XmlType(name = "HyperSensitivityType", propOrder = {
    "typeOfHypersensitivity",
    "degreeOfSeverity",
    "degreeOfCertainty",
    "pharmaceuticalHypersensitivity",
    "otherHypersensitivity",
    "any"
})
public class HyperSensitivityType {

    protected CVType typeOfHypersensitivity;
    protected CVType degreeOfSeverity;
    protected CVType degreeOfCertainty;
    protected PharmaceuticalHypersensitivityType pharmaceuticalHypersensitivity;
    protected OtherHypersensitivityType otherHypersensitivity;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the typeOfHypersensitivity property.
     * 
     * @return
     *     possible object is
     *     {@link CVType }
     *     
     */
    public CVType getTypeOfHypersensitivity() {
        return typeOfHypersensitivity;
    }

    /**
     * Sets the value of the typeOfHypersensitivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVType }
     *     
     */
    public void setTypeOfHypersensitivity(CVType value) {
        this.typeOfHypersensitivity = value;
    }

    /**
     * Gets the value of the degreeOfSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link CVType }
     *     
     */
    public CVType getDegreeOfSeverity() {
        return degreeOfSeverity;
    }

    /**
     * Sets the value of the degreeOfSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVType }
     *     
     */
    public void setDegreeOfSeverity(CVType value) {
        this.degreeOfSeverity = value;
    }

    /**
     * Gets the value of the degreeOfCertainty property.
     * 
     * @return
     *     possible object is
     *     {@link CVType }
     *     
     */
    public CVType getDegreeOfCertainty() {
        return degreeOfCertainty;
    }

    /**
     * Sets the value of the degreeOfCertainty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVType }
     *     
     */
    public void setDegreeOfCertainty(CVType value) {
        this.degreeOfCertainty = value;
    }

    /**
     * Gets the value of the pharmaceuticalHypersensitivity property.
     * 
     * @return
     *     possible object is
     *     {@link PharmaceuticalHypersensitivityType }
     *     
     */
    public PharmaceuticalHypersensitivityType getPharmaceuticalHypersensitivity() {
        return pharmaceuticalHypersensitivity;
    }

    /**
     * Sets the value of the pharmaceuticalHypersensitivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PharmaceuticalHypersensitivityType }
     *     
     */
    public void setPharmaceuticalHypersensitivity(PharmaceuticalHypersensitivityType value) {
        this.pharmaceuticalHypersensitivity = value;
    }

    /**
     * Gets the value of the otherHypersensitivity property.
     * 
     * @return
     *     possible object is
     *     {@link OtherHypersensitivityType }
     *     
     */
    public OtherHypersensitivityType getOtherHypersensitivity() {
        return otherHypersensitivity;
    }

    /**
     * Sets the value of the otherHypersensitivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherHypersensitivityType }
     *     
     */
    public void setOtherHypersensitivity(OtherHypersensitivityType value) {
        this.otherHypersensitivity = value;
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
