
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
 * <p>Java class for TreatmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TreatmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="treatmentDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="treatmentCode" type="{urn:riv:clinicalprocess:healthcond:description:2}CVType" minOccurs="0"/&gt;
 *         &lt;element name="pharmaceuticalTreatment" type="{urn:riv:clinicalprocess:healthcond:description:2}CVType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TreatmentType", propOrder = {
    "treatmentDescription",
    "treatmentCode",
    "pharmaceuticalTreatment",
    "any"
})
public class TreatmentType {

    @XmlElement(required = true)
    protected String treatmentDescription;
    protected CVType treatmentCode;
    protected List<CVType> pharmaceuticalTreatment;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the treatmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreatmentDescription() {
        return treatmentDescription;
    }

    /**
     * Sets the value of the treatmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreatmentDescription(String value) {
        this.treatmentDescription = value;
    }

    /**
     * Gets the value of the treatmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link CVType }
     *     
     */
    public CVType getTreatmentCode() {
        return treatmentCode;
    }

    /**
     * Sets the value of the treatmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVType }
     *     
     */
    public void setTreatmentCode(CVType value) {
        this.treatmentCode = value;
    }

    /**
     * Gets the value of the pharmaceuticalTreatment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pharmaceuticalTreatment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPharmaceuticalTreatment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CVType }
     * 
     * 
     */
    public List<CVType> getPharmaceuticalTreatment() {
        if (pharmaceuticalTreatment == null) {
            pharmaceuticalTreatment = new ArrayList<CVType>();
        }
        return this.pharmaceuticalTreatment;
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
