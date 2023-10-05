
package com.example.verificationInera.data.clinicalprocess.healthcond.description.enums._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorCodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ErrorCodeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INVALID_REQUEST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ErrorCodeEnum", namespace = "urn:riv:clinicalprocess:healthcond:description:enums:2")
@XmlEnum
public enum ErrorCodeEnum {

    INVALID_REQUEST;

    public String value() {
        return name();
    }

    public static ErrorCodeEnum fromValue(String v) {
        return valueOf(v);
    }

}
