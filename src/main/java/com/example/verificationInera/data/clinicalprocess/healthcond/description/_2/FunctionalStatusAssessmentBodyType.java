
package com.example.verificationInera.data.clinicalprocess.healthcond.description._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;
import com.example.verificationInera.data.clinicalprocess.healthcond.description.enums._2.AssessmentCategoryEnum;


/**
 * <p>Java class for FunctionalStatusAssessmentBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctionalStatusAssessmentBodyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="assessmentCategory" type="{urn:riv:clinicalprocess:healthcond:description:enums:2}AssessmentCategoryEnum"/&gt;
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="padl" type="{urn:riv:clinicalprocess:healthcond:description:2}PADLType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="disability" type="{urn:riv:clinicalprocess:healthcond:description:2}DisabilityType" minOccurs="0"/&gt;
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
@XmlType(name = "FunctionalStatusAssessmentBodyType", propOrder = {
    "assessmentCategory",
    "comment",
    "padl",
    "disability",
    "any"
})
public class FunctionalStatusAssessmentBodyType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AssessmentCategoryEnum assessmentCategory;
    protected String comment;
    protected List<PADLType> padl;
    protected DisabilityType disability;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the assessmentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentCategoryEnum }
     *     
     */
    public AssessmentCategoryEnum getAssessmentCategory() {
        return assessmentCategory;
    }

    /**
     * Sets the value of the assessmentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentCategoryEnum }
     *     
     */
    public void setAssessmentCategory(AssessmentCategoryEnum value) {
        this.assessmentCategory = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the padl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the padl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPadl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PADLType }
     * 
     * 
     */
    public List<PADLType> getPadl() {
        if (padl == null) {
            padl = new ArrayList<PADLType>();
        }
        return this.padl;
    }

    /**
     * Gets the value of the disability property.
     * 
     * @return
     *     possible object is
     *     {@link DisabilityType }
     *     
     */
    public DisabilityType getDisability() {
        return disability;
    }

    /**
     * Sets the value of the disability property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisabilityType }
     *     
     */
    public void setDisability(DisabilityType value) {
        this.disability = value;
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
