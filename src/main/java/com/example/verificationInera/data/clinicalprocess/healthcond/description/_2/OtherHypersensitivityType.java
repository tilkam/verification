
package com.example.verificationInera.data.clinicalprocess.healthcond.description._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for OtherHypersensitivityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherHypersensitivityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hypersensitivityAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hypersensitivityAgentCode" type="{urn:riv:clinicalprocess:healthcond:description:2}CVType" minOccurs="0"/&gt;
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
@XmlType(name = "OtherHypersensitivityType", propOrder = {
    "hypersensitivityAgent",
    "hypersensitivityAgentCode",
    "any"
})
public class OtherHypersensitivityType {

    protected String hypersensitivityAgent;
    protected CVType hypersensitivityAgentCode;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the hypersensitivityAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHypersensitivityAgent() {
        return hypersensitivityAgent;
    }

    /**
     * Sets the value of the hypersensitivityAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHypersensitivityAgent(String value) {
        this.hypersensitivityAgent = value;
    }

    /**
     * Gets the value of the hypersensitivityAgentCode property.
     * 
     * @return
     *     possible object is
     *     {@link CVType }
     *     
     */
    public CVType getHypersensitivityAgentCode() {
        return hypersensitivityAgentCode;
    }

    /**
     * Sets the value of the hypersensitivityAgentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVType }
     *     
     */
    public void setHypersensitivityAgentCode(CVType value) {
        this.hypersensitivityAgentCode = value;
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
