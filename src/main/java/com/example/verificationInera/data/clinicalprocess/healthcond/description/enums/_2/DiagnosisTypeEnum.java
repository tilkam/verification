
package com.example.verificationInera.data.clinicalprocess.healthcond.description.enums._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiagnosisTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DiagnosisTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Huvuddiagnos"/&gt;
 *     &lt;enumeration value="Bidiagnos"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DiagnosisTypeEnum", namespace = "urn:riv:clinicalprocess:healthcond:description:enums:2")
@XmlEnum
public enum DiagnosisTypeEnum {


    /**
     * Huvuddiagnos
     * 
     */
    @XmlEnumValue("Huvuddiagnos")
    HUVUDDIAGNOS("Huvuddiagnos"),

    /**
     * Bidiagnos
     * 
     */
    @XmlEnumValue("Bidiagnos")
    BIDIAGNOS("Bidiagnos");
    private final String value;

    DiagnosisTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiagnosisTypeEnum fromValue(String v) {
        for (DiagnosisTypeEnum c: DiagnosisTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
