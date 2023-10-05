
package com.example.verificationInera.data.clinicalprocess.healthcond.description._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CareDocumentationBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CareDocumentationBodyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clinicalDocumentNote" type="{urn:riv:clinicalprocess:healthcond:description:2}ClinicalDocumentNoteType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CareDocumentationBodyType", propOrder = {
    "clinicalDocumentNote"
})
public class CareDocumentationBodyType {

    @XmlElement(required = true)
    protected ClinicalDocumentNoteType clinicalDocumentNote;

    /**
     * Gets the value of the clinicalDocumentNote property.
     * 
     * @return
     *     possible object is
     *     {@link ClinicalDocumentNoteType }
     *     
     */
    public ClinicalDocumentNoteType getClinicalDocumentNote() {
        return clinicalDocumentNote;
    }

    /**
     * Sets the value of the clinicalDocumentNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClinicalDocumentNoteType }
     *     
     */
    public void setClinicalDocumentNote(ClinicalDocumentNoteType value) {
        this.clinicalDocumentNote = value;
    }

}
