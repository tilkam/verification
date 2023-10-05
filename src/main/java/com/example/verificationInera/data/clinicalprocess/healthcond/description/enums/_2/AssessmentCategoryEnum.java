
package com.example.verificationInera.data.clinicalprocess.healthcond.description.enums._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssessmentCategoryEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AssessmentCategoryEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="pad-pad"/&gt;
 *     &lt;enumeration value="fun-fun"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssessmentCategoryEnum", namespace = "urn:riv:clinicalprocess:healthcond:description:enums:2")
@XmlEnum
public enum AssessmentCategoryEnum {


    /**
     * PADL-bedömning
     * 
     */
    @XmlEnumValue("pad-pad")
    PAD_PAD("pad-pad"),

    /**
     * funktionsnedsättningsbedömningar
     * 
     */
    @XmlEnumValue("fun-fun")
    FUN_FUN("fun-fun");
    private final String value;

    AssessmentCategoryEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssessmentCategoryEnum fromValue(String v) {
        for (AssessmentCategoryEnum c: AssessmentCategoryEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
