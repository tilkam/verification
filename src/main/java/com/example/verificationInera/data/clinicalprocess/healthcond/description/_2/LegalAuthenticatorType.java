
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
 * <p>Java class for LegalAuthenticatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalAuthenticatorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="signatureTime" type="{urn:riv:clinicalprocess:healthcond:description:2}TimeStampType"/&gt;
 *         &lt;element name="legalAuthenticatorHSAId" type="{urn:riv:clinicalprocess:healthcond:description:2}HSAIdType" minOccurs="0"/&gt;
 *         &lt;element name="legalAuthenticatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "LegalAuthenticatorType", propOrder = {
    "signatureTime",
    "legalAuthenticatorHSAId",
    "legalAuthenticatorName",
    "any"
})
public class LegalAuthenticatorType {

    @XmlElement(required = true)
    protected String signatureTime;
    protected String legalAuthenticatorHSAId;
    protected String legalAuthenticatorName;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the signatureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureTime() {
        return signatureTime;
    }

    /**
     * Sets the value of the signatureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureTime(String value) {
        this.signatureTime = value;
    }

    /**
     * Gets the value of the legalAuthenticatorHSAId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalAuthenticatorHSAId() {
        return legalAuthenticatorHSAId;
    }

    /**
     * Sets the value of the legalAuthenticatorHSAId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalAuthenticatorHSAId(String value) {
        this.legalAuthenticatorHSAId = value;
    }

    /**
     * Gets the value of the legalAuthenticatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalAuthenticatorName() {
        return legalAuthenticatorName;
    }

    /**
     * Sets the value of the legalAuthenticatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalAuthenticatorName(String value) {
        this.legalAuthenticatorName = value;
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
