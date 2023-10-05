
package com.example.verificationInera.data.clinicalprocess.healthcond.description.getcaredocumentationresponder._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;

import com.example.verificationInera.data.clinicalprocess.healthcond.description._2.DatePeriodType;
import com.example.verificationInera.data.clinicalprocess.healthcond.description._2.PersonIdType;
import org.w3c.dom.Element;


/**
 * <p>Java class for GetCareDocumentationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCareDocumentationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="careUnitHSAid" type="{urn:riv:clinicalprocess:healthcond:description:2}HSAIdType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="patientId" type="{urn:riv:clinicalprocess:healthcond:description:2}PersonIdType"/&gt;
 *         &lt;element name="timePeriod" type="{urn:riv:clinicalprocess:healthcond:description:2}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="sourceSystemHSAid" type="{urn:riv:clinicalprocess:healthcond:description:2}HSAIdType" minOccurs="0"/&gt;
 *         &lt;element name="careContactId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "GetCareDocumentationType", propOrder = {
    "careUnitHSAid",
    "patientId",
    "timePeriod",
    "sourceSystemHSAid",
    "careContactId",
    "any"
})
@XmlRootElement(name = "GetCareDocumentation")
public class GetCareDocumentationType {

    protected List<String> careUnitHSAid;
    @XmlElement(required = true)
    protected PersonIdType patientId;
    protected DatePeriodType timePeriod;
    protected String sourceSystemHSAid;
    protected List<String> careContactId;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the careUnitHSAid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the careUnitHSAid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCareUnitHSAid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCareUnitHSAid() {
        if (careUnitHSAid == null) {
            careUnitHSAid = new ArrayList<String>();
        }
        return this.careUnitHSAid;
    }

    /**
     * Gets the value of the patientId property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdType }
     *     
     */
    public PersonIdType getPatientId() {
        return patientId;
    }

    /**
     * Sets the value of the patientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdType }
     *     
     */
    public void setPatientId(PersonIdType value) {
        this.patientId = value;
    }

    /**
     * Gets the value of the timePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setTimePeriod(DatePeriodType value) {
        this.timePeriod = value;
    }

    /**
     * Gets the value of the sourceSystemHSAid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystemHSAid() {
        return sourceSystemHSAid;
    }

    /**
     * Sets the value of the sourceSystemHSAid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystemHSAid(String value) {
        this.sourceSystemHSAid = value;
    }

    /**
     * Gets the value of the careContactId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the careContactId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCareContactId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCareContactId() {
        if (careContactId == null) {
            careContactId = new ArrayList<String>();
        }
        return this.careContactId;
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
