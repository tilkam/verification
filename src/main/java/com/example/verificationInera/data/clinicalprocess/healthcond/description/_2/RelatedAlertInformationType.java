
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
 * <p>Java class for RelatedAlertInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedAlertInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="typeOfAlertInformationRelationship" type="{urn:riv:clinicalprocess:healthcond:description:2}CVType"/&gt;
 *         &lt;element name="relationComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "RelatedAlertInformationType", propOrder = {
    "typeOfAlertInformationRelationship",
    "relationComment",
    "documentId",
    "any"
})
public class RelatedAlertInformationType {

    @XmlElement(required = true)
    protected CVType typeOfAlertInformationRelationship;
    protected String relationComment;
    @XmlElement(required = true)
    protected List<String> documentId;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the typeOfAlertInformationRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link CVType }
     *     
     */
    public CVType getTypeOfAlertInformationRelationship() {
        return typeOfAlertInformationRelationship;
    }

    /**
     * Sets the value of the typeOfAlertInformationRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVType }
     *     
     */
    public void setTypeOfAlertInformationRelationship(CVType value) {
        this.typeOfAlertInformationRelationship = value;
    }

    /**
     * Gets the value of the relationComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationComment() {
        return relationComment;
    }

    /**
     * Sets the value of the relationComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationComment(String value) {
        this.relationComment = value;
    }

    /**
     * Gets the value of the documentId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDocumentId() {
        if (documentId == null) {
            documentId = new ArrayList<String>();
        }
        return this.documentId;
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
