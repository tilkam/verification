
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
 * <p>Java class for AlertInformationBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertInformationBodyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="typeOfAlertInformation" type="{urn:riv:clinicalprocess:healthcond:description:2}CVType"/&gt;
 *         &lt;element name="ascertainedDate" type="{urn:riv:clinicalprocess:healthcond:description:2}DateType" minOccurs="0"/&gt;
 *         &lt;element name="verifiedTime" type="{urn:riv:clinicalprocess:healthcond:description:2}TimeStampType" minOccurs="0"/&gt;
 *         &lt;element name="validityTimePeriod" type="{urn:riv:clinicalprocess:healthcond:description:2}TimePeriodType"/&gt;
 *         &lt;element name="alertInformationComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="obsoleteTime" type="{urn:riv:clinicalprocess:healthcond:description:2}TimeStampType" minOccurs="0"/&gt;
 *         &lt;element name="obsoleteComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hypersensitivity" type="{urn:riv:clinicalprocess:healthcond:description:2}HyperSensitivityType" minOccurs="0"/&gt;
 *         &lt;element name="seriousDisease" type="{urn:riv:clinicalprocess:healthcond:description:2}SeriousDiseaseType" minOccurs="0"/&gt;
 *         &lt;element name="treatment" type="{urn:riv:clinicalprocess:healthcond:description:2}TreatmentType" minOccurs="0"/&gt;
 *         &lt;element name="communicableDisease" type="{urn:riv:clinicalprocess:healthcond:description:2}CommunicableDiseaseType" minOccurs="0"/&gt;
 *         &lt;element name="restrictionOfCare" type="{urn:riv:clinicalprocess:healthcond:description:2}RestrictionOfCareType" minOccurs="0"/&gt;
 *         &lt;element name="unstructuredAlertInformation" type="{urn:riv:clinicalprocess:healthcond:description:2}UnstructuredAlertInformationType" minOccurs="0"/&gt;
 *         &lt;element name="relatedAlertInformation" type="{urn:riv:clinicalprocess:healthcond:description:2}RelatedAlertInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "AlertInformationBodyType", propOrder = {
    "typeOfAlertInformation",
    "ascertainedDate",
    "verifiedTime",
    "validityTimePeriod",
    "alertInformationComment",
    "obsoleteTime",
    "obsoleteComment",
    "hypersensitivity",
    "seriousDisease",
    "treatment",
    "communicableDisease",
    "restrictionOfCare",
    "unstructuredAlertInformation",
    "relatedAlertInformation",
    "any"
})
public class AlertInformationBodyType {

    @XmlElement(required = true)
    protected CVType typeOfAlertInformation;
    protected String ascertainedDate;
    protected String verifiedTime;
    @XmlElement(required = true)
    protected TimePeriodType validityTimePeriod;
    protected String alertInformationComment;
    protected String obsoleteTime;
    protected String obsoleteComment;
    protected HyperSensitivityType hypersensitivity;
    protected SeriousDiseaseType seriousDisease;
    protected TreatmentType treatment;
    protected CommunicableDiseaseType communicableDisease;
    protected RestrictionOfCareType restrictionOfCare;
    protected UnstructuredAlertInformationType unstructuredAlertInformation;
    protected List<RelatedAlertInformationType> relatedAlertInformation;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the typeOfAlertInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CVType }
     *     
     */
    public CVType getTypeOfAlertInformation() {
        return typeOfAlertInformation;
    }

    /**
     * Sets the value of the typeOfAlertInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVType }
     *     
     */
    public void setTypeOfAlertInformation(CVType value) {
        this.typeOfAlertInformation = value;
    }

    /**
     * Gets the value of the ascertainedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAscertainedDate() {
        return ascertainedDate;
    }

    /**
     * Sets the value of the ascertainedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAscertainedDate(String value) {
        this.ascertainedDate = value;
    }

    /**
     * Gets the value of the verifiedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifiedTime() {
        return verifiedTime;
    }

    /**
     * Sets the value of the verifiedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifiedTime(String value) {
        this.verifiedTime = value;
    }

    /**
     * Gets the value of the validityTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getValidityTimePeriod() {
        return validityTimePeriod;
    }

    /**
     * Sets the value of the validityTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setValidityTimePeriod(TimePeriodType value) {
        this.validityTimePeriod = value;
    }

    /**
     * Gets the value of the alertInformationComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertInformationComment() {
        return alertInformationComment;
    }

    /**
     * Sets the value of the alertInformationComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertInformationComment(String value) {
        this.alertInformationComment = value;
    }

    /**
     * Gets the value of the obsoleteTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsoleteTime() {
        return obsoleteTime;
    }

    /**
     * Sets the value of the obsoleteTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsoleteTime(String value) {
        this.obsoleteTime = value;
    }

    /**
     * Gets the value of the obsoleteComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsoleteComment() {
        return obsoleteComment;
    }

    /**
     * Sets the value of the obsoleteComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsoleteComment(String value) {
        this.obsoleteComment = value;
    }

    /**
     * Gets the value of the hypersensitivity property.
     * 
     * @return
     *     possible object is
     *     {@link HyperSensitivityType }
     *     
     */
    public HyperSensitivityType getHypersensitivity() {
        return hypersensitivity;
    }

    /**
     * Sets the value of the hypersensitivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link HyperSensitivityType }
     *     
     */
    public void setHypersensitivity(HyperSensitivityType value) {
        this.hypersensitivity = value;
    }

    /**
     * Gets the value of the seriousDisease property.
     * 
     * @return
     *     possible object is
     *     {@link SeriousDiseaseType }
     *     
     */
    public SeriousDiseaseType getSeriousDisease() {
        return seriousDisease;
    }

    /**
     * Sets the value of the seriousDisease property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeriousDiseaseType }
     *     
     */
    public void setSeriousDisease(SeriousDiseaseType value) {
        this.seriousDisease = value;
    }

    /**
     * Gets the value of the treatment property.
     * 
     * @return
     *     possible object is
     *     {@link TreatmentType }
     *     
     */
    public TreatmentType getTreatment() {
        return treatment;
    }

    /**
     * Sets the value of the treatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TreatmentType }
     *     
     */
    public void setTreatment(TreatmentType value) {
        this.treatment = value;
    }

    /**
     * Gets the value of the communicableDisease property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicableDiseaseType }
     *     
     */
    public CommunicableDiseaseType getCommunicableDisease() {
        return communicableDisease;
    }

    /**
     * Sets the value of the communicableDisease property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicableDiseaseType }
     *     
     */
    public void setCommunicableDisease(CommunicableDiseaseType value) {
        this.communicableDisease = value;
    }

    /**
     * Gets the value of the restrictionOfCare property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionOfCareType }
     *     
     */
    public RestrictionOfCareType getRestrictionOfCare() {
        return restrictionOfCare;
    }

    /**
     * Sets the value of the restrictionOfCare property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionOfCareType }
     *     
     */
    public void setRestrictionOfCare(RestrictionOfCareType value) {
        this.restrictionOfCare = value;
    }

    /**
     * Gets the value of the unstructuredAlertInformation property.
     * 
     * @return
     *     possible object is
     *     {@link UnstructuredAlertInformationType }
     *     
     */
    public UnstructuredAlertInformationType getUnstructuredAlertInformation() {
        return unstructuredAlertInformation;
    }

    /**
     * Sets the value of the unstructuredAlertInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnstructuredAlertInformationType }
     *     
     */
    public void setUnstructuredAlertInformation(UnstructuredAlertInformationType value) {
        this.unstructuredAlertInformation = value;
    }

    /**
     * Gets the value of the relatedAlertInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedAlertInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedAlertInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedAlertInformationType }
     * 
     * 
     */
    public List<RelatedAlertInformationType> getRelatedAlertInformation() {
        if (relatedAlertInformation == null) {
            relatedAlertInformation = new ArrayList<RelatedAlertInformationType>();
        }
        return this.relatedAlertInformation;
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
