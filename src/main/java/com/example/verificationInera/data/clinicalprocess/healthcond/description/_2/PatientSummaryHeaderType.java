
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
 * <p>Java class for PatientSummaryHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PatientSummaryHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sourceSystemHSAId" type="{urn:riv:clinicalprocess:healthcond:description:2}HSAIdType"/&gt;
 *         &lt;element name="documentTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="documentTime" type="{urn:riv:clinicalprocess:healthcond:description:2}TimeStampType" minOccurs="0"/&gt;
 *         &lt;element name="patientId" type="{urn:riv:clinicalprocess:healthcond:description:2}PersonIdType"/&gt;
 *         &lt;element name="accountableHealthcareProfessional" type="{urn:riv:clinicalprocess:healthcond:description:2}HealthcareProfessionalType"/&gt;
 *         &lt;element name="legalAuthenticator" type="{urn:riv:clinicalprocess:healthcond:description:2}LegalAuthenticatorType" minOccurs="0"/&gt;
 *         &lt;element name="approvedForPatient" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="careContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nullified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="nullifiedReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "PatientSummaryHeaderType", propOrder = {
    "documentId",
    "sourceSystemHSAId",
    "documentTitle",
    "documentTime",
    "patientId",
    "accountableHealthcareProfessional",
    "legalAuthenticator",
    "approvedForPatient",
    "careContactId",
    "nullified",
    "nullifiedReason",
    "any"
})
public class PatientSummaryHeaderType {

    @XmlElement(required = true)
    protected String documentId;
    @XmlElement(required = true)
    protected String sourceSystemHSAId;
    protected String documentTitle;
    protected String documentTime;
    @XmlElement(required = true)
    protected PersonIdType patientId;
    @XmlElement(required = true)
    protected HealthcareProfessionalType accountableHealthcareProfessional;
    protected LegalAuthenticatorType legalAuthenticator;
    protected boolean approvedForPatient;
    protected String careContactId;
    protected Boolean nullified;
    protected String nullifiedReason;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the sourceSystemHSAId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystemHSAId() {
        return sourceSystemHSAId;
    }

    /**
     * Sets the value of the sourceSystemHSAId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystemHSAId(String value) {
        this.sourceSystemHSAId = value;
    }

    /**
     * Gets the value of the documentTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentTitle() {
        return documentTitle;
    }

    /**
     * Sets the value of the documentTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentTitle(String value) {
        this.documentTitle = value;
    }

    /**
     * Gets the value of the documentTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentTime() {
        return documentTime;
    }

    /**
     * Sets the value of the documentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentTime(String value) {
        this.documentTime = value;
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
     * Gets the value of the accountableHealthcareProfessional property.
     * 
     * @return
     *     possible object is
     *     {@link HealthcareProfessionalType }
     *     
     */
    public HealthcareProfessionalType getAccountableHealthcareProfessional() {
        return accountableHealthcareProfessional;
    }

    /**
     * Sets the value of the accountableHealthcareProfessional property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthcareProfessionalType }
     *     
     */
    public void setAccountableHealthcareProfessional(HealthcareProfessionalType value) {
        this.accountableHealthcareProfessional = value;
    }

    /**
     * Gets the value of the legalAuthenticator property.
     * 
     * @return
     *     possible object is
     *     {@link LegalAuthenticatorType }
     *     
     */
    public LegalAuthenticatorType getLegalAuthenticator() {
        return legalAuthenticator;
    }

    /**
     * Sets the value of the legalAuthenticator property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalAuthenticatorType }
     *     
     */
    public void setLegalAuthenticator(LegalAuthenticatorType value) {
        this.legalAuthenticator = value;
    }

    /**
     * Gets the value of the approvedForPatient property.
     * 
     */
    public boolean isApprovedForPatient() {
        return approvedForPatient;
    }

    /**
     * Sets the value of the approvedForPatient property.
     * 
     */
    public void setApprovedForPatient(boolean value) {
        this.approvedForPatient = value;
    }

    /**
     * Gets the value of the careContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareContactId() {
        return careContactId;
    }

    /**
     * Sets the value of the careContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareContactId(String value) {
        this.careContactId = value;
    }

    /**
     * Gets the value of the nullified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNullified() {
        return nullified;
    }

    /**
     * Sets the value of the nullified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNullified(Boolean value) {
        this.nullified = value;
    }

    /**
     * Gets the value of the nullifiedReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNullifiedReason() {
        return nullifiedReason;
    }

    /**
     * Sets the value of the nullifiedReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNullifiedReason(String value) {
        this.nullifiedReason = value;
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
