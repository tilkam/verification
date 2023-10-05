
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
 * <p>Java class for DissentingOpinionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DissentingOpinionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="opinionId" type="{urn:riv:clinicalprocess:healthcond:description:2}IIType" minOccurs="0"/&gt;
 *         &lt;element name="authorTime" type="{urn:riv:clinicalprocess:healthcond:description:2}TimeStampType"/&gt;
 *         &lt;element name="opinion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="personId" type="{urn:riv:clinicalprocess:healthcond:description:2}PersonIdType"/&gt;
 *         &lt;element name="personName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "DissentingOpinionType", propOrder = {
    "opinionId",
    "authorTime",
    "opinion",
    "personId",
    "personName",
    "any"
})
public class DissentingOpinionType {

    protected IIType opinionId;
    @XmlElement(required = true)
    protected String authorTime;
    @XmlElement(required = true)
    protected String opinion;
    @XmlElement(required = true)
    protected PersonIdType personId;
    @XmlElement(required = true)
    protected String personName;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the opinionId property.
     * 
     * @return
     *     possible object is
     *     {@link IIType }
     *     
     */
    public IIType getOpinionId() {
        return opinionId;
    }

    /**
     * Sets the value of the opinionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IIType }
     *     
     */
    public void setOpinionId(IIType value) {
        this.opinionId = value;
    }

    /**
     * Gets the value of the authorTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorTime() {
        return authorTime;
    }

    /**
     * Sets the value of the authorTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorTime(String value) {
        this.authorTime = value;
    }

    /**
     * Gets the value of the opinion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpinion() {
        return opinion;
    }

    /**
     * Sets the value of the opinion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpinion(String value) {
        this.opinion = value;
    }

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdType }
     *     
     */
    public PersonIdType getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdType }
     *     
     */
    public void setPersonId(PersonIdType value) {
        this.personId = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonName(String value) {
        this.personName = value;
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
