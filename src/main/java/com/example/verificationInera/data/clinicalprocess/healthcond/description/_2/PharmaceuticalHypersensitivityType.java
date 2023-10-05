
package com.example.verificationInera.data.clinicalprocess.healthcond.description._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for PharmaceuticalHypersensitivityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PharmaceuticalHypersensitivityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="atcSubstance" type="{urn:riv:clinicalprocess:healthcond:description:2}CVType" minOccurs="0"/&gt;
 *         &lt;element name="nonATCSubstance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nonATCSubstanceComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pharmaceuticalProductId" type="{urn:riv:clinicalprocess:healthcond:description:2}CVType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "PharmaceuticalHypersensitivityType", propOrder = {
    "atcSubstance",
    "nonATCSubstance",
    "nonATCSubstanceComment",
    "pharmaceuticalProductId",
    "any"
})
public class PharmaceuticalHypersensitivityType {

    protected CVType atcSubstance;
    protected String nonATCSubstance;
    protected String nonATCSubstanceComment;
    protected List<CVType> pharmaceuticalProductId;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the atcSubstance property.
     * 
     * @return
     *     possible object is
     *     {@link CVType }
     *     
     */
    public CVType getAtcSubstance() {
        return atcSubstance;
    }

    /**
     * Sets the value of the atcSubstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVType }
     *     
     */
    public void setAtcSubstance(CVType value) {
        this.atcSubstance = value;
    }

    /**
     * Gets the value of the nonATCSubstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonATCSubstance() {
        return nonATCSubstance;
    }

    /**
     * Sets the value of the nonATCSubstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonATCSubstance(String value) {
        this.nonATCSubstance = value;
    }

    /**
     * Gets the value of the nonATCSubstanceComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonATCSubstanceComment() {
        return nonATCSubstanceComment;
    }

    /**
     * Sets the value of the nonATCSubstanceComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonATCSubstanceComment(String value) {
        this.nonATCSubstanceComment = value;
    }

    /**
     * Gets the value of the pharmaceuticalProductId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pharmaceuticalProductId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPharmaceuticalProductId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CVType }
     * 
     * 
     */
    public List<CVType> getPharmaceuticalProductId() {
        if (pharmaceuticalProductId == null) {
            pharmaceuticalProductId = new ArrayList<CVType>();
        }
        return this.pharmaceuticalProductId;
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
