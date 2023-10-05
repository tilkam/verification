
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
 * <p>Java class for UnstructuredAlertInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnstructuredAlertInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unstructuredAlertInformationHeading" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="unstructuredAlertInformationContent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "UnstructuredAlertInformationType", propOrder = {
    "unstructuredAlertInformationHeading",
    "unstructuredAlertInformationContent",
    "any"
})
public class UnstructuredAlertInformationType {

    @XmlElement(required = true)
    protected String unstructuredAlertInformationHeading;
    @XmlElement(required = true)
    protected String unstructuredAlertInformationContent;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the unstructuredAlertInformationHeading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnstructuredAlertInformationHeading() {
        return unstructuredAlertInformationHeading;
    }

    /**
     * Sets the value of the unstructuredAlertInformationHeading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnstructuredAlertInformationHeading(String value) {
        this.unstructuredAlertInformationHeading = value;
    }

    /**
     * Gets the value of the unstructuredAlertInformationContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnstructuredAlertInformationContent() {
        return unstructuredAlertInformationContent;
    }

    /**
     * Sets the value of the unstructuredAlertInformationContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnstructuredAlertInformationContent(String value) {
        this.unstructuredAlertInformationContent = value;
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
