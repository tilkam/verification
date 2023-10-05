
package com.example.verificationInera.data.clinicalprocess.healthcond.description.getcaredocumentationresponder._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;

import com.example.verificationInera.data.clinicalprocess.healthcond.description._2.CareDocumentationType;
import com.example.verificationInera.data.clinicalprocess.healthcond.description._2.Result;


/**
 * 
 * 				careDocumentation: 
 * 					De vårddokument som matchar begäran.
 * 			
 * 
 * <p>Java class for GetCareDocumentationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCareDocumentationResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="careDocumentation" type="{urn:riv:clinicalprocess:healthcond:description:2}CareDocumentationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:riv:clinicalprocess:healthcond:description:2.1}result" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCareDocumentationResponseType", propOrder = {
    "careDocumentation",
    "result"
})
@XmlRootElement(name = "CareDocumentationResponseType")
public class GetCareDocumentationResponseType {

    protected List<CareDocumentationType> careDocumentation;
    @XmlElement(namespace = "urn:riv:clinicalprocess:healthcond:description:2.1")
    protected Result result;

    /**
     * Gets the value of the careDocumentation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the careDocumentation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCareDocumentation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CareDocumentationType }
     * 
     * 
     */
    public List<CareDocumentationType> getCareDocumentation() {
        if (careDocumentation == null) {
            careDocumentation = new ArrayList<CareDocumentationType>();
        }
        return this.careDocumentation;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setResult(Result value) {
        this.result = value;
    }

}
