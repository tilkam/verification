
package com.example.verificationInera.data.clinicalprocess.healthcond.description.enums._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClinicalDocumentTypeCodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ClinicalDocumentTypeCodeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="epi"/&gt;
 *     &lt;enumeration value="int"/&gt;
 *     &lt;enumeration value="dag"/&gt;
 *     &lt;enumeration value="ova"/&gt;
 *     &lt;enumeration value="ovs"/&gt;
 *     &lt;enumeration value="ovr"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClinicalDocumentTypeCodeEnum", namespace = "urn:riv:clinicalprocess:healthcond:description:enums:2")
@XmlEnum
public enum ClinicalDocumentTypeCodeEnum {


    /**
     * Epikris
     * 
     */
    @XmlEnumValue("epi")
    EPI("epi"),

    /**
     * Intagninganteckning
     * 
     */
    @XmlEnumValue("int")
    INT("int"),

    /**
     * Daganteckning
     * 
     */
    @XmlEnumValue("dag")
    DAG("dag"),

    /**
     * Öppenvårdsanteckning
     * 
     */
    @XmlEnumValue("ova")
    OVA("ova"),

    /**
     * Öppenvårdssammanfattning
     * 
     */
    @XmlEnumValue("ovs")
    OVS("ovs"),

    /**
     * Övrigt dokument
     * 
     */
    @XmlEnumValue("ovr")
    OVR("ovr");
    private final String value;

    ClinicalDocumentTypeCodeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClinicalDocumentTypeCodeEnum fromValue(String v) {
        for (ClinicalDocumentTypeCodeEnum c: ClinicalDocumentTypeCodeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
