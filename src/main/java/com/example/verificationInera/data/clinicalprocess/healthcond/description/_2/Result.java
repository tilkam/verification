
package com.example.verificationInera.data.clinicalprocess.healthcond.description._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.example.verificationInera.data.clinicalprocess.healthcond.description.enums._2.ErrorCodeEnum;
import com.example.verificationInera.data.clinicalprocess.healthcond.description.enums._2.ResultCodeEnum;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultCode" type="{urn:riv:clinicalprocess:healthcond:description:enums:2}ResultCodeEnum"/&gt;
 *         &lt;element name="errorCode" type="{urn:riv:clinicalprocess:healthcond:description:enums:2}ErrorCodeEnum" minOccurs="0"/&gt;
 *         &lt;element name="logId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="subCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "resultCode",
    "errorCode",
    "logId",
    "subCode",
    "message"
})
@XmlRootElement(name = "result", namespace = "urn:riv:clinicalprocess:healthcond:description:2.1")
public class Result {

    @XmlElement(namespace = "urn:riv:clinicalprocess:healthcond:description:2.1", required = true)
    @XmlSchemaType(name = "string")
    protected ResultCodeEnum resultCode;
    @XmlElement(namespace = "urn:riv:clinicalprocess:healthcond:description:2.1")
    @XmlSchemaType(name = "string")
    protected ErrorCodeEnum errorCode;
    @XmlElement(namespace = "urn:riv:clinicalprocess:healthcond:description:2.1", required = true)
    protected String logId;
    @XmlElement(namespace = "urn:riv:clinicalprocess:healthcond:description:2.1")
    protected String subCode;
    @XmlElement(namespace = "urn:riv:clinicalprocess:healthcond:description:2.1")
    protected String message;

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link ResultCodeEnum }
     *     
     */
    public ResultCodeEnum getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultCodeEnum }
     *     
     */
    public void setResultCode(ResultCodeEnum value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorCodeEnum }
     *     
     */
    public ErrorCodeEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorCodeEnum }
     *     
     */
    public void setErrorCode(ErrorCodeEnum value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the logId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogId() {
        return logId;
    }

    /**
     * Sets the value of the logId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogId(String value) {
        this.logId = value;
    }

    /**
     * Gets the value of the subCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCode() {
        return subCode;
    }

    /**
     * Sets the value of the subCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCode(String value) {
        this.subCode = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
