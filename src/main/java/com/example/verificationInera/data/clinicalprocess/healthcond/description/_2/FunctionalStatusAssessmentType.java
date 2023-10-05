
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
 * <p>Java class for FunctionalStatusAssessmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctionalStatusAssessmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="functionalStatusAssessmentHeader" type="{urn:riv:clinicalprocess:healthcond:description:2}PatientSummaryHeaderType"/&gt;
 *         &lt;element name="functionalStatusAssessmentBody" type="{urn:riv:clinicalprocess:healthcond:description:2}FunctionalStatusAssessmentBodyType"/&gt;
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
@XmlType(name = "FunctionalStatusAssessmentType", propOrder = {
    "functionalStatusAssessmentHeader",
    "functionalStatusAssessmentBody",
    "any"
})
public class FunctionalStatusAssessmentType {

    @XmlElement(required = true)
    protected PatientSummaryHeaderType functionalStatusAssessmentHeader;
    @XmlElement(required = true)
    protected FunctionalStatusAssessmentBodyType functionalStatusAssessmentBody;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the functionalStatusAssessmentHeader property.
     * 
     * @return
     *     possible object is
     *     {@link PatientSummaryHeaderType }
     *     
     */
    public PatientSummaryHeaderType getFunctionalStatusAssessmentHeader() {
        return functionalStatusAssessmentHeader;
    }

    /**
     * Sets the value of the functionalStatusAssessmentHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientSummaryHeaderType }
     *     
     */
    public void setFunctionalStatusAssessmentHeader(PatientSummaryHeaderType value) {
        this.functionalStatusAssessmentHeader = value;
    }

    /**
     * Gets the value of the functionalStatusAssessmentBody property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionalStatusAssessmentBodyType }
     *     
     */
    public FunctionalStatusAssessmentBodyType getFunctionalStatusAssessmentBody() {
        return functionalStatusAssessmentBody;
    }

    /**
     * Sets the value of the functionalStatusAssessmentBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionalStatusAssessmentBodyType }
     *     
     */
    public void setFunctionalStatusAssessmentBody(FunctionalStatusAssessmentBodyType value) {
        this.functionalStatusAssessmentBody = value;
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
