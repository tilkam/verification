
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
 * <p>Java class for AlertInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertInformationHeader" type="{urn:riv:clinicalprocess:healthcond:description:2}PatientSummaryHeaderType"/&gt;
 *         &lt;element name="alertInformationBody" type="{urn:riv:clinicalprocess:healthcond:description:2}AlertInformationBodyType"/&gt;
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
@XmlType(name = "AlertInformationType", propOrder = {
    "alertInformationHeader",
    "alertInformationBody",
    "any"
})
public class AlertInformationType {

    @XmlElement(required = true)
    protected PatientSummaryHeaderType alertInformationHeader;
    @XmlElement(required = true)
    protected AlertInformationBodyType alertInformationBody;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the alertInformationHeader property.
     * 
     * @return
     *     possible object is
     *     {@link PatientSummaryHeaderType }
     *     
     */
    public PatientSummaryHeaderType getAlertInformationHeader() {
        return alertInformationHeader;
    }

    /**
     * Sets the value of the alertInformationHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientSummaryHeaderType }
     *     
     */
    public void setAlertInformationHeader(PatientSummaryHeaderType value) {
        this.alertInformationHeader = value;
    }

    /**
     * Gets the value of the alertInformationBody property.
     * 
     * @return
     *     possible object is
     *     {@link AlertInformationBodyType }
     *     
     */
    public AlertInformationBodyType getAlertInformationBody() {
        return alertInformationBody;
    }

    /**
     * Sets the value of the alertInformationBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertInformationBodyType }
     *     
     */
    public void setAlertInformationBody(AlertInformationBodyType value) {
        this.alertInformationBody = value;
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
