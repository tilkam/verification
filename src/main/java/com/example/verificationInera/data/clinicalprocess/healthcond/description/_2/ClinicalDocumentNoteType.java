
package com.example.verificationInera.data.clinicalprocess.healthcond.description._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.example.verificationInera.data.clinicalprocess.healthcond.description.enums._2.ClinicalDocumentNoteCodeEnum;
import com.example.verificationInera.data.clinicalprocess.healthcond.description.enums._2.ClinicalDocumentTypeCodeEnum;


/**
 * <p>Java class for ClinicalDocumentNoteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClinicalDocumentNoteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clinicalDocumentNoteCode" type="{urn:riv:clinicalprocess:healthcond:description:enums:2}ClinicalDocumentNoteCodeEnum" minOccurs="0"/&gt;
 *         &lt;element name="clinicalDocumentTypeCode" type="{urn:riv:clinicalprocess:healthcond:description:enums:2}ClinicalDocumentTypeCodeEnum" minOccurs="0"/&gt;
 *         &lt;element name="clinicalDocumentNoteTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clinicalDocumentNoteText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="multimediaEntry" type="{urn:riv:clinicalprocess:healthcond:description:2}MultimediaType" minOccurs="0"/&gt;
 *         &lt;element name="dissentintOpinion" type="{urn:riv:clinicalprocess:healthcond:description:2}DissentingOpinionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClinicalDocumentNoteType", propOrder = {
    "clinicalDocumentNoteCode",
    "clinicalDocumentTypeCode",
    "clinicalDocumentNoteTitle",
    "clinicalDocumentNoteText",
    "multimediaEntry",
    "dissentintOpinion"
})
public class ClinicalDocumentNoteType {

    @XmlSchemaType(name = "string")
    protected ClinicalDocumentNoteCodeEnum clinicalDocumentNoteCode;
    @XmlSchemaType(name = "string")
    protected ClinicalDocumentTypeCodeEnum clinicalDocumentTypeCode;
    protected String clinicalDocumentNoteTitle;
    protected String clinicalDocumentNoteText;
    protected MultimediaType multimediaEntry;
    protected List<DissentingOpinionType> dissentintOpinion;

    /**
     * Gets the value of the clinicalDocumentNoteCode property.
     * 
     * @return
     *     possible object is
     *     {@link ClinicalDocumentNoteCodeEnum }
     *     
     */
    public ClinicalDocumentNoteCodeEnum getClinicalDocumentNoteCode() {
        return clinicalDocumentNoteCode;
    }

    /**
     * Sets the value of the clinicalDocumentNoteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClinicalDocumentNoteCodeEnum }
     *     
     */
    public void setClinicalDocumentNoteCode(ClinicalDocumentNoteCodeEnum value) {
        this.clinicalDocumentNoteCode = value;
    }

    /**
     * Gets the value of the clinicalDocumentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ClinicalDocumentTypeCodeEnum }
     *     
     */
    public ClinicalDocumentTypeCodeEnum getClinicalDocumentTypeCode() {
        return clinicalDocumentTypeCode;
    }

    /**
     * Sets the value of the clinicalDocumentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClinicalDocumentTypeCodeEnum }
     *     
     */
    public void setClinicalDocumentTypeCode(ClinicalDocumentTypeCodeEnum value) {
        this.clinicalDocumentTypeCode = value;
    }

    /**
     * Gets the value of the clinicalDocumentNoteTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClinicalDocumentNoteTitle() {
        return clinicalDocumentNoteTitle;
    }

    /**
     * Sets the value of the clinicalDocumentNoteTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClinicalDocumentNoteTitle(String value) {
        this.clinicalDocumentNoteTitle = value;
    }

    /**
     * Gets the value of the clinicalDocumentNoteText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClinicalDocumentNoteText() {
        return clinicalDocumentNoteText;
    }

    /**
     * Sets the value of the clinicalDocumentNoteText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClinicalDocumentNoteText(String value) {
        this.clinicalDocumentNoteText = value;
    }

    /**
     * Gets the value of the multimediaEntry property.
     * 
     * @return
     *     possible object is
     *     {@link MultimediaType }
     *     
     */
    public MultimediaType getMultimediaEntry() {
        return multimediaEntry;
    }

    /**
     * Sets the value of the multimediaEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultimediaType }
     *     
     */
    public void setMultimediaEntry(MultimediaType value) {
        this.multimediaEntry = value;
    }

    /**
     * Gets the value of the dissentintOpinion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dissentintOpinion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDissentintOpinion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DissentingOpinionType }
     * 
     * 
     */
    public List<DissentingOpinionType> getDissentintOpinion() {
        if (dissentintOpinion == null) {
            dissentintOpinion = new ArrayList<DissentingOpinionType>();
        }
        return this.dissentintOpinion;
    }

}
