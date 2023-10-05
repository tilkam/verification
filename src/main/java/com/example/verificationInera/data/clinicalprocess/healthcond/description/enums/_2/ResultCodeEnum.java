
package com.example.verificationInera.data.clinicalprocess.healthcond.description.enums._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultCodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ResultCodeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *     &lt;enumeration value="INFO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResultCodeEnum", namespace = "urn:riv:clinicalprocess:healthcond:description:enums:2")
@XmlEnum
public enum ResultCodeEnum {

    OK,
    ERROR,
    INFO;

    public String value() {
        return name();
    }

    public static ResultCodeEnum fromValue(String v) {
        return valueOf(v);
    }

}
