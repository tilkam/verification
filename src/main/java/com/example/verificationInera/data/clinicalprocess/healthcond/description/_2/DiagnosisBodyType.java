
package com.example.verificationInera.data.clinicalprocess.healthcond.description._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.example.verificationInera.data.clinicalprocess.healthcond.description.enums._2.DiagnosisTypeEnum;
import org.w3c.dom.Element;


/**
 * <p>Java class for DiagnosisBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiagnosisBodyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="typeOfDiagnosis" type="{urn:riv:clinicalprocess:healthcond:description:enums:2}DiagnosisTypeEnum"/&gt;
 *         &lt;element name="chronicDiagnosis" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="diagnosisTime" type="{urn:riv:clinicalprocess:healthcond:description:2}TimeStampType" minOccurs="0"/&gt;
 *         &lt;element name="diagnosisCode" type="{urn:riv:clinicalprocess:healthcond:description:2}CVType" minOccurs="0"/&gt;
 *         &lt;element name="relatedDiagnosis" type="{urn:riv:clinicalprocess:healthcond:description:2}RelatedDiagnosisType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "DiagnosisBodyType", propOrder = {
    "typeOfDiagnosis",
    "chronicDiagnosis",
    "diagnosisTime",
    "diagnosisCode",
    "relatedDiagnosis",
    "any"
})
public class DiagnosisBodyType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DiagnosisTypeEnum typeOfDiagnosis;
    protected Boolean chronicDiagnosis;
    protected String diagnosisTime;
    protected CVType diagnosisCode;
    protected List<RelatedDiagnosisType> relatedDiagnosis;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the typeOfDiagnosis property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosisTypeEnum }
     *     
     */
    public DiagnosisTypeEnum getTypeOfDiagnosis() {
        return typeOfDiagnosis;
    }

    /**
     * Sets the value of the typeOfDiagnosis property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosisTypeEnum }
     *     
     */
    public void setTypeOfDiagnosis(DiagnosisTypeEnum value) {
        this.typeOfDiagnosis = value;
    }

    /**
     * Gets the value of the chronicDiagnosis property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChronicDiagnosis() {
        return chronicDiagnosis;
    }

    /**
     * Sets the value of the chronicDiagnosis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChronicDiagnosis(Boolean value) {
        this.chronicDiagnosis = value;
    }

    /**
     * Gets the value of the diagnosisTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosisTime() {
        return diagnosisTime;
    }

    /**
     * Sets the value of the diagnosisTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosisTime(String value) {
        this.diagnosisTime = value;
    }

    /**
     * Gets the value of the diagnosisCode property.
     * 
     * @return
     *     possible object is
     *     {@link CVType }
     *     
     */
    public CVType getDiagnosisCode() {
        return diagnosisCode;
    }

    /**
     * Sets the value of the diagnosisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVType }
     *     
     */
    public void setDiagnosisCode(CVType value) {
        this.diagnosisCode = value;
    }

    /**
     * Gets the value of the relatedDiagnosis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedDiagnosis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedDiagnosis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedDiagnosisType }
     * 
     * 
     */
    public List<RelatedDiagnosisType> getRelatedDiagnosis() {
        if (relatedDiagnosis == null) {
            relatedDiagnosis = new ArrayList<RelatedDiagnosisType>();
        }
        return this.relatedDiagnosis;
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
